fun main() {

    println("Boas vindas ao Luppibank")

    val gabriel = Funcionario(
        nome = "Gabriel",
        cpf = "222.333.111-76",
        salario = 5000.0
    )
    val lancelot = Gerente(
        nome = "Lancelot",
        cpf = "111.333.222-88",
        salario = 5000.0,
        senha = 123
    )
    val luppi = Diretor(
        nome = "Luppi",
        cpf = "333.555.777-99",
        salario = 5000.0,
        plr = 200.0,
        senha = 521
    )

    getBonificacao(gabriel)
    getBonificacao(lancelot)
    getBonificacao(luppi)

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(gabriel)
    calculadora.registra(lancelot)
    calculadora.registra(luppi)
    println("Valor total das bonificações: ${calculadora.total}")

}

fun getBonificacao(funcionario: Funcionario) {
    println("Bonificação do ${funcionario.nome}: R$${funcionario.bonificacao()}")
}