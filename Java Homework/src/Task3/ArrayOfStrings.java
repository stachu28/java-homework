package Task3;

import java.util.Scanner;

public class ArrayOfStrings {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type a string: ");
        String string = sc.nextLine();

        char[] charArray = string.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }
    }
}
