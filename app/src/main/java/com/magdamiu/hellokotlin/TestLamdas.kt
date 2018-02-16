package com.magdamiu.hellokotlin

/**
 * Created by magda on 16/02/2018.
 */

fun testLamdas() {
    val sum1: (Int, Int) -> Int = { x, y -> x + y }
    val sum2 = { x: Int, y: Int -> x + y }
    doOp(3, 4, sum1)
    val multiply: (Int, Int) -> Int = { x, y -> x * y }

    doOp(2, 3, multiply)
    doOp(4, 3, { x, y -> x - y })

    doOp(4, 3) { x, y ->
        x - y
    }
}

fun doOp(x: Int, y: Int, f: (Int, Int) -> Int): Int {
    return f(x, y)
}