package com.company.muitosParaMuitos;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Raissa");
        Aluno aluno2 = new Aluno("Tay");
        Aluno aluno3 = new Aluno("Viktor");
        Curso curso1 = new Curso("Java");
        Curso curso2 = new Curso("Python");
        Curso curso3 = new Curso("PowerBI");
        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno3);
        curso2.adicionarAluno(aluno2);

        curso3.obterCurso();

        aluno1.adicionarCurso(curso1);
        aluno2.adicionarCurso(curso2);
        aluno3.adicionarCurso(curso3);

        System.out.println(curso3.obterCurso());
    }
}
