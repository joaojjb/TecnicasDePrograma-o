package classes;
public class Funcionario extends Pessoa {
    private int matricula;
    private double salario;

    public Funcionario(){
        this.matricula = -1;
        this.salario = 1;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(final int matricula) {
        this.matricula = matricula;
    }
    public double getSalario() {
        return salario;
    }
    public boolean setSalario(final double salario) {
        if(salario < 1) return false;

        this.salario = salario;
        return true;
        
    }

    public double getSalarioPrimeiraParcela(){
        double salarioPrimeiraParcela = this.salario * 60/100;

        return salarioPrimeiraParcela;
    }

    public double getSalarioSegundaParcela(){
        double salarioSegundaParcela = this.salario * 40/100;

        return salarioSegundaParcela;
    }


}
