package one.digitalinovation.digionebank.testes

import one.digitalinovation.digionebank.Cliente
import one.digitalinovation.digionebank.ClienteTipo

fun main() {
    val lorena = Cliente(
        "Lorena Almeida Moraes",
        "189.988.988-88",
        ClienteTipo.PF,
        "54321"
    )

    println(lorena)
    TesteAutenticacao().autentica(lorena)
}