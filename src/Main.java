import Modelos.*;
import Enum.Vacinas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        PetShop petshop = new PetShop();
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();

        ResponseVO cliente1response = new ResponseVO();
        ResponseVO clinete2response = new ResponseVO();

        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro();
        Gato gato1 = new Gato();

        cachorro1.setNome("Lilo");
        cachorro2.setNome("Fifi");
        gato1.setNome("Lennom");


        cliente1.addPets(cachorro1);
        cliente2.addPets(cachorro2);
        cliente2.addPets(gato1);

        cliente1.selecionaPets();
        cliente1response = petshop.atendimentoClinico(cliente1, cliente1.petsatendimento, "Verificar as necessidades do cão 1");
        System.out.println("Fim " + cliente1.getPets().get(0).getObservacao());
    }
}