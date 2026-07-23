package Task4;

public class RangeOfVariables {
    static void main(String[] args) {
        int x = 5;

        zmienX(x);

        System.out.println("zmienna x w main: " + x);
    }

    private static void zmienX(int x) {
        x = 100;

        System.out.println("zmienna x w metodzie: " + x);
    }


}

//7. **Zasięg zmiennych**
//        - W `main` utwórz zmienną `x` z wartością 5.
//        - Napisz metodę `zmienX(int x)`, która przypisuje do parametru inną wartość i wypisuje ją w konsoli.
//        - Wywołaj metodę i następnie wypisz `x` w `main`, aby pokazać różnicę.
