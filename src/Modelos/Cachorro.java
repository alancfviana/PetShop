package Modelos;


import Enum.Porte;
import Enum.EstadoAnimal;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Cachorro extends Animais{


    public Cachorro(String nome, LocalDate nascimento, String raca, Porte porte, Double peso, EstadoAnimal estadoanimal, String observacao) {
        super(nome, nascimento, raca, porte, peso, estadoanimal, observacao);
    }
}
