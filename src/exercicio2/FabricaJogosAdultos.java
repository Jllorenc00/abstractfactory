package exercicio2;

/**
 *
 * @author joao-
 */
public class FabricaJogosAdultos implements FabricaJogos {

    @Override
    public JogoTabuleiro criarJogoTabuleiro() {
        return new JogoTabAdultos();
    }

    @Override
    public JogoCartas criarJogoCartas() {
        return new JogoCartaAdultos();
    }

}
