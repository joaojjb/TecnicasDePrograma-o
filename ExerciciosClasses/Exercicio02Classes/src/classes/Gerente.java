package classes;

public class Gerente extends Funcionario{

    public Gerente(){
       super();
        
    }


   public float calculaAumentaSalario(){
        float salarioBase = super.getSalario();
        return salarioBase + (salarioBase * 15/100);
   }


    
}
