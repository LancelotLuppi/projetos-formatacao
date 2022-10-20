package br.com.lancelot.orgs.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import br.com.lancelot.orgs.R
import br.com.lancelot.orgs.dao.ProdutoDao
import br.com.lancelot.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ProductListActivity : AppCompatActivity(R.layout.activity_product_list) {

    private val dao = ProdutoDao()
    private val adapter = ListaProdutosAdapter(context = this, produtos = dao.buscaTodos())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        configRecyclerView()
        configFab()
    }
    override fun onResume() {
        super.onResume()
        adapter.refresh(dao.buscaTodos())
    }

    private fun configFab() {
        val fab = findViewById<FloatingActionButton>(R.id.activity_product_list_fab)
        fab.setOnClickListener {
            goToProductForm()
        }
    }

    private fun goToProductForm() {
        val intent = Intent(this, FormProductActivity::class.java)
        startActivity(intent)
    }

    private fun configRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.activity_product_list_recyclerView)
        recyclerView.adapter = adapter
    }
}