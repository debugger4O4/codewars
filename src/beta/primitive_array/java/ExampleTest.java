package beta.primitive_array.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class ExampleTest {
    @Test
    public void FixedTest0() {
        Object[] a = new Object[]{new Object(), new Object(), new Object()};
        Object[] actual = new Object[3];
        System.arraycopy(a, 0, actual, 0, a.length);
        assertArrayEquals(actual, (Object[]) Primitive.makePrimitive(a));
    }

    @Test
    public void FixedTest1() {
        String[] a = new String[]{"hey", "bye", "cat"};
        String[] actual = new String[3];
        System.arraycopy(a, 0, actual, 0, a.length);
        assertArrayEquals(actual, (String[]) Primitive.makePrimitive(a));
    }

    @Test
    public void FixedTest2() {
        Integer[][] a = new Integer[][]{{1, 2}, {3, 4}};
        Integer[][] actual = new Integer[2][2];
        System.arraycopy(a, 0, actual, 0, a.length);
        assertArrayEquals(actual, (Integer[][]) Primitive.makePrimitive(a));
    }

    @Test
    public void FixedTest3() {
        byte[] a = (byte[]) Primitive.makePrimitive(new Byte[]{1, 2, 3, -1});
        assertArrayEquals(new byte[]{1, 2, 3, -1}, a);
    }

    @Test
    public void FixedTest4() {
        short[] a = (short[]) Primitive.makePrimitive(new Short[]{1, 2, 3});
        assertArrayEquals(new short[]{1, 2, 3}, a);
    }

    @Test
    public void FixedTest5() {
        int[] a = (int[]) Primitive.makePrimitive(new Integer[]{1, 2, 3});
        assertArrayEquals(new int[]{1, 2, 3}, a);
    }

    @Test
    public void FixedTest6() {
        long[] a = (long[]) Primitive.makePrimitive(new Long[]{1L, 2L, 3L});
        assertArrayEquals(new long[]{1, 2, 3}, a);
    }

    @Test
    public void FixedTest7() {
        float[] a = (float[]) Primitive.makePrimitive(new Float[]{1.2f, 2f, 3.9f, -4.4f, 5.7f});
        f(new float[]{1.2f, 2f, 3.9f, -4.4f, 5.7f}, a);
    }

    @Test
    public void FixedTest8() {
        double[] a = (double[]) Primitive.makePrimitive(new Double[]{1.2769, 2.888, 3.91, -4.45, 5.69});
        double[] b = new double[]{1.2769, 2.888, 3.91, -4.45, 5.69};
        for (int i = 0; i < a.length; i++)
            assertEquals(a[i], b[i], 0.000001);
        assertEquals(a.length, b.length);
    }

    @Test
    public void FixedTest9() {
        boolean[] a = (boolean[]) Primitive.makePrimitive(new Boolean[]{true, false});
        assertArrayEquals(new boolean[]{true, false}, a);
    }

    @Test
    public void FixedTest10() {
        char[] a = (char[]) Primitive.makePrimitive(new Character[]{'X'});
        assertArrayEquals(new char[]{'X'}, a);
    }

    private void f(float[] a, float[] b) {
        for (int i = 0; i < a.length; i++)
            assertEquals(a[i], b[i], 0.000001);
        assertEquals(a.length, b.length);
    }
}
