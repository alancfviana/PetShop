package Modelos;


import Enum.Porte;
import Enum.EstadoAnimal;

import java.util.Date;
import java.util.List;

public class Cachorro extends Animais{


    public Cachorro(String nome, String raca, Porte porte, Double peso, EstadoAnimal estadoanimal, String observacao) {
        super(nome, raca, porte, peso, estadoanimal, observacao);
    }
}
