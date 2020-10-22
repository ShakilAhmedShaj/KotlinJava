package oop.constructors.kotlin

/*
The primary constructor does not contain any code. Initializer blocks are used to initialization of code.
This block is prefixed with init keyword. At the period of instance initialization,
the initialized blocks are executed in the same order as they appear in class body.
 */

class Employee(emp_id: Int, emp_name: String) {
    private val id: Int = emp_id
    var name: String = emp_name

    // initializer block
    init {

        println("Employee id is: $id")
        println("Employee name: $name")
    }

    fun main(args: Array<String>) {
        val emp = Employee(1001, "SHAJ")
    }
}