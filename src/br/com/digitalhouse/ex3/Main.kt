package br.com.digitalhouse.ex3

fun main() {
    val est1=Estoque("Creme dental",100,50)

    est1.darBaixa(10)
    println(est1.precisaRepor())

    println(est1.mostra())

}