public class principal {
    public static void main(String[] args) {
        Televisor minhatv = new Televisor(0, 0, false);
        ControleRemoto controle = new ControleRemoto(minhatv);

        controle.ligar();
        controle.aumentarVOLU();
        controle.aumentarVOLU();
        controle.Estado();
        controle.aumentarVOLU();
        controle.trocarCanal(4);
        controle.Estado();
        controle.desligar();
        controle.diminuirVOLU();
        controle.trocarCanal(7);
        controle.Estado();
    }
}
