package com.example

fun main() {
    printer("JJ")
    printer("Max")
    printer("Tom")
    printer("Jenny")
}


fun printer(name: String) {
    println("Hello $name")
}