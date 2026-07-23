package Task4;

public class RangeOfVariables {
    static void main(String[] args) {
        int x = 5;

        varX(x);

        System.out.println("Variable 'x' in main: " + x);
    }

    private static void varX(int x) {
        x = 100;

        System.out.println("Variable 'x' in method: " + x);
    }


}

//7. **Zasięg zmiennych**
//        - W `main` utwórz zmienną `x` z wartością 5.
//        - Napisz metodę `zmienX(int x)`, która przypisuje do parametru inną wartość i wypisuje ją w konsoli.
//        - Wywołaj metodę i następnie wypisz `x` w `main`, aby pokazać różnicę.
