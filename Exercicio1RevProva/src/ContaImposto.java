public class ContaImposto extends ContaAbstrata {

    private double imposto;

    public ContaImposto(int numero){
        super(numero);
        this.imposto = 10/100;
    }

    public void saque(double valorSaque){
        this.setSaldo(getSaldo() - valorSaque);
     }
}
