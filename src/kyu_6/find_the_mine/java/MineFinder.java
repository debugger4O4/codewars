// https://www.codewars.com/kata/528d9adf0e03778b9e00067e/train/java

package kyu_6.find_the_mine.java;

public class MineFinder {

    public static int[] findMine(int[][] field){
        int[] result = new int[2];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == 1) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }

}
