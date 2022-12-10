import java.util.ArrayList;
import java.util.Random;
public class Randomizador {
    Random r = new Random();

    public String geraNome() {
        String nomeString = "";
        for(int i = 0; i < 13; i ++){
            int nome = 65 + r.nextInt(90 - 65);
            char nomeChar = (char)nome;
            nomeString+= Character.toString(nomeChar);
        }
        return nomeString.toUpperCase();
    }

    public ArrayList<Integer> geraPalpites(int valorInicial, int valorFinal, int quantidadeDePalpites){
        ArrayList<Integer> listaDePalpites = new ArrayList<>();

        for(int j = 0; j < quantidadeDePalpites; j++){
            int palpite = valorInicial + r.nextInt(valorFinal - valorInicial);
            listaDePalpites.add(palpite);
        }
        return listaDePalpites;
    }

    public int geraNumeroSorteado(int valorInicial, int valorFinal){
        int numeroSorteado = valorInicial + r.nextInt(valorFinal - valorInicial);

        return numeroSorteado;
    }

}
