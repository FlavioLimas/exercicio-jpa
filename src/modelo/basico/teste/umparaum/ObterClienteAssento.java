package modelo.basico.teste.umparaum;

import infra.DAO;
import modelo.umparaum.Assento;
import modelo.umparaum.Cliente;

public class ObterClienteAssento {
    public static void main(String[] args) {
        DAO<Cliente> dao1 = new DAO<>(Cliente.class);

        Cliente cliente = dao1.obterPorID(1L);
        System.out.println(cliente.getAssento().getNome());

        dao1.fechar();

        DAO<Assento> dao2 = new DAO<>(Assento.class);

        Assento assento = dao2.obterPorID(1L);
        System.out.println(assento.getCliente().getNome());

        dao2.fechar();
    }
    
}
