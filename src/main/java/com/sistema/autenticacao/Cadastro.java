package com.sistema.autenticacao;

import java.util.Scanner;

public class Cadastro {

    public static void cadastro(){
        //Declarações
        Scanner myObj = new Scanner(System.in);
        User usuario = new User();
        Password senha = new Password();
        
        //ID de usuário
        System.out.println("Usuario: ");
        usuario.setUsuario(myObj.nextLine());
        RuntimeException.ErrorUserID(usuario);

        //senha de usuário
        System.out.println("Senha: ");
        senha.setsenha(myObj.nextLine());
        RuntimeException.ErrorUserPassword(senha);

        myObj.close();
    }
}
