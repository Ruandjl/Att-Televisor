public class Televisor {
//canal, volume e ligado
    private int canal;
    private int volume;
    private boolean ligado;

    public Televisor(int canal, int volume){
        this.canal = canal;
        this.volume = volume;
        this.ligado = false;
    }
//métodos ligar, desligar, aumentarVolume, diminuirVolume, trocarCanal e o método toString() para retornar a representação textual do objeto.
    public boolean tvLigar(){
        return ligado = true;
    }
    public boolean tvDesligar(){
        return ligado = false;
    }
    public int getVolume(){
        return volume;
    }
    public void aumentarVolume(){
        if (volume < 100) {
            volume = volume + 10;
        }
    }
    public void diminuirVolume(){
        if (volume > 0) {
            volume = volume - 10;
        }
    }
    public void TrocarCanal(int NovoCanal){
        canal = NovoCanal;
    }
    public String toString(){
        if(ligado == true){
            return "Estado da TV ligada: " + ligado + "\ncanal: " + canal + "\nvolume: " + volume;
        }
        else{
            return "Estado da TV deligada: " + ligado + "\ncanal: " + canal + "\nvolume: " + volume;
        }  
    }

}
