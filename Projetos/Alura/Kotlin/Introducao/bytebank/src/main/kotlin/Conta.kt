class Conta(titular: String, numero: Int) {
    private var titular: String? = null
    private var numero: Int? = null

    private var saldo: Double = 0.0
        set(valor){
            if(valor > 0){field = valor}
        }

    fun saca(valor: Double) {
        when {
            saldo >= valor -> saldo -= valor
        }
    }

    fun deposita(valor: Double) {
        when {
            valor > 0 -> saldo += valor
        }
    }

    fun transfere(valor: Double, contaDestino: Conta): Boolean {
        when {
            saldo >= valor -> {
                saldo -= valor
                contaDestino.deposita(valor)
                return true
            }
            else -> return false
        }
    }

    fun verExtrato() {
        println("Saldo ${titular}: ${saldo}")
    }

}