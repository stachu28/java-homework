package Task4;

import javax.xml.transform.Source;
import java.util.Scanner;

public class MultiplyTwoNumbers {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type first number");
        int a = scanner.nextInt();

        System.out.println("Type second number");
        int b = scanner.nextInt();

        int result = mult(a, b);

        System.out.println(result);

    }
    static int mult(int a, int b) {
        return a * b;
    }
}
