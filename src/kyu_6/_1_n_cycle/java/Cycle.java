package kyu_6._1_n_cycle.java;

class Cycle {
    public static int cycle(int n) {
        if (n % 2 == 0 || n % 5 == 0) {
            return -1;
        }
        int i = 1, val = 1;
        while (true) {
            val = val * 10 % n;
            if (val == 1) {
                return i;
            }
            i++;
        }
    }
}