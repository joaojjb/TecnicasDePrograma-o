public class Vip extends Ingresso {
    private float valorAdicional;

    public Vip() {
        super();
        this.valorAdicional = 260;
    }

    public float imprimiValor(){
        float valor = super.getValor();
        valor = valor + this.valorAdicional;
        return valor;
    }

    public float getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(final float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }



}
