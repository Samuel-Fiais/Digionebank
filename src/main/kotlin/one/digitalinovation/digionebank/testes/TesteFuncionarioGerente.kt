package one.digitalinovation.digionebank.testes

import one.digitalinovation.digionebank.Gerente

fun main() {
    val edmundo = Gerente("Edmundo Fiais Pereira", "123.456.789-10", 6350.0, "12345")
    ImprimeRelatorioFuncionario.imprime(edmundo)

    TesteAutenticacao().autentica(edmundo)
}

