package br.com.digitalhouse.ex1

fun main() {
    // Criando Aluno
    val listaAlunos= mutableListOf<Aluno>()
    val aluno1= Aluno("Leonardo","Alves",3178455)
    val aluno2= Aluno("Lucas","Santos",3134533)
    val aluno3= Aluno("Patricia","Souza",312100)
    val aluno4= Aluno("Charles","Rekson",231335)
    listaAlunos.add(aluno1)
    listaAlunos.add(aluno2)
    listaAlunos.add(aluno3)
    listaAlunos.add(aluno4)

    //Turma, Materia, aula, Professor, Curso
    val materia1= Materia("Probabilidade")
    val aula1= Aula(materia1,"14:30","17:30")
    val prof1= Professor("Joaquim",23455)
    val curso1= Curso("Sistemas de Informação",listaAlunos,prof1)
    val turma1= Turma("06K",curso1)


    prof1.darAula(aula1)
    prof1.fazerChamada()
    aluno1.assistirAula(aula1)
    aluno1.fazerLicao()
    println(turma1)



}