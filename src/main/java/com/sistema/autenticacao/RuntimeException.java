package com.sistema.autenticacao;

public class RuntimeException {
    static void ErroUser(User usuario) {

        if (usuario.getUsuario().length() > 30) {
            System.out.println(usuario.getUsuario() + " Nome deve conter no maximo 30 caracteres!");
        }
    }

    static void ErroSenha(Password senha) {
        if (senha.getSenha().length() > 30) {
            System.out.println("A senha deve conter no maximo 30 caracteres!");
        }

        if (!senha.getSenha().contains("!") && !senha.getSenha().contains("@") && !senha.getSenha().contains("#")
                && !senha.getSenha().contains("#")) {
            System.out.println("A senha deve conter pelo menos um caracter especial, incluindo '!' '@' '#' '$'");
        }

        if (!senha.getSenha().contains("0") && !senha.getSenha().contains("1") && !senha.getSenha().contains("2")
                && !senha.getSenha().contains("3")
                && !senha.getSenha().contains("4") && !senha.getSenha().contains("5")
                && !senha.getSenha().contains("6") && !senha.getSenha().contains("7")
                && !senha.getSenha().contains("8") && !senha.getSenha().contains("9")) {
            System.out.println("A senha deve conter pelo menos um numero de 0 a 9");
        }
        boolean LetraMaiuscula = false;
        for (int i = 0; i < senha.getSenha().length(); i++) {
            char caracter = senha.getSenha().charAt(i);
            if (Character.isUpperCase(caracter)) {
                LetraMaiuscula = true;
            } else if (!LetraMaiuscula) {
                System.out.println("A senha deve cinter pelo menos uma letra maiuscula");
                break;
            }
        }
    }
}
