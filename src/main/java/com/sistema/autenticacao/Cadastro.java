package com.sistema.autenticacao;

import java.util.Scanner;

//Cadastro.java
public class Cadastro {

    public static void cadastro(User usuario, Password senha){
        //Declarações
        Scanner myObj = new Scanner(System.in);
        
        //ID de usuário
        System.out.println("Insira seu nome de usuario: ");
        usuario.setUsuario(myObj.nextLine());

        //senha de usuário
        System.out.println("Insira sua senha, a senha deve contar pelo menos um caracter maiusculo, numero e caracter especial: ");
        senha.setsenha(myObj.nextLine());
        

        myObj.close();
    }
}
