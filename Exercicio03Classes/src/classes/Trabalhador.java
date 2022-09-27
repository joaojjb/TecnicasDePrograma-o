package classes;
public class Trabalhador extends Pessoa {
    private float dinheiro;


    public Trabalhador(final float dinheiro) {
        this.dinheiro = dinheiro;
    }

    public Trabalhador() {
        this.dinheiro = 0;
    }

    public float getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(final float dinheiro) {
        this.dinheiro = dinheiro;
    }

    public boolean trabalha(final String aux){
        if(aux == null) return false;

        return true;
    }

    public boolean fazCompras(final String aux){
        if(aux == null) return false;

        return true;
    }
}
