package br.com.joaolorenco.abstractfactory.exercicio1;

/**
 *
 * @author joao-
 */
public class FabricaVeiculosEletricos implements FabricaVeiculos {

    @Override
    public Carro criarCarro() {
        return new CarroEletrico();
    }

    @Override
    public Caminhao criarCaminhao() {
        return new CaminhaoEletrico();
    }

}
