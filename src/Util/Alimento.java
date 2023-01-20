package Util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Alimento extends Produtos{

    public Alimento(int id, String nome, BigDecimal valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }
    public static List<Produtos> listaAlimento() {
        Alimento alimento1 = new Alimento(2001, "Ração Cachorro", BigDecimal.valueOf(12));
        Alimento alimento2 = new Alimento(2002, "Ração Gato", BigDecimal.valueOf(23));
        Alimento alimento3 = new Alimento(2003, "Petisco Cachorro", BigDecimal.valueOf(17));
        Alimento alimento4 = new Alimento(2004, "Petisco Gato", BigDecimal.valueOf(26));
        Alimento alimento5 = new Alimento(2005, "Vitaminas", BigDecimal.valueOf(31));
        List<Produtos> listaalimento = new ArrayList<Produtos>();
        listaalimento.add(alimento1);
        listaalimento.add(alimento2);
        listaalimento.add(alimento3);
        listaalimento.add(alimento4);
        listaalimento.add(alimento5);
        return listaalimento;
    }


    @Override
    public String toString() {
        return "Alimento{" +
                " id=" + id +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}
