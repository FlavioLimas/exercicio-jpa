package modelo.umparamuitos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import modelo.basico.Produto;

@Entity
public class ItemPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Integer quantidade;
    @Column(nullable = false)
    private Double preco;
    
    @ManyToOne
    private Pedido pedido;
    @ManyToOne(fetch = FetchType.EAGER)
    private Produto produto;
    public ItemPedido(Integer quantidade, Pedido pedido, Produto produto) {
        this.setQuantidade(quantidade);
        this.setPedido(pedido);
        this.setProduto(produto);
    }
    public ItemPedido() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public Pedido getPedido() {
        return pedido;
    }
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        if (produto != null && this.preco == null) {
            this.setPreco(produto.getPreco());
        }
        this.produto = produto;
    }
}
