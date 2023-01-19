package Modelos;


import Enum.Vacinas;

import java.util.Date;

public class EsquemaVacinal {
    Date data;
    Vacinas vacina;
    String Observação;

    public EsquemaVacinal(Vacinas vacina, String observação) {
        this.vacina = vacina;
        Observação = observação;
    }

    @Override
    public String toString() {
        return "EsquemaVacinal{" +
                "vacina=" + vacina +
                ", Observação='" + Observação + '\'' +
                '}';
    }
}
