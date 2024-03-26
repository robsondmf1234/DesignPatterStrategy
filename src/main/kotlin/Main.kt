package org.example

fun main() {

    val printer = Printer()

    for (i in 0..10) {
        if (i % 2 == 0) {
            printer.printingStrategy = SimplePrintingStrategy()
        } else {
            printer.printingStrategy = ImprovedPrintingStrategy()
        }
        printer.print("Strategy Pattern Example")
    }
}

class Printer {
    var printingStrategy: PrintingStrategy? = null

    fun print(text: String) {
        printingStrategy?.execute(text)
    }
}

interface PrintingStrategy {
    fun execute(text: String)
}

class SimplePrintingStrategy : PrintingStrategy {
    override fun execute(text: String) {
        println("Simple: $text")
    }
}

class ImprovedPrintingStrategy : PrintingStrategy {
    override fun execute(text: String) {
        println("Improved: $text")
    }
}