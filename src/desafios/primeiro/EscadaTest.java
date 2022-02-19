package desafios.primeiro;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class EscadaTest {

  @Test
  void sucessoQuandoExecutarDegraus() {
    List<String> degrausEsperado = new ArrayList<>();
    degrausEsperado.add("      *");
    degrausEsperado.add("     **");
    degrausEsperado.add("    ***");
    degrausEsperado.add("   ****");
    degrausEsperado.add("  *****");
    degrausEsperado.add(" ******");

    List<String> degraus = Escada.executarDegraus(6);

    assertNotNull(degraus);
    assertEquals(6, degraus.size());
    assertEquals(degrausEsperado, degraus);
  }
}
