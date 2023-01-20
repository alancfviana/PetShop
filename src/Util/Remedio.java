package Util;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Remedio extends Produtos{


    public Remedio(int id, String nome, BigDecimal valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    public static List<Produtos> listaRemedio() {
        Remedio remedio1 = new Remedio(3001, "Dipirona", BigDecimal.valueOf(10));
        Remedio remedio2 = new Remedio(3002, "Anti-Alérgico", BigDecimal.valueOf(20));
        Remedio remedio3 = new Remedio(3003, "Pro-Biótico", BigDecimal.valueOf(15));
        Remedio remedio4 = new Remedio(3004, "Anti-Pulgas", BigDecimal.valueOf(25));
        Remedio remedio5 = new Remedio(3005, "Otobom", BigDecimal.valueOf(30));
        return Arrays.asList(remedio1,remedio2,remedio3,remedio4,remedio5);
    }



    @Override
    public String toString() {
        return "Remedio{" +
                " id=" + id +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}
