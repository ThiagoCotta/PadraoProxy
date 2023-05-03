import java.util.Arrays;
import java.util.List;

public class Usuario implements IUsuario {

    private Integer id;
    private String nome;
    private String servidor;
    private Integer nivel;

    public Usuario(int id) {
        this.id = id;
        Usuario objeto = BD.getUsuario(id);
        this.nome = objeto.nome;
        this.servidor = objeto.servidor;
        this.nivel = objeto.nivel;
    }

    public Usuario(Integer id, String nome, String servidor, Integer nivel) {
        this.id = id;
        this.nome = nome;
        this.servidor = servidor;
        this.nivel = nivel;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public List<String> obterDadosUsuario() {
        return Arrays.asList(this.nome, this.servidor);
    }

    @Override
    public Integer obterNivel(Administrador administrador) {
        return this.nivel;
    }
}
