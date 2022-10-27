import classes.Pessoa;
import classes.Trabalhador;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();
        Trabalhador trabalhador = new Trabalhador();
        pessoa.setIdade(13);
        pessoa.setNome("Eduardo");

        System.out.println(
            "Nome " + pessoa.getNome() + "Idade: " + pessoa.getIdade()
        );

        trabalhador.setIdade(13);
        trabalhador.setNome("Eduardo");
        trabalhador.fazCompras("NAO");
        trabalhador.trabalha("SIM");
        trabalhador.setDinheiro(300000);
    
        System.out.println(
            "Nome " + trabalhador.getNome() + "Idade: " + trabalhador.getIdade()
        );


    }
}
