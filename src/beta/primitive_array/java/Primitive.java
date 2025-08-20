// https://www.codewars.com/kata/5dcc653f5adcb400012513d5/train/java

package beta.primitive_array.java;

public class Primitive {
    public static Object makePrimitive(Object o) {
        if (o instanceof Integer[] intArray) {
            int[] result = new int[intArray.length];
            for (int i = 0; i < intArray.length; i++) {
                result[i] = intArray[i];
            }
            return result;
        } else if (o instanceof Short[] shortArray) {
            short[] result = new short[shortArray.length];
            for (int i = 0; i < shortArray.length; i++) {
                result[i] = shortArray[i];
            }
            return result;
        } else if (o instanceof Byte[] byteArray) {
            byte[] result = new byte[byteArray.length];
            for (int i = 0; i < byteArray.length; i++) {
                result[i] = byteArray[i];
            }
            return result;
        } else if (o instanceof Float[] floatArray) {
            float[] result = new float[floatArray.length];
            for (int i = 0; i < floatArray.length; i++) {
                result[i] = floatArray[i];
            }
            return result;
        } else if (o instanceof Double[] doubleArray) {
            double[] result = new double[doubleArray.length];
            for (int i = 0; i < doubleArray.length; i++) {
                result[i] = doubleArray[i];
            }
            return result;
        } else if (o instanceof Boolean[] booleanArray) {
            boolean[] result = new boolean[booleanArray.length];
            for (int i = 0; i < booleanArray.length; i++) {
                result[i] = booleanArray[i];
            }
            return result;
        } else if (o instanceof Long[] longArray) {
            long[] result = new long[longArray.length];
            for (int i = 0; i < longArray.length; i++) {
                result[i] = longArray[i];
            }
            return result;
        } else if (o instanceof Character[] charArray) {
            char[] result = new char[charArray.length];
            for (int i = 0; i < charArray.length; i++) {
                result[i] = charArray[i];
            }
            return result;
        }
        return o;
    }
}
