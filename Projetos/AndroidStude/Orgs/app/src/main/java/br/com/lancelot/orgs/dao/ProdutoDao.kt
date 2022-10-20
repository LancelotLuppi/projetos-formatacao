package br.com.lancelot.orgs.dao

import br.com.lancelot.orgs.model.Produto

class ProdutoDao {


    companion object {
        private val produtos = mutableListOf<Produto>()
    }

    fun adiciona(produto: Produto){
        produtos.add(produto)
    }

    fun buscaTodos() : List<Produto> {
        return produtos.toList()
    }

}