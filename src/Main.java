import Modelos.*;
import Enum.Vacinas;
import Enum.EstadoAnimal;
import Enum.Porte;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        PetShop petshop = new PetShop();
        Cliente cliente1 = new Cliente(1001,"Roberto");
        Cliente cliente2 = new Cliente(1002, "Maria");

        ResponseVO cliente1response = new ResponseVO();
        ResponseVO cliente2response = new ResponseVO();

        Cachorro cachorro1 = new Cachorro("Lilo", "Pincher", Porte.PEQUENO, 5.0, EstadoAnimal.SUJO,null,"" );
        Cachorro cachorro2 = new Cachorro("Fifi", "Golden", Porte.GRANDE, 25.0, EstadoAnimal.SUJO,null,"");
        Gato gato1 = new Gato("Lennom,", "SRD", Porte.PEQUENO, 4.0, EstadoAnimal.SUJO,null,"");

        cliente1.addPets(cachorro1);
        cliente2.addPets(cachorro2);
        cliente2.addPets(gato1);

        cliente1.selecionaPets();
        cliente1response = petshop.atendimentoClinico(cliente1, cliente1.petsatendimento, "Verificar as necessidades do cão 1");
        System.out.println("Fim " + cliente1.getPets().get(0).getObservacao());
        System.out.println(cliente1response.toString());
        petshop.veralimentos();
        petshop.verremedios();
        List<Vacinas> vacinascliente1 = new ArrayList<Vacinas>();
        for (int petnumero = 0; petnumero < cliente1.getPets().size(); petnumero++){
            String vacina = cliente1.getPets().get(petnumero).getObservacao();
            if(vacina == Vacinas.VACINA_1.name()) {
                vacinascliente1.add(Vacinas.VACINA_1);
            }
            if(vacina == Vacinas.VACINA_2.name()) {
                vacinascliente1.add(Vacinas.VACINA_2);
            }
            if(vacina == Vacinas.VACINA_3.name()) {
                vacinascliente1.add(Vacinas.VACINA_3);
            }
            if(vacina == Vacinas.VACINA_4.name()) {
            vacinascliente1.add(Vacinas.VACINA_4);
            }
            if(vacina == Vacinas.VACINA_5.name()){
            vacinascliente1.add(Vacinas.VACINA_5);
            }
        }
        cliente1response = petshop.vacinacao(cliente1, cliente1.petsatendimento,vacinascliente1,"Tomar vacina");

        System.out.println(cliente1.getPets().get(0).getVacinas().toString());

        /////////////////////////////////////////////////////////////////////////////////////
        cliente2.selecionaPets();
        cliente2response = petshop.atendimentoClinico(cliente2,cliente2.petsatendimento, "Um gato e um cachorro");
        System.out.println("Fim " + cliente2.getPets().get(0).getObservacao());
        System.out.println(cliente2response.toString());


    }
}