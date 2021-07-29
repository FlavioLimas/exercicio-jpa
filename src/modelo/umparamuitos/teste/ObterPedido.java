package modelo.umparamuitos.teste;

import infra.DAO;
import modelo.umparamuitos.Pedido;

public class ObterPedido {
    public static void main(String[] args) {
        DAO<Pedido> dao = new DAO<>(Pedido.class);

        Pedido pedido = dao.obterPorID(1L);
        dao.fechar();

        pedido.getItens().forEach(i -> {
            System.out.println(i.getQuantidade());
            System.out.println(i.getProduto().getNome());
        });

    }
}
