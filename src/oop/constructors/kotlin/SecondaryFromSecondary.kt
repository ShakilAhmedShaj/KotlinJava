package oop.constructors.kotlin

/*
Kotlin may have one or more secondary constructors. Secondary constructors allow initialization of variables
and allow to provide some logic to the class as well. They are prefixed with the constructor keyword.

We can also use both primary as well as secondary constructor in a same class.
By using primary as well secondary constructor in same class,
secondary constructor needs to authorize to primary constructor.

One secondary constructor can call another secondary constructor of same class.

Authorization to another constructor in same class is done using this() keyword.
 */

class Student {

    constructor(name: String, id: Int) : this(name, id, "password") {
        println("this executes next")
        println("Name = $name")
        println("Id = $id")
    }

    constructor(name: String, id: Int, pass: String) {
        println("this executes first")
        println("Name = $name")
        println("Id = $id")
        println("Password = $pass")
    }
}

fun main() {
    val student = Student("SHAJ", 101)
}