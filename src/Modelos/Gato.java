package Modelos;
import Enum.Porte;
import Enum.EstadoAnimal;

import java.util.Date;
import java.util.List;

public class Gato extends Animais{

    public Gato(String nome, String raca, Porte porte, Double peso, EstadoAnimal estadoanimal, List<EsquemaVacinal> vacinas, String observacao) {
        super(nome, raca, porte, peso, estadoanimal, vacinas, observacao);
    }
}
