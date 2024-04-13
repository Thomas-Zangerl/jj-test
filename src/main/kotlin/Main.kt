package com.example

fun main() {
    printer("Hello", "JJ")
    printer("Hello", "Max")
    printer("Hello", "Tom")
    printer("Hej", "Jenny")
    printer("Hej", "Zap")

    println("\nBye!")
}


fun printer(greeting: String, name: String) {
    println("$greeting $name")
}