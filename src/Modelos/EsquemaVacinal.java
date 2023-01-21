package Modelos;


import Enum.Vacinas;

import java.time.LocalDate;
import java.util.Date;

public class EsquemaVacinal {
    LocalDate data;
    Vacinas vacina;
    String Observação;

    public EsquemaVacinal(Vacinas vacina, LocalDate data,String observação) {
        this.vacina = vacina;
        this.data = data;
        Observação = observação;
    }

    @Override
    public String toString() {
        return "EsquemaVacinal{" +
                "vacina=" + vacina +
                ",data=" + data +
                ", Observação='" + Observação + '\'' +
                '}';
    }
}
