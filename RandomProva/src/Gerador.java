import java.util.Random;

public class Gerador {
    private String placa;

    public Gerador(){
        this.placa = "";
    }


    public String setPlaca(){
        Random ran = new Random();
        for(int i = 0; i < 3; i++){
            int geradorL = 65 + ran.nextInt(90-65);
            char letrasChar = (char)geradorL;
            this.placa = this.placa + letrasChar;
        }
        
        int geradorNum = ran.nextInt(9);
        this.placa = this.placa + geradorNum;

        int geradorDeLetras = 65 + ran.nextInt(90 - 65);
        char letrasCharD = (char)geradorDeLetras;
        this.placa = this.placa + letrasCharD;

        for(int i =0; i < 2; i++){
            int geradorNumD = ran.nextInt(9);
            this.placa = this.placa + geradorNumD;
        }
        return this.placa;
    }
}
