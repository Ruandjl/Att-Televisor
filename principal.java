public class Principal {
    public static void main(String[] args) {
        Televisor minhatv = new Televisor(0, 0);
        ControleRemoto controle = new ControleRemoto(minhatv);

        controle.ligar();
        controle.aumentarVOLU();
        controle.aumentarVOLU();
        minhatv.aumentarVolume();
        controle.Estado();
        controle.aumentarVOLU();
        controle.trocarCanal(4);
        controle.Estado();
        controle.desligar();
        controle.diminuirVOLU();
        minhatv.diminuirVolume();
        controle.trocarCanal(7);
        controle.Estado();
    }
}
