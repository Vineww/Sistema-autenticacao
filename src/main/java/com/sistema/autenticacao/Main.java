package com.sistema.autenticacao;

//Main.java
public class Main {
    public static void main(String[] args) {
        User usuario = new User();
        Password senha = new Password();

        Cadastro.cadastro(usuario, senha);
        RuntimeException.ErroUser(usuario);
        RuntimeException.ErroSenha(senha);
    }
}