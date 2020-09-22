import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    List<Hotel> hoteis;
    List<LocalDate> datas;
    Hotel hotel;

    @BeforeEach
    void setUp() {
        LocalDate data1 = LocalDate.of(2020, 10, 10);
        LocalDate data2 = LocalDate.of(2020, 10, 11);
        LocalDate data3 = LocalDate.of(2020, 10, 12);

        datas = Arrays.asList(data1, data2, data3);

        Taxa taxa1 = new Taxa(20, TipoCliente.REGULAR, TipoDia.SEMANA);
        Taxa taxa2 = new Taxa(10, TipoCliente.FIDELIDADE, TipoDia.SEMANA);
        Taxa taxa3 = new Taxa(30, TipoCliente.REGULAR, TipoDia.FIM_DE_SEMANA);
        Taxa taxa4 = new Taxa(40, TipoCliente.FIDELIDADE, TipoDia.FIM_DE_SEMANA);
        Taxa taxa5 = new Taxa(50, TipoCliente.REGULAR, TipoDia.SEMANA);
        Taxa taxa6 = new Taxa(60, TipoCliente.FIDELIDADE, TipoDia.FIM_DE_SEMANA);

        List<Taxa> taxas1 = Arrays.asList(taxa1, taxa2, taxa3, taxa4);
        List<Taxa> taxas2 = Arrays.asList(taxa5, taxa2, taxa3, taxa6);

        hotel = new Hotel("Hotel de Teste 1", 3, taxas1);
        Hotel hotel2 = new Hotel("Hotel de Teste 2", 4, taxas2);
        Hotel hotel3 = new Hotel("Hotel de Teste 3", 5, taxas2);

        hoteis = Arrays.asList(hotel, hotel2, hotel3);
    }

    @Test
    void createHotel(){
        assertAll("Test of the fields of hotel",
                () -> assertEquals("Hotel de Teste", hotel.getNome()),
                () -> assertEquals(3, hotel.getClassificacao()),
                () -> assertAll(
                      //Jpw tp test a list in junit?
                )
        );
    }
}