package br.com.digitalhouse.ex3

import sun.font.TrueTypeFont

class Estoque(var nome: String, var qtdAtual:Int,var qtdMinima:Int) {

    fun mudarNome(nome:String){
        this.nome=nome
    }

    fun mudarQtdMinima(qtdMinima:Int){
        this.qtdMinima=qtdMinima
    }

    fun repor(qtd:Int){
        this.qtdAtual+=qtd
    }

    fun darBaixa(qtd:Int){
        if(this.qtdAtual-qtd<qtdMinima) println("Não foi possível dar baixa. Quantidade insuficiente.")
        else qtdAtual-=qtd
    }

    fun mostra() :String{
        return "Produto: $nome -- Quantidade Atual:$qtdAtual -- Quantidade mínima:$qtdMinima"
    }

    fun precisaRepor() :Boolean{
        return qtdAtual<=qtdMinima
    }
}