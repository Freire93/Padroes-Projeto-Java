package Strategy;

public class TestandoORobo {
    public static void main(String[]args){

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        ROBO robo = new ROBO();
        robo.setStrategy(normal);
        robo.mover();
        robo.mover();robo.setStrategy(defensivo);
        robo.mover();
        robo.mover();robo.setStrategy(agressivo);
        robo.mover();
        robo.mover();

    }
}
