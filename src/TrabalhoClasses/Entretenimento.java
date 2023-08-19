package TrabalhoClasses;

public class Entretenimento {
    private String nome;
    private String tipodeentreterimento;

    public Entretenimento(String nome, String tipodeentreterimento) {
        this.nome = nome;
        this.tipodeentreterimento = tipodeentreterimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipodeentreterimento() {
        return tipodeentreterimento;
    }

    public void setTipodeentreterimento(String tipodeentreterimento) {
        this.tipodeentreterimento = tipodeentreterimento;
    }
}
