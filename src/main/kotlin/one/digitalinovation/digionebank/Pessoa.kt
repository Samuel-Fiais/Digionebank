package one.digitalinovation.digionebank

class Pessoa {
    var nome: String = "Samuel"
    var cpf: String = "166.700.736-07"
}

fun main() {
    val samuel = Pessoa()

    println(samuel.nome)
    println(samuel.cpf)
}