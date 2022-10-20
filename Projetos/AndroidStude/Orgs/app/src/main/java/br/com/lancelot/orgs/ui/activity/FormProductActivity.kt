package br.com.lancelot.orgs.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import br.com.lancelot.orgs.R
import br.com.lancelot.orgs.dao.ProdutoDao
import br.com.lancelot.orgs.model.Produto
import java.math.BigDecimal

class FormProductActivity :
    AppCompatActivity(R.layout.activity_form_product) {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            configSaveButton()
        }

    private fun configSaveButton() {
        val botaoSalvar = findViewById<Button>(R.id.activity_form_botao_salvar)
        val dao = ProdutoDao()
        botaoSalvar.setOnClickListener {
            val produtoCriado = createProduct()
            dao.adiciona(produtoCriado)
            finish()
        }
    }

    private fun createProduct(): Produto {
        val campoNome = findViewById<EditText>(R.id.activity_form_nome)
        val nome = campoNome.text.toString()
        val campoDescricao = findViewById<EditText>(R.id.activity_form_descricao)
        val descricao = campoDescricao.text.toString()
        val campoValor = findViewById<EditText>(R.id.activity_form_valor)
        val valorEmTexto = campoValor.text.toString()
        val valor = if (valorEmTexto.isBlank()) {
            BigDecimal.ZERO
        } else {
            BigDecimal(valorEmTexto)
        }

        return Produto(
            nome = nome,
            descricao = descricao,
            valor = valor
        )
    }
}