import java.time.DayOfWeek;
import java.time.LocalDate;

public enum TipoDia {
    SEMANA,
    FIM_DE_SEMANA;

    public static TipoDia getTipoDiaPorData(LocalDate data){
        return data.getDayOfWeek() == DayOfWeek.SATURDAY
                || data.getDayOfWeek() == DayOfWeek.SUNDAY ? TipoDia.FIM_DE_SEMANA : TipoDia.SEMANA;
    }
}
