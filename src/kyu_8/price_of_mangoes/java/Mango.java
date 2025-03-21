// https://www.codewars.com/kata/57a77726bb9944d000000b06/train/java

package kyu_8.price_of_mangoes.java;

public class Mango{
    public static int mango(int quantity, int price){
        return (quantity - quantity / 3) * price;
    }
}
