package model;

public abstract class Lixo implements InterLixos {
    private String nomeLixo;
    private int qtd;

    public Lixo(String nl, int qt) {
        this.setNomeLixo(nl);
        this.setQtd(qt);
    }

    public String getNomeLixo() {
        return nomeLixo;
    }

    public void setNomeLixo(String nomeLixo) {
        this.nomeLixo = nomeLixo;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }


    
}
