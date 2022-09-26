package classes;
public class Trabalhador extends Pessoa {
    private float dinheiro;


    public Trabalhador(float dinheiro) {
        this.dinheiro = dinheiro;
    }

    public Trabalhador() {
        this.dinheiro = 0;
    }

    public float getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(float dinheiro) {
        this.dinheiro = dinheiro;
    }

    public boolean trabalha(String aux){
        if(aux == null) return false;

        return true;
    }

    public boolean fazCompras(String aux){
        if(aux == null) return false;

        return true;
    }
}
