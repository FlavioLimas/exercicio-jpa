package modelo.basico.teste.basico;

import java.util.List;

import infra.ProdutoDAO;
import modelo.basico.Produto;

public class ObterProdutos {

    public static void main(String[] args) {
        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> produto = dao.obterTodos();
    }
    
}
