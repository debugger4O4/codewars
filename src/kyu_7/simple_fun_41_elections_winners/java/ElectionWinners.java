// https://www.codewars.com/kata/58881b859ab1e053240000cc/train/java

package kyu_7.simple_fun_41_elections_winners.java;

import java.util.Arrays;

class ElectionWinners {
    static int find(final int[] votes, final int k) {
        int max = Arrays.stream(votes).max().getAsInt();
        int countEquals = 0;
        int countWinners = 0;
        for (int i = 0; i < votes.length; i++) {
            if(votes[i] == max) {
                countEquals++;
            }
            if (votes[i] + k > max) {
                countWinners++;
            }
        }
        return countEquals > 1 && k == 0 ? 0 : countEquals == 1 && k == 0 ? 1 : countWinners;
    }
}
