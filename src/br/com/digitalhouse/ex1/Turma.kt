package br.com.digitalhouse.ex1

class Turma(val nome:String, val curso: Curso) {

    override fun toString() :String{
       return "Turma:$nome --- Curso:${curso.nome}"
    }
}