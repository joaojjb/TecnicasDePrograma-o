import classes.Funcionario;
import classes.Gerente;
import classes.Assistente;
import classes.AssistenteAdministrativo;
import classes.AssistenteTecnico;
import java.util.Scanner;





public class App {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Assistente asis = new Assistente();
        Gerente teste = new Gerente();
        AssistenteAdministrativo assistenteAdministrativo = new AssistenteAdministrativo();
        float salario;

        //Gerente
        //System.out.println("Insira seu Salario: ");
        //salario = input.nextFloat();

        //teste.setNome("José");
        //teste.setCpf("04742599195");
        //teste.setRg("5690560");
        //teste.setSalario(salario);
        //teste.calculaAumentaSalario(salario);

        //System.out.println(
         //   teste.exibeDados()
        //);


        //Funcionario Padrão
       // System.out.println("Insira salário");
        //salario = input.nextFloat();

       // asis.setNome("José");
        //asis.setCpf("04742599195");
       // asis.setRg("5690560");
        //asis.setSalario(salario);

        
        
        System.out.println("Insira seu Salario: ");
        salario = input.nextFloat();
        //Assistente Administrativo
        assistenteAdministrativo.setNome("José");
        assistenteAdministrativo.setCpf("04742599195");
        assistenteAdministrativo.setRg("5690560");
        assistenteAdministrativo.setTurno("NOTURNO");
        assistenteAdministrativo.setSalario(salario);
        assistenteAdministrativo.setSalarioBonus();
    

        System.out.println(
            assistenteAdministrativo.exibeDados()//
        );
    }
}
