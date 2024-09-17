import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)


    println("Informe uma string para verificar a presença e a quantidade de ocorrências da letra 'a':")
    val inputString = scanner.nextLine()

    // Conta as ocorrências da letra 'a'
    val count = countOccurrencesOfA(inputString)

    // Verifica se a letra 'a' está presente e exibe o resultado
    if (count > 0) {
        println("A letra 'a' (maiúscula ou minúscula) ocorre $count vez(es) na string.")
    } else {
        println("A letra 'a' (maiúscula ou minúscula) não ocorre na string.")
    }
}

// Função para contar as ocorrências da letra 'a' (maiúscula e minúscula)
fun countOccurrencesOfA(input: String): Int {
    return input.count { it.equals('a', ignoreCase = true) }
}
