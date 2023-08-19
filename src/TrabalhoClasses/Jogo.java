package TrabalhoClasses;

public class Jogo extends Entretenimento {
    private String genero;
    private String modoDeJogo;
    private String desenvolvedores;

    public Jogo(String nome, String tipodeentreterimento, String genero, String modoDeJogo, String desenvolvedores) {
        super(nome, tipodeentreterimento);
        this.genero = genero;
        this.modoDeJogo = modoDeJogo;
        this.desenvolvedores = desenvolvedores;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getModoDeJogo() {
        return modoDeJogo;
    }

    public void setModoDeJogo(String modoDeJogo) {
        this.modoDeJogo = modoDeJogo;
    }

    public String getDesenvolvedores() {
        return desenvolvedores;
    }

    public void setDesenvolvedores(String desenvolvedores) {
        this.desenvolvedores = desenvolvedores;
    }
}

