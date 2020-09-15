package br.com.digitalhouse.ex2

class Fatura (val listaItens:MutableList<Item>){

    fun getTotalFatura():Double{
        var total=0.0

        for(it in listaItens){
            total+=it.preco*it.quantidade
        }
        return total
    }
}