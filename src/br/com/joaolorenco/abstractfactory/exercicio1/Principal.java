package br.com.joaolorenco.abstractfactory.exercicio1;

/**
 *
 * @author joao-
 */
public class Principal {

    public static void main(String[] args) {
        FabricaVeiculos fabricaEletrica = new FabricaVeiculosEletricos();
        Cliente clienteEletrico = new Cliente(fabricaEletrica);
        clienteEletrico.usarVeiculos();

        FabricaVeiculos fabricaCombustao = new FabricaVeiculosCombustao();
        Cliente clienteCombustao = new Cliente(fabricaCombustao);
        clienteCombustao.usarVeiculos();
    }

}

