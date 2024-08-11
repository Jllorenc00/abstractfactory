package br.com.joaolorenco.abstractfactory.exercicio1;

/**
 *
 * @author joao-
 */
public class CaminhaoEletrico implements Caminhao {

    @Override
    public void transportar() {
        System.out.println("Transportando com caminhao eletrico");
    }

}
