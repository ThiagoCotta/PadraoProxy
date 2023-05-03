public class Administrador {
    private String nome;
    private boolean ativo;

    public Administrador(String nome, boolean ativo) {
        this.nome = nome;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean estaAtivo() {
        return ativo;
    }

    public void setAdministrador(boolean ativo) {
        this.ativo = ativo;
    }
}
