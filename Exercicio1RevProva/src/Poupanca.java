public class Poupanca extends Conta {
    public Poupanca(int numero){
        super(numero);
    }

    public void renderJuros(double valorTaxa){
        this.setSaldo(getSaldo() - (valorTaxa * getSaldo()));
    }
} 
