

import java.util.ArrayList;

import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        int quantidadeJogadores = 0;
        int valorInicial = 0 , valorFinal = 0;
        int quantidadeDePalpites = 0;
		String nomeJogador = "";
		int palpiteJogador = 0;

		Randomizador randomizador = new Randomizador();
		ArrayList<Jogador> listaDeJogadores = new ArrayList<>();
		JogoService jogoService = new JogoService();
		
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
		
		for(int i = 0; i < quantidadeJogadores; i++){
            try {
				Jogador jogador = new Jogador();
				nomeJogador = JOptionPane.showInputDialog("Insira seu nome: ");
				jogador.setNome(nomeJogador);
			while(true){
				try {
					ArrayList<Integer> listaDePalpites = new ArrayList<>();
					for(int j = 0; j < quantidadeDePalpites; j++){	
						palpiteJogador = Integer.parseInt(JOptionPane.showInputDialog("Insira seu palpite"));
						listaDePalpites.add(palpiteJogador);
					}	
					
					//Verifica Palpites Jogadores
					if(palpiteJogador < valorInicial || palpiteJogador > valorFinal)
					{	
						throw new Exception("Todos os palpites devem estar no intervalo informado");
					}

					jogador.setPalpites(listaDePalpites);
					listaDeJogadores.add(jogador);
					break;
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,e);
					continue;
				}
			}
			}catch(Exception e){
			JOptionPane.showMessageDialog(null,e);
			}
		}


		int numeroSorteado = randomizador.geraNumeroSorteado(valorInicial, valorFinal);

		listaDeJogadores = jogoService.calculaResultado(listaDeJogadores, numeroSorteado);

		String resultado = jogoService.resultado(listaDeJogadores, numeroSorteado);
        JOptionPane.showMessageDialog(null,resultado);

	}
}
