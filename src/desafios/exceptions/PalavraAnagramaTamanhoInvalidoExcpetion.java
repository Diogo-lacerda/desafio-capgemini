package desafios.exceptions;

public class PalavraAnagramaTamanhoInvalidoExcpetion extends RuntimeException {

  private String descricao;

  public PalavraAnagramaTamanhoInvalidoExcpetion(String descricao) {
    super(descricao);
  }
}
