package one.digitalinovation.digionebank

class Cliente(nome: String,
              cpf: String,
              val clienteTipo: ClienteTipo,
              val senha: String
) : Pessoa(nome, cpf), Logavel {
    override fun login(): Boolean = "54321" == senha

    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Conta: ${clienteTipo.descricao}
    """.trimIndent()
}