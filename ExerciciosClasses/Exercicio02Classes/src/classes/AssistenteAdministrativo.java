package classes;

public class AssistenteAdministrativo extends Assistente {
    private String turno;
    

    public AssistenteAdministrativo() {
        super();
        this.turno = "";
    }

    public void setSalarioBonus(){
        String turno = getTurno(); 
        float salario = super.getSalario();
        
        if(turno.equals("NOTURNO")){
            salario = salario + 1000;
        }

        setSalario(salario);
    }
   
    public String getTurno() {
        return turno;
    }

    public void setTurno(final String turno) {
        this.turno = turno.toUpperCase();
    }

    public float calculaAumentaSalario(){
        float salarioBase = getSalario();
        return salarioBase + (salarioBase * 10/100);
   }

}
