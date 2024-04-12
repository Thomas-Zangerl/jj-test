package com.example

fun main() {
    printer("JJ")
    printer("Max")
    printer("Tom")
    printer("Jenny")
    printer("Zap")
}


fun printer(name: String) {
    println("Hello $name")
}