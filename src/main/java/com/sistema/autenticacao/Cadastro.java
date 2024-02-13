package com.sistema.autenticacao;

import java.util.Scanner;

public class Cadastro {

    public static void cadastro(){
        //Declarações
        Scanner myObj = new Scanner(System.in);
        User usuario = new User();
        
        //Lógica
        System.out.println("Usuario: ");
        usuario.setUsuario(myObj.nextLine());

        myObj.close();
    }
}
