package Modelos;

import java.util.ArrayList;
import java.util.List;
import static Util.LerTeclado.*;

public class Cliente extends Pessoa{
    protected int id;
    protected List<Animais> pets = new ArrayList<Animais>();



    public Cliente() {
    }

    public Cliente(int id, List<Animais> pets) {
        this.id = id;
        this.pets = pets;
    }

    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Animais> getPets() {
        return pets;
    }

    public void addPets(Animais pets) {

        this.pets.add(pets);
    }
    public void removePets(Animais pet) {

        this.pets.remove(pet);
    }



    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome +
                " id=" + id + '\'' +
                '}';
    }
}
