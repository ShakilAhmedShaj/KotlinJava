package oop.constructors.java;

/*
A constructor that has no parameter is known as default constructor.
If we don’t define a constructor in a class, then compiler creates default constructor(with no arguments) for the class.
And if we write a constructor with arguments or no-arguments then the compiler does not create a default constructor.
Default constructor provides the default values to the object like 0, null, etc. depending on the type.
 */

public class NoArgument {


    static class Student {
        int num;
        String name;

        // this would be invoked while an object
        // of that class is created.
        Student() {
            System.out.println("Constructor called");
        }
    }


    public static void main(String[] args) {
        // this would invoke default constructor.
        Student student1 = new Student();

        // Default constructor provides the default
        // values to the object like 0, null
        System.out.println(student1.name);
        System.out.println(student1.num);
    }

}
