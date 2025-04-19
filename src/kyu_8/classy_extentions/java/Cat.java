// https://www.codewars.com/kata/55a14aa4817efe41c20000bc/train/java

package kyu_8.classy_extentions.java;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public String speak(){
        return this.name + " " + "meows.";
    }
}


