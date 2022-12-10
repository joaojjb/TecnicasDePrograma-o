import java.util.ArrayList;

public class JogoService {
    
    public ArrayList<Jogador> calculaResultado(ArrayList<Jogador> listaDeJogadores, int numeroSorteado){
        for(int i = 0; i < listaDeJogadores.size(); i++){
            ArrayList<Integer> listaPalpites = new ArrayList<>();
            listaPalpites = listaDeJogadores.get(i).getPalpites();

            for(int j = 0; j < listaPalpites.size(); j++){
                if(listaPalpites.get(j) == numeroSorteado){
                    listaDeJogadores.get(i).ganhou();
                }
            }
        }
        return listaDeJogadores;
    }

    public String resultado(ArrayList<Jogador> listaDeJogadores, int numeroSorteado){
        String resultado = "";
        
        for(int i = 0; i < listaDeJogadores.size(); i++){
            resultado  = resultado + listaDeJogadores.get(i).toString();
        }
        resultado+= "\n\n\n NumeroSorteado: " + numeroSorteado;

        return resultado;
    }
}
