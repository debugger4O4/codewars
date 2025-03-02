// https://www.codewars.com/kata/5635e7cb49adc7b54500001c/train/java

package kyu_7.atm.java;

public class ATM {

    public int solve(int n) {
        if (n % 10 != 0) {
            return -1;
        }
        int count = 0;
        while (n >= 10) {
            if (n >= 500) {
                n = n - 500;
                count++;
            } else if (n >= 200) {
                n = n - 200;
                count++;
            } else if (n >= 100) {
                n = n - 100;
                count++;
            } else if (n >= 50) {
                n = n - 50;
                count++;
            } else if (n >= 20) {
                n = n - 20;
                count++;
            } else if (n >= 10) {
                n = n - 10;
                count++;
            } else {
                System.out.println("Kek");
            }
        }

        return count;
    }
}
