import java.util.Random;

public class Randomizador {
    Random r = new Random();

    public int geraNumeroSorteado(int valorInicial, int valorFinal){
        int numeroSorteado = valorInicial + r.nextInt(valorFinal - valorInicial);

        return numeroSorteado;
    }
}
