package Task4;

public class SimpleWelcomeMassage {
    static void main(String[] args) {
        welcomeMsg("Bart");
        welcomeMsg("Mathew");
        welcomeMsg("Joe");
    }

    private static void welcomeMsg(String imie) {
        System.out.println("Hello " + imie + "!");
    }
}
