package classes;
public class Carro extends Transporte {
    private int quilometragem;

    public Carro(){
        super();
        this.quilometragem = 0;
    }
    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(final int quilometragem) {
        if(quilometragem < 0 || quilometragem > 999999) this.quilometragem = 1;
        this.quilometragem = quilometragem;
    }
    
    public void setVelocidade(){
        int velocidade = super.getVelocidade();
        if(velocidade < 0 || velocidade > 200) this.setVelocidade(1);
        setVelocidade(velocidade);
    }
}
