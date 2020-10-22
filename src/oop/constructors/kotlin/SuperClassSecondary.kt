package oop.constructors.kotlin

/*
one derived class secondary constructor can call the base class secondary constructor.
This is done using super keyword, this is the concept of inheritance.
 */

open class Parent {

    constructor(name: String, id: Int) {
        println("this executes first")
        println("Name = $name")
        println("Id = $id")
    }

    constructor(name: String, id: Int, pass: String) {
        println("this executes third")
        println("Name = $name")
        println("Id = $id")
        println("Password = $pass")
    }
}

class Child : Parent {
    constructor(name: String, id: Int) : super(name, id) {
        println("this executes second")
        println("Name = $name")
        println("Id = $id")
    }

    constructor(name: String, id: Int, pass: String) : super(name, id, "password") {
        println("this executes forth")
        println("Name = $name")
        println("Id = $id")
        println("Password = $pass")
    }
}

fun main(args: Array<String>) {
    val obj1 = Child("SHAJ 1", 101)
    val obj2 = Child("SHAJ 2", 101, "my password")
}