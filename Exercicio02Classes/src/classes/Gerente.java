package classes;

public class Gerente extends Funcionario{

    public Gerente(){
       super();
        
    }


   public float calculaAumentaSalario(){
        float salarioBase = getSalario();
        return salarioBase + (salarioBase * 15/100);
   }


    
}
