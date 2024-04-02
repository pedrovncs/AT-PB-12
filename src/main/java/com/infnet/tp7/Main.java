package com.infnet.tp7;

public class Main {
    public static void main(String[] args) {
        Disciplina disciplina = new Disciplina(001, "Projeto de Bloco");
        Professor professor = new Professor("LP", 101);
        Turma turma = new Turma(1234, disciplina, professor);

        Aluno aluno1 = new Aluno(100, "Mariazinha");
        Aluno aluno2 = new Aluno(101, "Joãozinho");
        System.out.println("");

        System.out.println("Turma pode ser aberta? " + turma.abrirTurma());
        System.out.println("");

        System.out.println("Adicionando 2 alunos:: ");
        System.out.println(turma.addAluno(aluno1));
        System.out.println(turma.addAluno(aluno2));
        System.out.println("Turma pode ser aberta? " + turma.abrirTurma());

        System.out.println("");
        System.out.println("Adicionando 8 alunos: ");
        for (int i = 0; i < 8; i++) {
            Aluno aluno = new Aluno(102 + i, "Aluno" + (i + 3));
            System.out.println(turma.addAluno(aluno));
        }
        System.out.println("");
        System.out.println("Tentando adicionar mais um aluno: ");
        Aluno aluno = new Aluno(110, "Aluno11");
        System.out.println(turma.addAluno(aluno));
        System.out.println("");

        System.out.println(turma.gerarPauta());
    }
}
