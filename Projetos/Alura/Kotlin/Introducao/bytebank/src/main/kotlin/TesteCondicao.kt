fun testCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("Saldo positivo")
        saldo == 0.0 -> println("Saldo zerado")
        else -> println("Saldo negativo")
    }
}
/* for (i in 1..3) {
 *     println(i)
 * }
 * Saída: 1 2 3
 *
 * for (i in 6 downTo 0 step 2) {
 *      println(i)
 * }
 * Saída: 6 4 2 0
 */