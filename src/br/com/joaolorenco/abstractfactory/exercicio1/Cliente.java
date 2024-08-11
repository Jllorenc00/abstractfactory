package br.com.joaolorenco.abstractfactory.exercicio1;

/**
 *
 * @author joao-
 */
public class Cliente {

    private Carro carro;
    private Caminhao caminhao;

    public Cliente(FabricaVeiculos fabrica) {
        carro = fabrica.criarCarro();
        caminhao = fabrica.criarCaminhao();
    }

    public void usarVeiculos() {
        carro.dirigir();
        caminhao.transportar();
    }

}
