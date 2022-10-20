//----------- Builder ----------------

/*  Por que utilizar o builder?
 *
 *      O padrão Builder serve para instanciar
 *      objetos de maneira mais organizada e
 *      declarativa, organizando seus parâmetros
 *      e melhorando o código
 *
 *
 *
 *  Classe Dialog com construtor privado para impedir
 *  inicialização direta no main:
 */
class Dialog private constructor(
    private var dialogId: Int? = null,
    private var title: String? = null,
    private var message: String? = null,
    private var positiveButton: String? = null,
    private var negativeButton: String? = null
) {

    data class Builder( // Sub-classe para criar um Dialog
        private var dialogId: Int? = null,
        private var title: String? = null,
        private var message: String? = null,
        private var positiveButton: String? = null,
        private var negativeButton: String? = null
    ) {
        fun trackDialogById(dialogId: Int) = apply {
            this.dialogId = dialogId
        }
        fun withTitle(title: String) = apply {
            this.title = title
        }
        fun withMessage(message : String) = apply {
            this.message = message
        }
        fun withPositiveButton(positiveButton: String) = apply {
            this.positiveButton = positiveButton
        }
        fun withNegativeButton(negativeButton: String) = apply {
            this.negativeButton = negativeButton
        }

        fun build() = Dialog( // Função para instanciar o Dialog
            dialogId = this.dialogId,
            title = this.title,
            message = this.message,
            positiveButton = this.positiveButton,
            negativeButton = this.negativeButton
        )
    }

    fun show() {
        println("Dialog ID: $dialogId")
        println("Title: $title")
        println("Message: $message")
        println("Positive Button: $positiveButton")
        println("Negative Button: $negativeButton")

    }

}
