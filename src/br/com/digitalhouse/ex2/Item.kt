package br.com.digitalhouse.ex2

class Item(val numero:Int, val descricao:String, var quantidade:Int,var preco:Double) {
    init{
        if(this.quantidade<0) quantidade=0
        if(this.preco<0) preco=0.0
    }
}