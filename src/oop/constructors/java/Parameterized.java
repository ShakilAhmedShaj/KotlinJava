package oop.constructors.java;

/*
A constructor that has parameters is known as parameterized constructor.
If we want to initialize fields of the class with your own values, then use a parameterized constructor.
 */

public class Parameterized {

    static class Student {
        // data members of the class.
        String name;
        int id;

        // constructor would initialize data members
        // with the values of passed arguments while
        // object of that class created.
        Student(String name, int id) {
            this.name = name;
            this.id = id;
        }
    }

    public static void main(String[] args) {
        // this would invoke the parameterized constructor.
        Student student1 = new Student("SHAJ", 1);
        System.out.println("Name :" + student1.name + " and Id :" + student1.id);
    }


}
