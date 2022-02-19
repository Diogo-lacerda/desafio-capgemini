package desafios.terceiro;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import desafios.exceptions.PalavraAnagramaTamanhoInvalidoExcpetion;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class AnagramaTest {

  @Test
  void sucessoQuandoExecutarAnagrama() {
    List<String> anagramaEsperado = getAnagramaEsperadoOvo();

    List<String> anagrama = Anagrama.executarAnagrama("ovo");

    assertNotNull(anagrama);
    assertEquals(6, anagrama.size());
    assertEquals(anagramaEsperado, anagrama);
  }

  @Test
  void sucessoQuandoExecutarAnagramaContendoEspaco() {
    List<String> anagramaEsperado = getAnagramaEsperadoOvo();

    List<String> anagrama = Anagrama.executarAnagrama(" o    vo    ");

    assertNotNull(anagrama);
    assertEquals(6, anagrama.size());
    assertEquals(anagramaEsperado, anagrama);
  }

  @Test
  void falhaQuandoExecutarAnagramaComPalavraTamanhoInvalido() {
    assertThrows(PalavraAnagramaTamanhoInvalidoExcpetion.class,
        () -> Anagrama.executarAnagrama("da"));
  }

  private List<String> getAnagramaEsperadoOvo() {
    List<String> anagramaEsperado = new ArrayList<>();
    anagramaEsperado.add("ovo");
    anagramaEsperado.add("oov");
    anagramaEsperado.add("voo");
    anagramaEsperado.add("voo");
    anagramaEsperado.add("ovo");
    anagramaEsperado.add("oov");
    return anagramaEsperado;
  }
}
