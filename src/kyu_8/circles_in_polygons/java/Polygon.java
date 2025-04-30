// https://www.codewars.com/kata/5a026a9cffe75fbace00007f/train/java

package kyu_8.circles_in_polygons.java;

public class Polygon {
    int sides;
    int sideLength;

    public Polygon(int sides, int sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
    }

    public double circleDiameter(){
        return sideLength / Math.tan(Math.toRadians(180d / sides));
    }

}
