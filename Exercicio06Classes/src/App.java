import classes.Equipamento;
import classes.EquipamentoSonoro;

public class App {
    public static void main(String[] args) throws Exception {
        Equipamento equipamentoUm = new Equipamento();
        EquipamentoSonoro Jbl = new EquipamentoSonoro();

        equipamentoUm.liga();
        equipamentoUm.desliga();
        equipamentoUm.isLigado();

        Jbl.liga();
        Jbl.desliga();
        System.out.println(
            Jbl.getVolume()
        );
        

    }
}
