package classes;
public class Equipamento {
    private boolean ligado;
    
    public boolean isLigado() {
        return ligado;
    }

    public Equipamento(){
        this.ligado = false;
    }

    public void liga(){
        this.ligado = true;
    }

    public void desliga(){
        this.ligado = false;
    }
}
