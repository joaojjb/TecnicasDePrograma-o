package classes;

public class Assistente extends Funcionario {
    private String numeroDeMatricula;

    public Assistente() {
        this.numeroDeMatricula = "";
    }


    public String getNumeroDeMatricula() {
        return numeroDeMatricula;
    }

    public void setNumeroDeMatricula(final String numeroDeMatricula) {
        this.numeroDeMatricula = numeroDeMatricula;
    }

    

}
