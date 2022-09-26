package classes;
public class Pessoa {
    private String nome;
    private String sobrenome;

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Pessoa() {
        this.nome = "Nome Padrão";
        this.sobrenome = "Sobrenome Padrão";
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }


    public String getNomeCompleto(){
        String nomeCompleto = this.nome + " " + this.sobrenome;

        return nomeCompleto;
    }

}
