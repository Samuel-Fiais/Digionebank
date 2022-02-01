package one.digitalinovation.digionebank.testes

import one.digitalinovation.digionebank.Analista

fun main() {
    val samuel = Analista("Samuel Fiais", "123.456.789-10", 2500.0)

    ImprimeRelatorioFuncionario.imprime(samuel)
}

