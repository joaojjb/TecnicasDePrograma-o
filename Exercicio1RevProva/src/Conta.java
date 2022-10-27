public class Conta extends ContaAbstrata {

    public Conta(int numero){
        super(numero);
    }
   
    public void saque(double valorSaque){
       this.setSaldo(getSaldo() - valorSaque);
    }
}
