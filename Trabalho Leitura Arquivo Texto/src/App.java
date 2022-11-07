import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Funcionario> filhosDaFunc = new ArrayList<>();

        String var = "";
        File file = new File( "src\\ArquivoTextoTrabalho.txt");

        try  {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String srt;
            while(in.ready()){
                srt = in.readLine(); 
                var += srt + "\n\r";
            }

            //Adicionando cada linha em uma posição em um array de String
            String[] funcionarios = var.split("\n\r");

            //Setando Funcionário
            for(int i = 0; i < funcionarios.length; i++){
                Funcionario f1 = new Funcionario();
                
                //Setando Funcionário
                String[] aux = funcionarios[i].split("-");
                f1.setNumeroMatricula(aux[0]);
                f1.setNome(aux[1]);
                f1.setSalario(aux[2]);
                f1.setGratificacao(aux[3]);

            ArrayList<Filho> listaFilhos = new ArrayList<>();
                //Atribuindo todos os filhos de cada funcionário

            if(aux.length > 4){
                for(int j = 4; j < aux.length; j = j + 3){
                    Filho auxFilho = new Filho();
                   

                    auxFilho.setNomeFilho(aux[j]);
                    auxFilho.setDataDeNascimentoComFilho(aux[j + 1]);
                    auxFilho.setSexo(aux[j + 2]);
    
                    listaFilhos.add(auxFilho);
                    f1.setFilhos(listaFilhos);
                   
                }
            }else{
                Filho auxFilho = new Filho();
                auxFilho.setNomeFilho("<");
                auxFilho.setDataDeNascimentoSemFilho(">");
                auxFilho.setSexo("SEM FILHOS");

                listaFilhos.add(auxFilho);
                f1.setFilhos(listaFilhos);
            }
                
                filhosDaFunc.add(f1);
            }
            in.close();
        } catch (IOException e){
        }

        //Atribuindo todos os funcionários apenas para uma String
        String listaDeFuncionarios = "";
        for(int i = 0; i < filhosDaFunc.size(); i++){
            listaDeFuncionarios = listaDeFuncionarios + filhosDaFunc.get(i).toString() + "\n\n\n ";
        }
        
        JOptionPane.showMessageDialog(null, listaDeFuncionarios);
        
        
       
    }
}
