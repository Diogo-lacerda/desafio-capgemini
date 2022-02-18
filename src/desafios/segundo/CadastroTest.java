package desafios.segundo;

import desafios.exceptions.SenhaPossuiMinimoUmNumeroException;
import desafios.exceptions.SenhaPossuirMinimoUmaLetraMinusculaExcption;
import desafios.exceptions.SenhaTamanhoInvalidoException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CadastroTest {
    @Test
    void sucessoQuandoExecutarCadastros() {
        assertDoesNotThrow(()->Cadastro.executarCadastros("diogo","Wst12@3"));
    }
    @Test
    void falhaQuandoExecutarCadastrosTamanhoSenhaInvalida() {
        assertThrows(SenhaTamanhoInvalidoException.class,()->Cadastro.executarCadastros("diogo","Wst1@"));
    }
    @Test
    void falhaQuandoExecutarCadastrosSenhaPossuiMinimoUmNumero() {
        assertThrows(SenhaPossuiMinimoUmNumeroException.class,()->Cadastro.executarCadastros("diogo","Wst@ghf"));
    }
    @Test
    void falhaQuandoExecutarCadastrosSenhaPossuiMinimoUmaLetraMinuscula() {
        assertThrows(SenhaPossuirMinimoUmaLetraMinusculaExcption.class,()->Cadastro.executarCadastros("diogo","EST1@GHF"));
    }


}