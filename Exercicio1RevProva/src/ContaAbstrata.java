public abstract class ContaAbstrata {
    private int numero;
    private double saldo;

    public ContaAbstrata(int numero){
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double depositar(double deposito){
        this.saldo+= deposito;
        return getSaldo();
    }

    public abstract void saque(double valorSaque);

 
    
}

