// https://www.codewars.com/kata/56170e844da7c6f647000063/train/java

package kyu_8.drink_about.java;

public class Drinks {

    public static String peopleWithAgeDrink(int age){
        return age < 14 ? "drink toddy" : age < 18 ? "drink coke" : age < 21 ? "drink beer" : "drink whisky";
    }
}
