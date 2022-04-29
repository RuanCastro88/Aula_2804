package com.company;

public class Teste {
    public static void main(String[] args) {
        //Definir dois alunos; matricular os dois, cancelar a matricula do segundo
        //Mostra os dados do primeiro
        Aluno alunoJoao = new Aluno();
        Aluno alunoPedro = new Aluno();
        alunoJoao.rm = 1234;
        alunoJoao.nome = "João Antonio da Silva ";
        alunoJoao.email = "emaildojão@hotmail.com ";
        alunoJoao.usuario = "usujão ";
        alunoJoao.senha = "12345";

        alunoPedro.rm = 4321;
        alunoPedro.nome = "Pedro Henrique Leandro de Jesus ";
        alunoPedro.email = "herinque.pedrinhogamer@gmail.com ";
        alunoPedro.usuario = "pdrinhogameplays ";
        alunoPedro.senha = "4321";

        alunoJoao.matricular();
        alunoPedro.matricular();

        alunoPedro.cancelarMatricular();

        alunoJoao.listarDadosAlunos();


    }
}