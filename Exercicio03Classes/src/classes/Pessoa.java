package classes;
public class Pessoa {
    private String nome;
    private int idade;

    //AllArgsConstructor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //NoArgsConstructor
    public Pessoa() {
        this.nome = "";
        this.idade = 0;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }



}
