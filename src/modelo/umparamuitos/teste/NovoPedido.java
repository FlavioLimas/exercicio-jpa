package modelo.umparamuitos.teste;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umparamuitos.ItemPedido;
import modelo.umparamuitos.Pedido;

public class NovoPedido {
    
    public static void main(String[] args) {
        DAO<Object> dao = new DAO<>();

        Produto produto = new Produto("Geladeira", 2789.99);
        Pedido pedido = new Pedido();
        ItemPedido item = new ItemPedido(10, pedido, produto);

        dao.abrirTransacao()
            .incluir(produto)
            .incluir(pedido)
            .incluir(item)
            .fecharTransacao()
            .fechar();
    }
}
