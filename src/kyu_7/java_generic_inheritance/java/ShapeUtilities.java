// https://www.codewars.com/kata/6705c60be3abf45ead76d052/train/java

package kyu_7.java_generic_inheritance.java;

import java.util.*;

class ShapeUtilities {
    public static double sumAllAreas(List<? extends Shape> shapes) {
        double totalArea = 0.0;
        for (Shape shape : shapes)
            totalArea += shape.getArea();
        return totalArea;
    }
}
