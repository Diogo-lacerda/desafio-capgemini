package desafios.terceiro;

import java.util.Scanner;

public class Anagrama {
    public static void main(String[] args) {

        String palavra = lerPalavra();

        palavra = retiraEspaco(palavra);

        char vetor[] = quebraPalavra(palavra);

        calculaAnagrama(vetor, 0);
    }

    private static String lerPalavra() {
        Scanner digitar = new Scanner(System.in);
        String palavra = "";
        while (palavra.length() <= 2) {
            System.out.println("Digite uma Palavra:");
            palavra = digitar.nextLine();
        }
        return palavra;
    }

    private static void mostra(char[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("");
    }

    private static String retiraEspaco(String palavra) {
        String semEspaco = palavra.replaceAll(" ", "");
        return semEspaco;
    }

    private static void calculaAnagrama(char vetor[], int k) {
        int i;
        if (k == vetor.length - 1)
            mostra(vetor);
        else {
            calculaAnagrama(vetor, k + 1);
            i = k + 1;
            while (i < vetor.length) {
                trocaPosicao(vetor, k, i);
                calculaAnagrama(vetor, k + 1);
                trocaPosicao(vetor, k, i);
                i = i + 1;
            }
        }
    }

    private static void trocaPosicao(char[] vetor, int k, int i) {
        char aux;
        aux = vetor[i];
        vetor[i] = vetor[k];
        vetor[k] = aux;
    }

    private static char[] quebraPalavra(String palavra) {
        char vetor[] = new char[palavra.length()];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = palavra.charAt(i);
        }
        return vetor;
    }
}




