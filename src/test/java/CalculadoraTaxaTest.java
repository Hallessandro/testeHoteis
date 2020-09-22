import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalculadoraTaxaTest {

    CalculadoraTaxa calculadoraTaxa;

    @BeforeEach
    void setUp() {
        calculadoraTaxa = new CalculadoraTaxa();
    }

    @Test
    void calculaMenorTaxa(){
        LocalDate data1 = LocalDate.of(2020, 3, 20);
        LocalDate data2 = LocalDate.of(2020, 3, 21);
        LocalDate data3 = LocalDate.of(2020, 3, 22);

        List<LocalDate> datas = Arrays.asList(data1, data2, data3);

        String nomeHotel = calculadoraTaxa.getMenorTaxa(TipoCliente.REGULAR, datas);
        assertEquals("Parque das Flores", nomeHotel);
    }
}
