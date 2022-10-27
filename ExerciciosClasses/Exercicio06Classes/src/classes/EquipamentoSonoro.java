package classes;
public class EquipamentoSonoro extends Equipamento {
    private int volume;
    private boolean stereo;

    public EquipamentoSonoro(){
        super();
        this.volume = 5;
        this.stereo = false;
    }


    public void stereo(){
        this.stereo = true;
    }

    public void mono(){
        this.stereo = false;
    }

    public boolean getStereo() {
        return stereo;
    }

    public void setStereo(final boolean stereo) {
        this.stereo = stereo;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(final int volume) {
        if (volume < 0 || volume > 10) this.volume = 1;

        this.volume = volume;
    }
    
}
