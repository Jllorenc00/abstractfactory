package br.com.joaolorenco.abstractfactory.exercicio1;

/**
 *
 * @author joao-
 */
public class FabricaVeiculosCombustao implements FabricaVeiculos {

    @Override
    public Carro criarCarro() {
        return new CarroCombustao();
    }

    @Override
    public Caminhao criarCaminhao() {
        return new CaminhaoCombustao();
    }

}
