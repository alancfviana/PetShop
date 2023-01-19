package Modelos;

import Enum.Servicos;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ResponseVO {
   private List<Integer> id = new ArrayList<Integer>();
   private List<Servicos> servico = new ArrayList<Servicos>();
   private List<BigDecimal> valor = new ArrayList<BigDecimal>();
   private Cliente cliente;

    public List<Integer> getId() {

        return id;
    }

    public void setId(Integer id) {

        this.id.add(id);
    }

    public List<Servicos> getServico() {
        return servico;
    }

    public void setServico(Servicos servico) {

        this.servico.add(servico);
    }

    public List<BigDecimal> getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor.add(valor);
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
