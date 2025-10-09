// https://www.codewars.com/kata/57d29ccda56edb4187000052/train/java

package kyu_7.rock_paper_scissors_lizard_spock.java;

public class Kata {

    public static String rpsls(String player1, String player2) {
        return player1.equals(player2) ? "Draw!" :
                (player1.equals("scissors") && player2.equals("paper")) ||
                        (player1.equals("paper") && player2.equals("rock")) ||
                        (player1.equals("rock") && player2.equals("lizard")) ||
                        (player1.equals("lizard") && player2.equals("spock")) ||
                        (player1.equals("spock") && player2.equals("scissors")) ||
                        (player1.equals("scissors") && player2.equals("lizard")) ||
                        (player1.equals("lizard") && player2.equals("paper")) ||
                        (player1.equals("paper") && player2.equals("spock")) ||
                        (player1.equals("spock") && player2.equals("rock")) ||
                        (player1.equals("rock") && player2.equals("scissors"))
                        ? "Player 1 Won!" : "Player 2 Won!";
    }
}
