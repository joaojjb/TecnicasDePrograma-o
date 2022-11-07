import java.text.DecimalFormat;
import java.util.ArrayList;

public class Funcionario {
    private String numeroMatricula;
    private String nome;
    private String salario;
    private String gratificacao;
    private ArrayList<Filho> filhos;


    
    public String getFilhos() {
        String filho = "";
        for(int i = 0; i < this.filhos.size(); i++){
           filho =  filho + " " + this.filhos.get(i).getNomeFilho() + " " 
           + this.filhos.get(i).getSexo() + " "
           + this.filhos.get(i).getDataDeNascimento() + "\n\r";
            
        }
        return filho;
    }

    public void setFilhos(ArrayList<Filho> filhos) {
        this.filhos = filhos;
    }

    public Funcionario() {
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        String valorFormatado = new DecimalFormat("#,##0.00").format(Integer.parseInt(salario));
        
        this.salario = valorFormatado;
    }

    public String getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(String gratificacao) {
        String valorFormatado = new DecimalFormat("#,##0.00").format(Integer.parseInt(gratificacao));
        this.gratificacao = valorFormatado;
    }

    @Override
    public String toString(){
        return  getNome() + "-- R$" + getSalario() + "-- R$" + getGratificacao() + "\n Filhos: \n" + getFilhos();
    }

}
