import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioProxyTest {

    @BeforeEach
    void Construtor() {
        BD.addUsuario(new Usuario(3, "Lucas", "Europa", 86));
        BD.addUsuario(new Usuario(5, "Thiago", "América do Sul", 10));
    }

    @Test
    void deveRetornarDadosPessoaisUsuario() {
        UsuarioProxy usuario = new UsuarioProxy(3);

        assertEquals(Arrays.asList("Lucas", "Europa"), usuario.obterDadosUsuario());
    }

    @Test
    void deveRetonarNivelUsuario() {
        Administrador administrador = new Administrador("Junior", true);
        UsuarioProxy usuario = new UsuarioProxy(5);

        assertEquals(10, usuario.obterNivel(administrador));
    }

    @Test
    void deveRetonarExcecaoAdmiistradorNaoAutorizadoConsultarNivelUsuario() {
        try {
            Administrador administrador = new Administrador("Clara", false);
            UsuarioProxy usuario = new UsuarioProxy(5);

            usuario.obterNivel(administrador);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Administrador não está ativo", e.getMessage());
        }
    }
}