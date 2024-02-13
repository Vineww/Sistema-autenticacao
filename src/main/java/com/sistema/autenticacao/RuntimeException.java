package com.sistema.autenticacao;

public class RuntimeException{
    static void ErrorUserID(User usuario){

        if(usuario.getUsuario().length() > 30){
            System.out.println(usuario.getUsuario() + " Nome deve conter no maximo 30 caracteres!");
        }
    }

    static void ErrorUserPassword(Password senha){
        if(senha.getSenha().length() > 30){
            System.out.println("A senha deve conter no maximo 30 caracteres!");
        }
    }
}
