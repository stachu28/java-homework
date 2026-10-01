package Task1;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Wczytaj swój ruch (`k`, `p` lub `n`): ");
        String playerMove = scanner.next();

        String[] possibleMoves = {"k", "p", "n"};

        String computerMove = possibleMoves[random.nextInt(3)];

        System.out.println("Gracz: " + playerMove);
        System.out.println("Komputer: " + computerMove);

        if (playerMove.equals(computerMove)) {
            System.out.println("Remis!");
        } else if (     (playerMove.equals("k") && computerMove.equals("n")) ||
                        (playerMove.equals("p") && computerMove.equals("k")) ||
                        (playerMove.equals("n") && computerMove.equals("p"))
                        ) {
            System.out.println("Wygrał gracz!");
        } else {
            System.out.println("Wygrał komputer!");
        }
        scanner.close();
    }
}
