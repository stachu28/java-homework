package Task4;

public class SimpleWelcomeMassage {
    static void main(String[] args) {
        powitaj("Bartek");
        powitaj("Maciek");
        powitaj("Arek");
    }

    private static void powitaj(String imie) {
        System.out.println("Cześć " + imie + "!");
    }
}
