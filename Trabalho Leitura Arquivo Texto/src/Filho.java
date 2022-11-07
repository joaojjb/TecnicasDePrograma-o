import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Filho {
    private String nomeFilho;
    private String sexo;
    private String dataDeNascimento;

    //Setando o formato da Data que eu quero

    DateTimeFormatter format = DateTimeFormatter.ofPattern("ddMMyyyy");

    public Filho() {
    }
    public String getNomeFilho() {
        return nomeFilho;
    }
    public void setNomeFilho(String nomeFilho) {
        this.nomeFilho = nomeFilho;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        if(sexo.toUpperCase() == "F"){
            this.sexo = "Feminino";
        }else {
            this.sexo = "Masculino";
        }
        this.sexo = sexo;
    }
    public String getDataDeNascimento() {
        return dataDeNascimento;
    }
    public void setDataDeNascimentoComFilho(String dataDeNascimento) {
    
        LocalDate data = LocalDate.parse(dataDeNascimento, format);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dataDeNascimento = data.format(formatter).toString();
    }

    public void setDataDeNascimentoSemFilho(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }



}
