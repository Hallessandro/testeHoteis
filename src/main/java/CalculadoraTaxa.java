import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class CalculadoraTaxa {

    public String getMenorTaxa(TipoCliente tipoCliente, List<LocalDate> datas) {
        //Na ausencia de um bd isso apenas gera data para simulação
        GeradorDataParaTeste geradorDataParaTeste = new GeradorDataParaTeste();
        List<Hotel> hoteis = geradorDataParaTeste.getHoteisParaTeste();

        Hotel hotelMaisBarato = null;
        double menorValor = 0;
        for (Hotel hotel : hoteis) {
            double totalHotel = 0;
            for (LocalDate data : datas) {
                Optional<Double> result = hotel.getTaxas()
                        .stream().filter(taxa -> taxa.getTipoCliente() == tipoCliente
                                && taxa.getTipoDia() == getTipoDiaPorData(data))
                        .map(Taxa::getValor)
                        .findFirst();
                totalHotel += result.orElse((double) 0);
            }

            if (totalHotel < menorValor || menorValor == 0) {
                hotelMaisBarato = hotel;
                menorValor = totalHotel;
            } else if (totalHotel == menorValor) {
                if (hotel.getClassificacao() > hotelMaisBarato.getClassificacao()) {
                    hotelMaisBarato = hotel;
                    menorValor = totalHotel;
                }
            }
        }
        return hotelMaisBarato.getNome();
    }

    TipoDia getTipoDiaPorData(LocalDate data){
        return data.getDayOfWeek() == DayOfWeek.SATURDAY
                || data.getDayOfWeek() == DayOfWeek.SUNDAY ? TipoDia.FIM_DE_SEMANA : TipoDia.SEMANA;
    }
}
