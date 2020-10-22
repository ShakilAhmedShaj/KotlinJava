package oop.interfaces.kotlin

/*
Interfaces are custom types provided by Kotlin that cannot be instantiated directly. Instead, these define a form of behavior that the implementing types have to follow.
With the interface, you can define a set of properties and methods, that the concrete types must follow and implement.
 */
class Interface {

    interface Vehicle {
        fun start() // abstract method
        fun stop()
    }

    class Car : Vehicle {
        override fun start() {
            println("Car started")
        }

        override fun stop() {
            println("Car stopped")
        }
    }


}

fun main() {
    val obj = Interface.Car()
    obj.start()
    obj.stop()
}