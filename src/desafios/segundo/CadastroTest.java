package desafios.segundo;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import desafios.exceptions.SenhaPossuiMinimoUmNumeroException;
import desafios.exceptions.SenhaPossuirMinimoUmaCaracterExcption;
import desafios.exceptions.SenhaPossuirMinimoUmaLetraMaiusculaExcption;
import desafios.exceptions.SenhaPossuirMinimoUmaLetraMinusculaExcption;
import desafios.exceptions.SenhaTamanhoInvalidoException;
import org.junit.jupiter.api.Test;

class CadastroTest {
    @Test
    void sucessoQuandoExecutarCadastros() {
        assertDoesNotThrow(()->Cadastro.executarCadastros("diogo","Wst12@3"));
    }
    @Test
    void falhaQuandoExecutarCadastrosTamanhoSenhaInvalida() {
        assertThrows(SenhaTamanhoInvalidoException.class,
            () -> Cadastro.executarCadastros("diogo", "Wst1@"));
    }

    @Test
    void falhaQuandoExecutarCadastrosSenhaPossuiMinimoUmNumero() {
        assertThrows(SenhaPossuiMinimoUmNumeroException.class,
            () -> Cadastro.executarCadastros("diogo", "Wst@ghf"));
    }

    @Test
    void falhaQuandoExecutarCadastrosSenhaPossuiMinimoUmaLetraMinuscula() {
        assertThrows(SenhaPossuirMinimoUmaLetraMinusculaExcption.class,
            () -> Cadastro.executarCadastros("diogo", "EST1@GHF"));
    }

    @Test
    void falhaQuandoExecutarCadastrosSenhaPossuiMinimoUmaLetraMaiuscula() {
        assertThrows(SenhaPossuirMinimoUmaLetraMaiusculaExcption.class,
            () -> Cadastro.executarCadastros("diogo", "wer1@fg"));
    }

    @Test
    void falhaQuandoExecutarCadastrosSenhaPossuiMinimoUmCaracter() {
        assertThrows(SenhaPossuirMinimoUmaCaracterExcption.class,
            () -> Cadastro.executarCadastros("diogo", "weR1fg4"));
    }

}
