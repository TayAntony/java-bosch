package com.company.muitosParaMuitos;

import java.util.ArrayList;

public class Aluno {
    String nome;
    ArrayList<Curso> cursos = new ArrayList<>();

    public Aluno(String nome) {
        this.nome = nome;
    }

    void adicionarCurso(Curso curso){
        this.cursos.add(curso);
        curso.alunos.add(this);
    }
}
