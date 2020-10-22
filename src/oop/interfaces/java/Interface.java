package oop.interfaces.java;

/*
An interface in Java is a blueprint of a class. It has static constants and abstract methods.

The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body.
It is used to achieve abstraction and multiple inheritance in Java.

In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body.

Java Interface also represents the IS-A relationship.

It cannot be instantiated just like the abstract class.

Since Java 8, we can have default and static methods in an interface.

Since Java 9, we can have private methods in an interface.
 */

public class Interface {

    //Interface declaration: by first user
    interface Drawable {
        void draw();
    }

    //Implementation: by second user
    class Rectangle implements Drawable {
        public void draw() {
            System.out.println("drawing rectangle");
        }
    }

    static class Circle implements Drawable {
        public void draw() {
            System.out.println("drawing circle");
        }
    }
    //Using interface: by third user

    public static void main(String args[]) {
        Interface.Drawable d = new Interface.Circle();//In real scenario, object is provided by method e.g. getDrawable()
        d.draw();
    }

}



