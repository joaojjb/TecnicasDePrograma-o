public class ContaEspecial extends Conta {

    private double bonus;

    public ContaEspecial(int numero){
         super(numero);
         this.bonus = 10/100;
    }

    @Override
    public double depositar(double deposito){
        this.setSaldo(getSaldo() + (deposito * bonus) + deposito);
        return getSaldo();
    }
    
}
