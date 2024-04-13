package com.example

fun main() {
    printer("JJ")
    printer("Max")
    printer("Tom")
    printer("Jenny")
    printer("Zap")
}


fun printer(greeting: String, name: String) {
    println("$greeting $name")
}