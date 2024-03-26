package org.example

// Função principal do programa
fun main() {

    // Cria uma nova instância da classe Printer
    val printer = Printer()

    // Loop de 0 a 10
    for (i in 0..10) {
        // Se o número atual for par, define a estratégia de impressão como SimplePrintingStrategy
        if (i % 2 == 0) {
            printer.printingStrategy = SimplePrintingStrategy()
        }
        // Se o número atual for ímpar, define a estratégia de impressão como ImprovedPrintingStrategy
        else {
            printer.printingStrategy = ImprovedPrintingStrategy()
        }
        // Chama a função print do objeto Printer com a string "Strategy Pattern Example"
        printer.print("Strategy Pattern Example")
    }
}

// Classe Printer que possui uma propriedade printingStrategy que é uma instância de PrintingStrategy
class Printer {
    var printingStrategy: PrintingStrategy? = null

    // Função print que chama a função execute da estratégia de impressão atual, se houver uma definida
    fun print(text: String) {
        printingStrategy?.execute(text)
    }
}

// Interface PrintingStrategy que define uma função execute que recebe uma string como argumento
interface PrintingStrategy {
    fun execute(text: String)
}

// Classe SimplePrintingStrategy que implementa a interface PrintingStrategy
class SimplePrintingStrategy : PrintingStrategy {
    // Função execute que imprime a string fornecida, prefixada com "Simple: "
    override fun execute(text: String) {
        println("Simple: $text")
    }
}

// Classe ImprovedPrintingStrategy que também implementa a interface PrintingStrategy
class ImprovedPrintingStrategy : PrintingStrategy {
    // Função execute que imprime a string fornecida, prefixada com "Improved: "
    override fun execute(text: String) {
        println("Improved: $text")
    }
}
