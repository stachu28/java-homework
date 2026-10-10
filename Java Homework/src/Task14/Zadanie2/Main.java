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
    }
}