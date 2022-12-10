import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Jogo {
    public static void main(String[] args) throws Exception {
        int quantidadeJogadores = 0;
        int valorInicial = 0 , valorFinal = 0;
        int quantidadeDePalpites = 0;

        Randomizador randomizador = new Randomizador();
        ArrayList<Jogador> listaDeJogadores = new ArrayList<>();
        JogoService jogoService = new JogoService();

        while(true){
            try {
                quantidadeJogadores = Integer.parseInt(
                JOptionPane.showInputDialog("Insira a quantidade de jogadores: ", "Minímo de 3 jogadores"));

                if(quantidadeJogadores < 3){
                    throw new Exception("Insira um valor maior ou igual a 3"); 
                }
                break;
            }catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
                continue;
            }
        }
            
        while(true){
            try{
                valorInicial = Integer.parseInt(
                JOptionPane.showInputDialog("Insira o valor inicial do número à ser advinhado:"));

                valorFinal = Integer.parseInt(
                JOptionPane.showInputDialog("Insira o valor final do número à ser advinhado:"));


                if((valorFinal - valorInicial) < 49)
                {
                    throw new Exception("O intervalo do número não deve ser menor que 50");
                } 
                break;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
                continue;
            }
        }
            
        while(true){
            try{
                quantidadeDePalpites = Integer.parseInt(
                JOptionPane.showInputDialog("Insira a quantidade de palpites :", "De 1 a 4 palpites"));

                if(quantidadeDePalpites < 1 || quantidadeDePalpites > 4)
                {
                    throw new Exception("A quantidade de palpites deve estar entre 1 e 4");
                }
                break;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
                continue;
            }
        }

        //Service do Jogo
        int numeroSorteado = randomizador.geraNumeroSorteado(valorInicial, valorFinal);

        listaDeJogadores = jogoService.geraJogadores(valorInicial, valorFinal, quantidadeDePalpites, quantidadeJogadores);
        
        listaDeJogadores = jogoService.calculaResultado(listaDeJogadores, numeroSorteado);

        //Resultado do jogo
        String resultado = jogoService.resultado(listaDeJogadores, numeroSorteado);
        JOptionPane.showMessageDialog(null,resultado);
    }
}
