// Design Patterns - Kotlin Android


interface Currency {

    fun getSymbol(): String

}
class Euro: Currency {
    override fun getSymbol() = "EUR"
}
class Real: Currency {
    override fun getSymbol() = "BRL"
}
interface Country {
    data class Brazil(val currency: Currency) : Country
    data class TheNetherlands(val currency: Currency) : Country
}
class CurrencyFactory {
    companion object {
        fun createCurrency(country: Country): Currency {
            return when (country) {
                is Country.Brazil -> Real()
                is Country.TheNetherlands -> Euro()
                else -> throw Exception("Could not generate currency for $country")
            }
        }
    }
}


fun main() {

// Usando o Builder:
//    val dialog: Dialog = Dialog.Builder()
//        .trackDialogById(89)
//        .withTitle("Edit Content")
//        .withMessage("Are you sure about that?")
//        .withPositiveButton("Save")
//        .withNegativeButton("Don't save")
//        .build()
//    dialog.show()



}

//fun navigateToNewScreen() {
//    val appAnalytics = Singleton.AppAnalytics
//    appAnalytics.trackUser()
//    appAnalytics.totalTracks()
//}