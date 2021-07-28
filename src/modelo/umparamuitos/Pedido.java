package modelo.umparamuitos;

import java.util.Date;

public class Pedido {
    private Long id;
    public Long getId() {
        return id;
    }
    public Pedido(Date data) {
        this.data = data;
    }
    public Pedido() {
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    private Date data;
}
