package classes;

public class Professor  extends Funcionario{


    public double getSalarioPrimeiraParcela(){
        double salarioIntegralProfessor = super.getSalario();

        return salarioIntegralProfessor;
    }

    public double getSalarioSegundaParcela(){
        double salarioSegundaParcela = super.getSalario() * 0;

        return salarioSegundaParcela;
    }
    
}
