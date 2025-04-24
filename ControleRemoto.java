public class ControleRemoto {
    private Televisor tv;
    
    public ControleRemoto(Televisor tv){
        this.tv = tv;
    }
    ///métodos ligar, desligar, aumentarVolume, diminuirVolume, trocarCanal e o método toString() para retornar a representação textual do objeto.
    public void ligar(){
        tv.tvLigar();
    }
    public void desligar(){
        tv.tvDesligar();
    }
    public void aumentarVOLU(){
        tv.aumentarVolume();
    }
    public void diminuirVOLU(){
        tv.diminuirVolume();
    }
    public void trocarCanal(int canal){
        tv.TrocarCanal(canal);
    }
    public void Estado(){
        System.out.println(tv.toString());
    }
}
