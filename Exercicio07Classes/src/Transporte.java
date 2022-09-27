public class Transporte {
    private boolean ligado;
    private int velocidade;



    public int getVelocidade() {
        return velocidade;
    }

    public boolean setVelocidade(int velocidade) {
        if(velocidade < 0) return false;
        this.velocidade = velocidade;
        return true;
    }

    public void liga(){
        this.ligado = true;
    }

    public void desliga(){
        this.ligado = false;
        this.velocidade = 0;
    }
}
