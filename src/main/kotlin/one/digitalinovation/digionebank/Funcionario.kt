package one.digitalinovation.digionebank

import java.math.BigDecimal

abstract class Funcionario(
    nome: String,
    cpf: String,
    var salario: Double
): Pessoa(nome, cpf) {
    protected abstract fun calculoAuxilio(): Double

    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Salário: R$ $salario
        Auxílio: R$ ${calculoAuxilio()}
    """.trimIndent()
}