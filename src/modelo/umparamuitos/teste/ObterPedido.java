package modelo.umparamuitos.teste;

import infra.DAO;
import modelo.umparamuitos.Pedido;

public class ObterPedido {
    public static void main(String[] args) {
        DAO<Pedido> dao = new DAO<>(Pedido.class);
        
        Pedido pedido = dao.obterPorID(1L);

        pedido.getItens()
            .forEach(i -> i.getQuantidade());

        dao.fechar();
    }
}
