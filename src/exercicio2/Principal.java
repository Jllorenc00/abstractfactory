package exercicio2;

/**
 *
 * @author joao-
 */
public class Principal {

    public static void main(String[] args) {
        FabricaJogos fabricaJogosAdultos = new FabricaJogosAdultos();
        FabricaJogos fabricaJogosInfantis = new FabricaJogosInf();

        JogoTabuleiro jogoTabAdulto = fabricaJogosAdultos.criarJogoTabuleiro();
        JogoCartas jogoCartaAdulto = fabricaJogosAdultos.criarJogoCartas();

        jogoTabAdulto.jogar();

        jogoCartaAdulto.embaralhar();

        JogoTabuleiro jogoTabuleiroInfantil = fabricaJogosInfantis.criarJogoTabuleiro();
        JogoCartas jogoCartasInfantil = fabricaJogosInfantis.criarJogoCartas();

        jogoTabuleiroInfantil.jogar();

        jogoCartasInfantil.embaralhar();
    }
}
