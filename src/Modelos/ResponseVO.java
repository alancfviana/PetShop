package Modelos;

import Enum.Servicos;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ResponseVO {
   private int id;
   private Servicos servico;
   private BigDecimal valor;
   private Cliente cliente;

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public Servicos getServico() {
        return servico;
    }

    public void setServico(Servicos servico) {

        this.servico = servico;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }




    @Override
    public String toString() {

        return "ResponseVO{" +
                " id=" + id +
                ", servico=" + servico +
                ", valor=" + valor +
                "," + cliente +
                '}';
    }
}
