import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        Funcionario f1 = new Funcionario();
        ArrayList<Funcionario> filhosDaFunc = new ArrayList<>();

        String var = "";
        File file = new File( "src\\ArquivoTextoTrabalho.txt");

        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String srt;
            while(in.ready()){
                srt = in.readLine(); 
                var += srt + "\n\r";
            }

            String[] funcionarios = var.split("\n");

            for(int i = 0; i < funcionarios.length - 1; i++){
                f1.setFuncionario(funcionarios[i]); 
                filhosDaFunc.add(f1);
            } 
            in.close();
        } catch (IOException e){
        }

        filhosDaFunc.forEach(funcionario -> System.out.println(funcionario.toString())  );

        //JOptionPane.showMessageDialog(null, filhosDaFunc, "Informação do Sistema",JOptionPane.INFORMATION_MESSAGE);
        
        
       
    }
}
