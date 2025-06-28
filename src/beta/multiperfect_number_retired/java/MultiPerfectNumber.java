package beta.multiperfect_number_retired.java;

public class MultiPerfectNumber {

    public long calcMth(long k, long m) {
        long fnd = 0;
        long result = 1;
        while (fnd < m) {
            long div = divisorFunction(result);
            long val = result * k;
            if (val == div) {
                fnd += 1;
            }
            result += 1;
        }
        return result - 1;
    }

    private long divisorFunction(long val) {
        long result = 0;
        if (val < 0) {
            return result;
        }
        long div = val;
        while (div > 0) {
            if (val % div == 0) {
                result += div;
            }
            div -= 1;
        }
        return result;
    }
}