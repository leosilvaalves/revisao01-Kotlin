package br.com.digitalhouse.ex1

class Aluno (nome:String,val sobrenome:String,val RA:Int): Pessoa(nome){

    fun assistirAula(aula: Aula){
        println("O aluno $nome está assistindo a aula da materia ${aula.materia.nome}")
    }

    fun fazerLicao(){
        println("O aluno $nome está fazendo lição...")
    }
}