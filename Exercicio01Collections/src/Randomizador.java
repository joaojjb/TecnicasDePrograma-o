import java.util.Random;
import java.util.ArrayList;

public class Randomizador{
    Random r = new Random();


    public String geraNome() {
        String nomeString = "";
        for(int i = 0; i < 13; i ++){
            int nome = 65 + r.nextInt(90 - 65);
            char nomeChar = (char)nome;
            nomeString+= Character.toString(nomeChar);
        }
        return nomeString;
    }

    public double geraSalario(){
        double salario = 0;
        for(int i = 0; i < 8; i++){
            salario+= r.nextInt(120000);
        }
        return salario;
    }
    
    public ArrayList<Telefone> geraTelefone(){
        String telefoneString = "";
        ArrayList<Telefone> auxList = new ArrayList<>();

        for(int j = 0; j < geraQuantidadeDeUmACinco(); j++){
            for(int i = 0; i < 11; i ++){
                int telefoneInteger = 1 + r.nextInt(8);
                telefoneString+= Integer.toString(telefoneInteger);
            }

            Telefone telefone = new Telefone(telefoneString);
            auxList.add(telefone);
            telefoneString = "";
        }
        return auxList;
    }
    
    private int geraQuantidadeDeUmACinco(){
        int qtdeUmCinco = 1 + r.nextInt(4);

        return qtdeUmCinco;
    }
}