open class Funcionario(
    var nome: String,
    var cpf: String,
    var salario: Double
) {


    open fun bonificacao(): Double {
        return salario * 0.1
    }


}