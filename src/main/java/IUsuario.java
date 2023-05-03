import java.util.List;

public interface IUsuario {
    List<String> obterDadosUsuario();
    Integer obterNivel(Administrador administrador);
}
