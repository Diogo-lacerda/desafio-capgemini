package desafios.primeiro;

import java.util.ArrayList;
import java.util.List;

public class Escada {

  public static List<String> executarDegraus(int qtdDegraus) {

    List<String> degraus = new ArrayList<>();

    for (int i = 0; i < qtdDegraus; i++) {
      degraus.add(" ".repeat(qtdDegraus - i) + "*".repeat(i + 1));
    }
    return degraus;
  }
}


