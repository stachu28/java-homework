package Task14.Zadanie2;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Obiekty ---");
        Pojazd pojazd = new Pojazd();
        Samochod samochod = new Samochod();
        Pojazd polimorficzny = new Samochod();

        System.out.println(pojazd.opis());
        System.out.println(samochod.opis());
        System.out.println(polimorficzny.opis());

        pojazd.staraMetoda();
        samochod.staraMetoda();
        polimorficzny.staraMetoda();

        System.out.println("\n--- Kalkulacje ---");

        Obliczenie dodawanie = Integer::sum;
        Obliczenie odejmowanie = (a, b) -> a - b;
        Obliczenie mnozenie = (a, b) -> a * b;
        Obliczenie dzielenie = (a, b) -> a / b;

        System.out.printf("Dodawanie   2 + 7 = %d%n", dodawanie.wykonaj(2, 7));
        System.out.printf("Odejmowanie 8 - 4 = %d%n", odejmowanie.wykonaj(10, 5));
        System.out.printf("Mnożenie    2 * 4 = %d%n", mnozenie.wykonaj(2, 4));
        System.out.printf("Dzielenie   9 / 3 = %d%n", dzielenie.wykonaj(9, 3));

        System.out.println("\n--- Lombok: Pojazd (@Data, @AllArgs, @SuperBuilder) ---");
        Pojazd pojazd1 = new Pojazd("Mercedes", 2010, "powypadkowy");
        System.out.println("Nowy pojazd:    " + pojazd1.toString());
        pojazd1.setMarka("Fiat");
        System.out.println("Zmiana marki:   " + pojazd1);
        System.out.println("getMarka():     " + pojazd1.getMarka());
        Pojazd pojazd2 = new Pojazd("Fiat", 2010, "pęknięta szyba");
        System.out.println("Drugi pojazd:   " + pojazd2);
        System.out.println("equals:         " + pojazd1.equals(pojazd2));
        Pojazd pojazd3 = Pojazd.builder().marka("Opel").rokProdukcji(2020).build();
        System.out.println("Trzeci pojazd:  " + pojazd3);

        System.out.println("\n--- Lombok: Samochod (callSuper, @Singular, konstruktory) ---");
        Samochod samochod1 = Samochod.builder()
                .marka("Toyota")
                .rokProdukcji(2022)
                .numerRejstracyjny("WFL10234")
                .liczbaDrzwi(5)
                .dodatek("hak holowniczy")
                .dodatek("koło zapasowe")
                .build();
        System.out.println("Nowy samochód:  " + samochod1);
        System.out.println("Dodatki:        " + samochod1.getDodatki());

        Samochod samochod2 = new Samochod("WFL10234");
        samochod2.setMarka("Toyota");
        samochod2.setRokProdukcji(2022);
        samochod2.setLiczbaDrzwi(3);
        System.out.println("Drugi samochód: " + samochod2);
        System.out.println("equals:         " + samochod1.equals(samochod2));
        samochod2.setMarka("Inna");
        System.out.println("Nowa marka s2:  " + samochod2.getMarka());
        System.out.println("equals:         " + samochod1.equals(samochod2));

        try {
            new Samochod((String) null);
        } catch (NullPointerException e) {
            System.out.println("@NonNull -> NullPointerException: " + e.getMessage());
        }
    }
}