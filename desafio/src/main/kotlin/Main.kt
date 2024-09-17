import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)


    println("Informe um número para verificar se pertence à sequência de Fibonacci:")
    val numberToCheck = scanner.nextInt()

    // verificar se um número pertence à sequência de Fibonacci
    if (isFibonacci(numberToCheck)) {
        println("$numberToCheck pertence à sequência de Fibonacci.")
    } else {
        println("$numberToCheck não pertence à sequência de Fibonacci.")
    }
}

// Função que verifica se um número pertence à sequência de Fibonacci
fun isFibonacci(number: Int): Boolean {
    if (number < 0) return false

    var a = 0
    var b = 1

    if (number == a || number == b) return true

    while (b < number) {
        val next = a + b
        a = b
        b = next
    }

    return b == number
}
