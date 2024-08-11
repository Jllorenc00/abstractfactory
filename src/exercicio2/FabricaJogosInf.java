package exercicio2;

/**
 *
 * @author joao-
 */
public class FabricaJogosInf implements FabricaJogos {

    @Override
    public JogoTabuleiro criarJogoTabuleiro() {
        return new JogoTabInf();
    }

    @Override
    public JogoCartas criarJogoCartas() {
        return new JogoCartasInf();
    }
    
}
