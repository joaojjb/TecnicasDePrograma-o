package classes;

public class AssistenteTecnico extends Assistente {
    private float bonusSalarial;

    public AssistenteTecnico() {
        this.bonusSalarial = 0;
    }

    public float getBonusSalarial() {
        return bonusSalarial;
    }

    public void setBonusSalarial(final float bonusSalarial) {
        this.bonusSalarial = bonusSalarial;
    }

    public void calculaAumentaSalario() {
        float salarioBase = super.getSalario();
        super.setSalario(salarioBase + (salarioBase * 10 / 100) + this.bonusSalarial);
    }

}
