import java.util.ArrayList;

public class App{
    public static void main(String[] args) throws Exception {
        Randomizador random = new Randomizador();
        ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
        
        for(int i = 0; i < 10; i ++){
            Funcionario funcionario = new Funcionario();
            
            funcionario.setTelefone(random.geraTelefone());
            funcionario.setSalario(random.geraSalario());
            funcionario.setNome(random.geraNome());

            listaFuncionario.add(funcionario);
        }
        
        for(int i = 0; i < listaFuncionario.size(); i ++){
            Funcionario func = new Funcionario();
            func = listaFuncionario.get(i);
            System.out.println("Nome                                      Salario\n" +
            func.getNome() + "                             "  + func.getSalario() + "\n" 
         + "Telefones: " +  func.getTelefone());
        }

       
    }
}
        
           








/*      



        Elabora um programa que:
a) Crie a classe funcionário ( Nome-String, Salario-Double e com o atributo Listatel: do tipo telefone );
b) Crie a classe telefone ( Numero-String );
c) Crie a classe principal que permita gerar 30 objetos em uma lista de funcionários e, em seguida, escreva as informações de cada funcionário no seguinte formato:

Lista de funcionários:
Nome                           Salário 
aaaaaaaaaaaaaaaaaa   9999999999999999
fones: .......................... - ............................. - ..........................
=================================
aaaaaaaaaaaaaaaaaa   9999999999999999
fones: .......................... - ............................. - ..........................
=================================
aaaaaaaaaaaaaaaaaa   9999999999999999
fones: .......................... - ............................. - ..........................
=================================

Os nomes devem possuir 20 caracteres, salário deve possuir 10 caracteres (7 inteiros e 2 decimais) e fone deve possuir 8 caracteres. Podendo gerar os dados randomicamente,
 sendo que deve-se ter 0 a 5  telefones por funcionário.
 */


