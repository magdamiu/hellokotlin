package com.magdamiu.hellokotlin

/**
 * Created by magda on 16/02/2018.
 */

open class Person(name: String, age: Int) : MyInterface {
    override fun foo(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun bar(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    val name: String = name
        get() {
            if (field.isEmpty()) {
                return ""
            }
            return name
        }

    val age = age


    open fun calculateAgeInSeconds(): Long = 3000
}

class Developer(name: String) : Person(name, 25) {

    override fun calculateAgeInSeconds(): Long {
        return super.calculateAgeInSeconds()
    }
}

fun test() {
    val person = Person("john", 39)

    //nullable value
    val john: Person? = null

    //Elvis operator
    val name: String = person?.name ?: ""
}

interface MyInterface {
    fun foo(): Int
    fun bar(): String
}

