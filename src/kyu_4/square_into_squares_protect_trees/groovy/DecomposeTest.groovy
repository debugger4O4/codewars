//package kyu_4.square_into_squares_protect_trees.groovy;
//
//import static kyu_4.bagels.kotlin.org.junit.Assert.*;
//import kyu_4.bagels.kotlin.org.junit.Test;
//
//public class DecomposeTest {
//
//    private static long[] string2LongArray(String s) {
//        return Arrays.stream(s.split(" ")).collect({Long.valueOf(it)}).toArray() as long[]
//    }
//    private static void dotest(long n, String sexpr) {
//        println(n)
//        boolean success
//        String sact = Decompose.decompose(n)
//        boolean st = false
//        boolean t = false
//        System.out.printf("Expected %s and got %s\n", sexpr, sact, "\n")
//        if (((sact == null) && (sexpr == null)) || ((sact != null) && sact == sexpr)) {
//            success = true
//        } else {
//            if (sact == null) {
//                success = false
//            } else {
//                long[] intarr1 = string2LongArray(sact)
//                st = Helper.isSorted(intarr1)
//                t = Helper.total(intarr1, n * n)
//                if (!st || !t) {
//                    System.out.printf("** Error. Not increasinly sorted or bad sum of squares\n **")
//                    success = false
//                } else {
//                    System.out.printf("Correct: Increasing and total\n")
//                    success = true
//                }
//            }
//        }
//        assertEquals(true, success)
//    }
//    @Test
//    public void basicTests() {
//        dotest(2, null)
//        dotest(11, "1 2 4 10")
//        dotest(12, "1 2 3 7 9")
//        dotest(625, "2 5 8 34 624")
//        dotest(7100, "2 3 5 119 7099")
//        dotest(12345, "2 6 157 12344")
//        dotest(1234567, "2 8 32 1571 1234566")
//
//    }
//}