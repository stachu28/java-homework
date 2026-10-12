package Task14.Zadanie2;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Samochod extends Pojazd {

    @NonNull
    @EqualsAndHashCode.Include
    private String numerRejstracyjny;

    @Setter
    private int liczbaDrzwi;

    @Singular("dodatek")
    @ToString.Exclude
    private List<String> dodatki;

    @Override
    public String opis() {
        return "To jest samochód";
    }

    @Override
    @Deprecated(since = "1.0", forRemoval = true)
    public void staraMetoda() {
        super.staraMetoda();
    }

    void nowaMetoda() {
    }
}