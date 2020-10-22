package oop.constructors.java;

/*
A copy constructor in a Java class is a constructor that creates an object using another object of the same Java class.

That's helpful when we want to copy a complex object that has several fields, or when we want to make a deep copy of an existing object.
 */
public class CopyConstructor {
    static class Complex {

        private double real, imaginary;

        // A normal parametrized constructor
        public Complex(double real, double imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }

        // copy constructor
        Complex(Complex c) {
            System.out.println("Copy constructor called");
            real = c.real;
            imaginary = c.imaginary;
        }

        // Overriding the toString of Object class
        @Override
        public String toString() {
            return "(" + real + " + " + imaginary + "i)";
        }
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(10, 15);

        // Following involves a copy constructor call
        Complex c2 = new Complex(c1);

        // Note that following doesn't involve a copy constructor call as
        // non-primitive variables are just references.
        Complex c3 = c2;

        System.out.println(c2); // toString() of c2 is called here
    }

}
