package desafios.segundo;

import desafios.exceptions.SenhaPossuiMinimoUmNumeroException;
import desafios.exceptions.SenhaPossuirMinimoUmaCaracterExcption;
import desafios.exceptions.SenhaPossuirMinimoUmaLetraMaiusculaExcption;
import desafios.exceptions.SenhaPossuirMinimoUmaLetraMinusculaExcption;
import desafios.exceptions.SenhaTamanhoInvalidoException;

public class Cadastro {
    public static void executarCadastros(String nome, String senha) {

        if (senha.length() <= 6) {
            System.out.println("A senha informada deve possuir no mínimo 6 caracteres");
            throw new SenhaTamanhoInvalidoException();
        }
        if (!(senha.contains("0") || senha.contains("1") || senha.contains("2") || senha.contains("3") || senha.contains("4")
                || senha.contains("5") || senha.contains("6") || senha.contains("7") || senha.contains("8") || senha.contains("9"))) {
            System.out.println("A senha informada deve possuir no mínimo um número");
            throw new SenhaPossuiMinimoUmNumeroException();
        }
        boolean temMiscula = false;
        for (char caracter : senha.toCharArray()) {
            if (caracter >= 97 && caracter <= 122) {
                temMiscula = true;
            }
        }
        if (!temMiscula) {
            System.out.println("A senha informada deve possuir no mínimo uma letra minúscula");
            throw new SenhaPossuirMinimoUmaLetraMinusculaExcption();
        }
        boolean temMaiuscula = false;
        for (char caracter : senha.toCharArray()) {
            if (caracter >= 66 && caracter <= 90) {
                temMaiuscula = true;
            }
        }
        if (!temMaiuscula) {
            System.out.println("A senha informada deve possuir no mínimo uma letra maiúscula");
            throw new SenhaPossuirMinimoUmaLetraMaiusculaExcption();
        }
        if (!(senha.contains("!") || senha.contains("@") || senha.contains("#") || senha.contains("$") || senha.contains("%")
                || senha.contains("^") || senha.contains("&") || senha.contains("*") || senha.contains("()") || senha.contains("-")
                || senha.contains("+"))) {
            System.out.println("A senha informada deve possuir no mínimo um carácter");
            throw new SenhaPossuirMinimoUmaCaracterExcption();
        }
    }
}
