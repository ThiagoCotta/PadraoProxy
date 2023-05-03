import java.util.List;

public class UsuarioProxy implements IUsuario {

    private Usuario usuario;

    private Integer id;

    public UsuarioProxy(Integer id) {
        this.id = id;
    }

    @Override
    public List<String> obterDadosUsuario() {
        if (this.usuario == null) {
            this.usuario = new Usuario(this.id);
        }
        return this.usuario.obterDadosUsuario();
    }

    @Override
    public Integer obterNivel(Administrador administrador) {
        if (!administrador.estaAtivo()) {
            throw new IllegalArgumentException("Administrador não está ativo");
        }
        if (this.usuario == null) {
            this.usuario = new Usuario(this.id);
        }
        return this.usuario.obterNivel(administrador);
    }
}
