package Modelos;

import java.util.ArrayList;
import java.util.List;
import static Util.LerTeclado.*;

public class Cliente extends Pessoa{
    protected int id;
    protected List<Animais> pets = new ArrayList<Animais>();

    public List<Animais> petsatendimento = new ArrayList<Animais>();

    public Cliente() {
    }

    public Cliente(int id, List<Animais> pets) {
        this.id = id;
        this.pets = pets;
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

    public void selecionaPets() {
        boolean continua = true;
        List<Animais> petsselecionados = new ArrayList<Animais>();
        while(continua){
        System.out.println("Escolha seu pet");
        System.out.println(("0 para sair"));
        for(int indice = 0; indice < pets.size(); indice ++) {
            System.out.println((indice + 1) + " " + pets.get(indice).getNome());
        }
        int escolha = lerTeclado();
        if (escolha == 0){
            break;
        }

        if (escolha > pets.size())
        {
            System.out.println("Pet não encontrado por favor digite um número válido!");
        }else {
            escolha--;
            boolean novopet = true;
            for (int indice = 0; indice < petsselecionados.size(); indice++) {
                if (pets.get(escolha).getNome() == petsselecionados.get(indice).getNome()) {
                    System.out.println("Pet já adicionado, por favor selecione outro pet");
                    novopet = false;
                }
            }
            if (novopet) {
                petsselecionados.add(pets.get(escolha));
                System.out.println("Pet " + pets.get(escolha).getNome() + " adicionado com sucesso");
            }
        }
        }
        System.out.println("Pets selecionados:");
        if(petsselecionados.size()==0) {
            System.out.println("Nenhum");
        }
        for(int indice = 0; indice < petsselecionados.size(); indice ++) {
            System.out.println(petsselecionados.get(indice).getNome());
        }
        petsatendimento = petsselecionados;
    }
}
