import java.util.ArrayList;
import java.util.Random;
class Funcionario{
    Random r = new Random();


    private String nome;
    private double salario;
    private ArrayList<Telefone> telefone;

    public String getNome() {
        return this.nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public String getTelefone() {
        String telefones = "";
        for(int i = 0; i < this.telefone.size(); i++){
           telefones = telefones + " " + this.telefone.get(i).getNumero();
        }
        return telefones;
    }

    public void setTelefone(ArrayList<Telefone> telefone) {
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}