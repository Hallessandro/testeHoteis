import java.util.Arrays;
import java.util.List;

public class GeradorDataParaTeste {

    List<Hotel> getHoteisParaTeste(){
        List<Hotel> hoteis;

        Taxa taxa1 = new Taxa(110, TipoCliente.REGULAR, TipoDia.SEMANA);
        Taxa taxa2 = new Taxa(80, TipoCliente.FIDELIDADE, TipoDia.SEMANA);
        Taxa taxa3 = new Taxa(90, TipoCliente.REGULAR, TipoDia.FIM_DE_SEMANA);
        Taxa taxa4 = new Taxa(80, TipoCliente.FIDELIDADE, TipoDia.FIM_DE_SEMANA);

        Taxa taxa5 = new Taxa(160, TipoCliente.REGULAR, TipoDia.SEMANA);
        Taxa taxa6 = new Taxa(110, TipoCliente.FIDELIDADE, TipoDia.SEMANA);
        Taxa taxa7 = new Taxa(60, TipoCliente.REGULAR, TipoDia.FIM_DE_SEMANA);
        Taxa taxa8 = new Taxa(50, TipoCliente.FIDELIDADE, TipoDia.FIM_DE_SEMANA);

        Taxa taxa9 = new Taxa(220, TipoCliente.REGULAR, TipoDia.SEMANA);
        Taxa taxa10 = new Taxa(100, TipoCliente.FIDELIDADE, TipoDia.SEMANA);
        Taxa taxa11 = new Taxa(150, TipoCliente.REGULAR, TipoDia.FIM_DE_SEMANA);
        Taxa taxa12 = new Taxa(40, TipoCliente.FIDELIDADE, TipoDia.FIM_DE_SEMANA);

        List<Taxa> taxas1 = Arrays.asList(taxa1, taxa2, taxa3, taxa4);
        List<Taxa> taxas2 = Arrays.asList(taxa5, taxa6, taxa7, taxa8);
        List<Taxa> taxas3 = Arrays.asList(taxa9, taxa10, taxa11, taxa12);

        Hotel hotelPqFlores = new Hotel("Parque das Flores", 3, taxas1);
        Hotel hotelJardimBotanico = new Hotel("Jardim Botânico", 4, taxas2);
        Hotel hotelMarAtlantico = new Hotel("Mar Atlântico", 5, taxas3);

        hoteis = Arrays.asList(hotelPqFlores, hotelJardimBotanico, hotelMarAtlantico);
        return hoteis;
    }

    List<Hotel> getHoteisMesmasTaxas(){
        Taxa taxa1 = new Taxa(110, TipoCliente.REGULAR, TipoDia.SEMANA);
        Taxa taxa2 = new Taxa(80, TipoCliente.FIDELIDADE, TipoDia.SEMANA);
        Taxa taxa3 = new Taxa(90, TipoCliente.REGULAR, TipoDia.FIM_DE_SEMANA);
        Taxa taxa4 = new Taxa(80, TipoCliente.FIDELIDADE, TipoDia.FIM_DE_SEMANA);

        List<Taxa> taxas1 = Arrays.asList(taxa1, taxa2, taxa3, taxa4);

        Hotel hotelMaiorClassificacao = new Hotel("Hotel Maior Classificacao", 4, taxas1);
        Hotel hotelMenorClassificacao = new Hotel("Hotel Menor Classificacao", 2, taxas1);

        return Arrays.asList(hotelMaiorClassificacao, hotelMenorClassificacao);
    }
}
