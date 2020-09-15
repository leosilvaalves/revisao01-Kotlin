package br.com.digitalhouse.ex1

class Professor(nome:String, val RD: Int) : Pessoa(nome) {

    fun darAula(aula: Aula){
        println("O professor $nome está dando aula de ${aula.materia.nome} ")
    }

    fun fazerChamada(){
        println("O professor $nome começou a fazer a chamada.")
    }
}