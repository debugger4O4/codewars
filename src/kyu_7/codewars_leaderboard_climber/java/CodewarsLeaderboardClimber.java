// https://www.codewars.com/kata/57d28215264276ea010002cf/train/java

package kyu_7.codewars_leaderboard_climber.java;

public class CodewarsLeaderboardClimber {
    public static String leaderBoard(String user, int userScore, int yourScore) {
        int difference = userScore - yourScore;
        if (difference < 0) {
            return "Winning!";
        }
        if (difference == 0) {
            return "Only need one!";
        }
        int betaScore = difference / 3;
        return String.format("To beat %s's score, I must complete %d Beta kata and %d 8kyu kata.%s",
                user,
                betaScore,
                difference - betaScore * 3,
                1000 < difference - betaScore * 2 ? " Dammit!" : "");
    }
}