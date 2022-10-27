package classes;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    private String nome;
    private String cpf;
    private String rg;
    private float salario;

    public Funcionario() {
        this.nome = "";
        this.cpf = "";
        this.rg = "";
        this.salario = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(final String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(final String rg) {
        this.rg = rg;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(final float salario) {
        this.salario = salario;
    }

    // AumentarSalario
    public void calculaAumentaSalario(final float salario) {
        this.salario = salario + (salario * 10 / 100);
    }

    // Exibindo dados
    public List<String> exibeDados() {
        List<String> funcionario = new ArrayList<>();
        String salario = String.valueOf(this.salario);
        funcionario.add(this.nome);
        funcionario.add(this.cpf);
        funcionario.add(this.rg);
        funcionario.add(salario);

        return funcionario;
    }

}
