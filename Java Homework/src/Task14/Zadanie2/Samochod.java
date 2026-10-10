package Task14.Zadanie2;

public class Samochod extends Pojazd {
    @Override
    public String opis() {
        return "To jest samochód";
    }

    @Override
    @Deprecated(since = "1.0", forRemoval = true)
    public void staraMetoda() {
        super.staraMetoda();
    }

    void nowaMetoda() {}
}