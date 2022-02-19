package desafios.terceiro;

import desafios.exceptions.PalavraAnagramaTamanhoInvalidoExcpetion;
import java.util.ArrayList;
import java.util.List;

public class Anagrama {

  public static List<String> executarAnagrama(String palavra) {
    if (palavra.length() <= 2) {
      throw new PalavraAnagramaTamanhoInvalidoExcpetion(
          "O tamanho da palavra deve ser maior que 2");
    }

    palavra = retiraEspaco(palavra);

    char[] vetor = quebraPalavra(palavra);

    List<String> palavrasAnagrama = new ArrayList<>();
    calculaAnagrama(vetor, palavrasAnagrama, 0);

    return palavrasAnagrama;
  }

  private static String mostra(char[] vetor) {
    StringBuilder palavraAnagrama = new StringBuilder();
    for (char c : vetor) {
      palavraAnagrama.append(c);
    }
    return palavraAnagrama.toString();
  }

  private static String retiraEspaco(String palavra) {
    return palavra.replace(" ", "");
  }

  private static void calculaAnagrama(char[] vetor,
      List<String> palavrasAnagrama, int k) {

    if (k == vetor.length - 1) {
      String palavraAnagrama = mostra(vetor);
      palavrasAnagrama.add(palavraAnagrama);
    } else {
      calculaAnagrama(vetor, palavrasAnagrama, k + 1);
      for (int i = k + 1; i < vetor.length; i++) {
        trocaPosicao(vetor, k, i);
        calculaAnagrama(vetor, palavrasAnagrama, k + 1);
        trocaPosicao(vetor, k, i);
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
    char[] vetor = new char[palavra.length()];
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = palavra.charAt(i);
    }
    return vetor;
  }
}




