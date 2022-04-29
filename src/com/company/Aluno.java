package com.company;

public class Aluno {
    //Definindo atributos
    int rm;
    String nome;
    String email;
    String usuario;
    String senha;

    //Definir metodos
    void matricular(){
        //logica de como matricular
        System.out.println("Aluno" + nome + "foi matriculado com sucesso");

    }
    void cancelarMatricular(){
        //Logica de como cancelar matricula
        System.out.println("Aluno" + nome + "cancelou sua matrícula");

    }
    void transferirDeEscola(){
        //Logica de como tranferir um aluno
        System.out.println("Aluno" + nome + "teve deferimento de tranferencia");

    }
    void listarDadosAlunos(){
        //mostrar os dados do aluno na tela, menos a senha
        System.out.println("Dados do aluno de rm:" + rm);
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Usuario: " + usuario);

    }
}