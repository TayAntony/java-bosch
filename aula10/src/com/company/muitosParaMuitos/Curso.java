package com.company.muitosParaMuitos;

import java.util.ArrayList;

public class Curso {
    String nome;
    ArrayList<Aluno> alunos = new ArrayList<>();

    public Curso(String nome) {
        this.nome = nome;
    }

    void adicionarAluno(Aluno aluno){
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }

    ArrayList<String>obterCurso(){
        ArrayList<String>nomes = new ArrayList<>();
        for (Aluno aluno:alunos){
            nomes.add(aluno.nome);
        }return nomes;
    }
}
