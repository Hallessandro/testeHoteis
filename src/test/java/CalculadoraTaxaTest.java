import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class CalculadoraTaxaTest {

    CalculadoraTaxa calculadoraTaxa;

    @BeforeEach
    void setUp() {
        calculadoraTaxa = new CalculadoraTaxa();
    }

    @Test
    void verificaDesempatePorClassificacao(){
        LocalDate data1 = LocalDate.of(2020, 3, 16);
        LocalDate data2 = LocalDate.of(2020, 3, 17);
        LocalDate data3 = LocalDate.of(2020, 3, 18);

        List<LocalDate> datas = Arrays.asList(data1, data2, data3);

        GeradorDataParaTeste geradorDataParaTeste = new GeradorDataParaTeste();
        List<Hotel> hoteis = geradorDataParaTeste.getHoteisMesmasTaxas();

        String nomeHotel = calculadoraTaxa.getMenorTaxa(TipoCliente.REGULAR, datas, hoteis);
        assertEquals("Hotel Maior Classificacao", nomeHotel);
    }

    @Test
    void testeEntrada1(){
        LocalDate data1 = LocalDate.of(2020, 3, 16);
        LocalDate data2 = LocalDate.of(2020, 3, 17);
        LocalDate data3 = LocalDate.of(2020, 3, 18);

        List<LocalDate> datas = Arrays.asList(data1, data2, data3);

        GeradorDataParaTeste geradorDataParaTeste = new GeradorDataParaTeste();
        List<Hotel> hoteis = geradorDataParaTeste.getHoteisParaTeste();

        String nomeHotel = calculadoraTaxa.getMenorTaxa(TipoCliente.REGULAR, datas, hoteis);
        assertEquals("Parque das Flores", nomeHotel);
    }

    @Test
    void testaEntrada2(){
        LocalDate data1 = LocalDate.of(2020, 3, 20);
        LocalDate data2 = LocalDate.of(2020, 3, 21);
        LocalDate data3 = LocalDate.of(2020, 3, 22);

        List<LocalDate> datas = Arrays.asList(data1, data2, data3);

        GeradorDataParaTeste geradorDataParaTeste = new GeradorDataParaTeste();
        List<Hotel> hoteis = geradorDataParaTeste.getHoteisParaTeste();

        String nomeHotel = calculadoraTaxa.getMenorTaxa(TipoCliente.REGULAR, datas, hoteis);
        assertEquals("Jardim Botânico", nomeHotel);
    }

    @Test
    void testaEntrada3(){
        LocalDate data1 = LocalDate.of(2020, 3, 26);
        LocalDate data2 = LocalDate.of(2020, 3, 27);
        LocalDate data3 = LocalDate.of(2020, 3, 28);

        List<LocalDate> datas = Arrays.asList(data1, data2, data3);

        GeradorDataParaTeste geradorDataParaTeste = new GeradorDataParaTeste();
        List<Hotel> hoteis = geradorDataParaTeste.getHoteisParaTeste();

        String nomeHotel = calculadoraTaxa.getMenorTaxa(TipoCliente.FIDELIDADE, datas, hoteis);
        assertEquals("Mar Atlântico", nomeHotel);
    }
}
