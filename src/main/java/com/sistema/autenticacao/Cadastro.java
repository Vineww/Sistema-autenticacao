package com.sistema.autenticacao;

import java.util.Scanner;

//Cadastro.java
public class Cadastro {

    public static void cadastro(){
        //Declarações
        Scanner myObj = new Scanner(System.in);
        User usuario = new User();
        Password senha = new Password();
        
        //ID de usuário
        System.out.println("Insira seu nome de usuario: ");
        usuario.setUsuario(myObj.nextLine());
        RuntimeException.ErroUser(usuario);

        //senha de usuário
        System.out.println("Insira sua senha, a senha deve contar pelo menos um caracter maiusculo, numero e caracter especial: ");
        senha.setsenha(myObj.nextLine());
        RuntimeException.ErroSenha(senha);

        myObj.close();
    }
}
