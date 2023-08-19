package TrabalhoClasses;

public class Filme extends Entretenimento {
    private float duracao;
    private String genero;

    public Filme(String nome, String descricao) {
        super(nome, descricao);
    }

    public float getDuracao() {
        return duracao;
    }
    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }


}
