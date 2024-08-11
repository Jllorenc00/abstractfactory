package exercicio2;

/**
 *
 * @author joao-
 */
public class Principal {

    FabricaJogos fabricaJogosAdultos = new FabricaJogosAdultos();
    FabricaJogos fabricaJogosInfantis = new FabricaJogosInf();

    JogoTabuleiro jogoTabAdulto = fabricaJogosAdultos.criarJogoTabuleiro();
    JogoCartas jogoCartaAdulto = fabricaJogosAdultos.criarJogoCartas();

    jogoTabuleiroAdulto.jogar;

    jogoCartasAdulto.embaralhar ();

    JogoTabuleiro jogoTabuleiroInfantil = fabricaJogosInfantis.criarJogoTabuleiro();
    JogoCartas jogoCartasInfantil = fabricaJogosInfantis.criarJogoCartas();

    jogoTabuleiroInfantil.jogar ();

    jogoCartasInfantil.embaralhar ();

}
