package Task14.Zadanie2;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Pojazd {

    @ToString.Include
    private String marka;

    @ToString.Include
    private int rokProdukcji;

    @EqualsAndHashCode.Exclude
    private String uwagi;

    public String opis() {
        return "To jest pojazd";
    }

    public void staraMetoda() {
        System.out.println("Stara metoda");
    }
}