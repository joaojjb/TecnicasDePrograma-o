import classes.Pessoa;
import classes.Funcionario;
import classes.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();
        Professor professor = new Professor();


        pessoa.setNome("Mario");
        pessoa.setSobrenome("Lopes");
        System.out.println(
            pessoa.getNomeCompleto()
        );

        System.out.println(" \n");

        funcionario.setNome("Lucas");
        funcionario.setSobrenome("Mendes");
        funcionario.setSalario(2000.00);
        funcionario.setMatricula(1);

        System.out.printf(
            funcionario.getNomeCompleto() 
            + " " + funcionario.getSalarioPrimeiraParcela()
            + " " + funcionario.getSalarioSegundaParcela() 
            + " " + funcionario.getMatricula()
        );

        System.out.println(" \n");

        professor.setNome("Rafael");
        professor.setSobrenome("Lira");
        professor.setSalario(500.00);
        professor.setMatricula(2);
        System.out.print(
            professor.getNomeCompleto() 
            + " " + professor.getSalarioPrimeiraParcela()
            + " " + professor.getMatricula()
        );



    }
}
