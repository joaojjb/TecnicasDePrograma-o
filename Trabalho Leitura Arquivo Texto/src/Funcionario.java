public class Funcionario {
    private String numeroMatricula;
    private String nome;
    private String salario;
    private String gratificacao;

    public Funcionario() {
        this.numeroMatricula = numeroMatricula;
        this.nome = nome;
        this.salario = salario;
        this.gratificacao = gratificacao;
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
        this.salario = salario;
    }

    public String getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(String gratificacao) {
        this.gratificacao = gratificacao;
    }

    public void setFuncionario(String funcionario){
        String[] aux = funcionario.split("-");
        setNumeroMatricula(aux[0]);
        setNome(aux[1]);
        setSalario(aux[2]);
        setGratificacao(aux[3]);
    }


    @Override
    public String toString(){
        return "[Matricula: " + getNumeroMatricula() + " Nome: " + getNome() + "\n Salário: " + getSalario() + " Gratificação: " + getGratificacao() + " ]";
    }

}
