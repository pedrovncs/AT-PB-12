package com.infnet.tp7;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private int codigo;
    private Disciplina disciplina;
    private Professor professor;
    private List<Aluno> alunos;

    public Turma(int codigo, Disciplina disciplina, Professor professor) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public String addAluno(Aluno aluno) {
        if (alunos.size() >= 10) {
            return "Turma cheia!";
        } else {
            alunos.add(aluno);
            return "Aluno adicionado com sucesso!";
        }
    }

    public boolean abrirTurma(){
        return alunos.size() >= 2;
    }

    public String gerarPauta(){
        String pauta = "Pauta da turma \n" + codigo + " - " + disciplina.getNome() + "\n";
        for (Aluno aluno : alunos) {
            pauta += aluno.getMatricula() + " - " + aluno.getNome() + "\n";
        }
        return pauta;
    }
}
