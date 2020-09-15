package br.com.digitalhouse.ex2

import br.com.digitalhouse.ex1.Aluno

fun main() {

    val listaItens= mutableListOf<Item>()


    val it1=Item(1,"Mouse",2,20.0)
    val it2=Item(2,"Teclado",10,150.0)
    val it3=Item(3,"Cadeira Gamer",1,200.0)
    val it4=Item(4,"Monitor",2,80.0)

    listaItens.add(it1)
    listaItens.add(it2)
    listaItens.add(it3)
    listaItens.add(it4)

    val fat=Fatura(listaItens)
    println("Valor total da fatura: ${fat.getTotalFatura()}")
}