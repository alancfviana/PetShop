package Util;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Remedio {

    int id;
    String nome;
    BigDecimal valor;

    public Remedio(int id, String nome, BigDecimal valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    public static List<Remedio> listaRemedio() {
        Remedio remedio1 = new Remedio(3001, "Dipirona", BigDecimal.valueOf(10));
        Remedio remedio2 = new Remedio(3002, "Anti-Alérgico", BigDecimal.valueOf(20));
        Remedio remedio3 = new Remedio(3003, "Pro-Biótico", BigDecimal.valueOf(15));
        Remedio remedio4 = new Remedio(3004, "Anti-Pulgas", BigDecimal.valueOf(25));
        Remedio remedio5 = new Remedio(3005, "Otobom", BigDecimal.valueOf(30));
        return Arrays.asList(remedio1,remedio2,remedio3,remedio4,remedio5);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
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
