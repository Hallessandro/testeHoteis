import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxaTest {

    @Test
    void validateFieldsTaxa(){
        Taxa taxa = new Taxa(20, TipoCliente.FIDELIDADE, TipoDia.FIM_DE_SEMANA);
        assertAll(
                () -> assertEquals(220, taxa.getValor(), "Valor não confere"),
                () -> assertEquals(TipoCliente.FIDELIDADE, taxa.getTipoCliente(), "Tipo do Cliente não confere"),
                () -> assertEquals(TipoDia.FIM_DE_SEMANA, taxa.getTipoDia(), "Tipo do dia não confere")
        );
    }
}