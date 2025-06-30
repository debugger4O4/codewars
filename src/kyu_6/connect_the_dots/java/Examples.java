package kyu_6.connect_the_dots.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class Examples {

    @Test
    public void example1() {
        String in =
                "           \n" +
                        " a       b \n" +
                        " e         \n" +
                        "           \n" +
                        " d       c \n" +
                        "           \n";
        String out =
                "           \n" +
                        " ********* \n" +
                        " *       * \n" +
                        " *       * \n" +
                        " ********* \n" +
                        "           \n";
//        Util.show(in, out);
        assertEquals(out, Dinglemouse.connectTheDots(in));
    }

    @Test
    public void example2() {
        String in =
                "           \n" +
                        "     a     \n" +
                        "    e      \n" +
                        "           \n" +
                        "  d     b  \n" +
                        "           \n" +
                        "           \n" +
                        "     c     \n" +
                        "           \n";
        String out =
                "           \n" +
                        "     *     \n" +
                        "    * *    \n" +
                        "   *   *   \n" +
                        "  *     *  \n" +
                        "   *   *   \n" +
                        "    * *    \n" +
                        "     *     \n" +
                        "           \n";
//        Util.show(in, out);
        assertEquals(out, Dinglemouse.connectTheDots(in));
    }

}
