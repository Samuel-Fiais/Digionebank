package one.digitalinovation.digionebank.testes

import one.digitalinovation.digionebank.Banco

fun main() {
    val difiOneBank = Banco("DigiOne", 12)
    println(difiOneBank.nome)
    println(difiOneBank.numero)
    println(difiOneBank.info())

    val santander = difiOneBank.copy(nome = "Santander", numero = 34)
    println(santander.nome)
    println(santander.numero)
    println(santander.info())
}