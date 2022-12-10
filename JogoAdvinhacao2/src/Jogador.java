import java.util.ArrayList;

public class Jogador {
    private String nome;
    private String venceu;
    private ArrayList<Integer> palpites = new ArrayList<>();
    
    public Jogador(){
        this.venceu = "PERDEU";
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVenceu() {
        return venceu;
    }

    public void ganhou(){
        this.venceu = "GANHADOR";
    }
    
    public String getPalpitesString() {
        String palpitesString = "";
        for(int i = 0; i < this.palpites.size(); i++){
            palpitesString = 
                palpitesString + "  " + Integer.toString(this.palpites.get(i));
        }
        return palpitesString;
    }

    public void setPalpites(ArrayList<Integer> palpites) {
        this.palpites = palpites;
    }

    public ArrayList<Integer> getPalpites() {
        return palpites;
    }

    @Override
    public String toString(){
        return "Nome: " + getNome() + "\n" + "Palpites: " + getPalpitesString() 
        + "\n" + getVenceu() + "\n\n\n";
    }
}
