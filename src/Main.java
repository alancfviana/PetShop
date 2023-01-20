import Modelos.*;
import Enum.Vacinas;
import Enum.EstadoAnimal;
import Enum.Porte;
import Enum.Higiene;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import static Menus.MenuProdutos.*;

public class Main {
    public static void main(String[] args) {

        menuProdutos();
        System.out.println("Hello world!");

        PetShop petshop = new PetShop();
        Cliente cliente1 = new Cliente(1001,"Roberto");
        Cliente cliente2 = new Cliente(1002, "Maria");

        List<ResponseVO> cliente1response = new ArrayList<ResponseVO>();
        List<ResponseVO> cliente2response = new ArrayList<ResponseVO>();

        Cachorro cachorro1 = new Cachorro("Lilo", "Pincher", Porte.PEQUENO, 5.0, EstadoAnimal.SUJO,"" );
        Cachorro cachorro2 = new Cachorro("Fifi", "Golden", Porte.GRANDE, 25.0, EstadoAnimal.SUJO,"");
        Gato gato1 = new Gato("Lennom", "SRD", Porte.PEQUENO, 4.0, EstadoAnimal.SUJO,"");

        cliente1.addPets(cachorro1);
        cliente2.addPets(cachorro2);
        cliente2.addPets(gato1);

        cliente1.selecionaPets();
        cliente1response.add(petshop.atendimentoClinico(cliente1, cliente1.petsatendimento, "Verificar as necessidades do cão 1"));
        System.out.println("Fim " + cliente1.getPets().get(0).getObservacao());
        System.out.println(cliente1response.toString());
        petshop.veralimentos();
        petshop.verremedios();
        List<Vacinas> vacinascliente1 = new ArrayList<Vacinas>();
        for (int petnumero = 0; petnumero < cliente1.getPets().size(); petnumero++){
            String vacina = cliente1.getPets().get(petnumero).getObservacao();
            vacinascliente1.add(converteVacina(vacina));
        }
        cliente1response.add(petshop.vacinacao(cliente1, cliente1.petsatendimento,vacinascliente1,"Tomar vacina"));

        System.out.println(cliente1.getPets().get(0).getNome() + " " + cliente1.getPets().get(0).getVacinas().toString());
        System.out.println(cliente1response.toString());

        cliente1response.add(petshop.higienizar(cliente1, cliente1.petsatendimento, Higiene.BANHO_E_TOSA, "Cuidado com as orelhas"));

        System.out.println(cliente1.getPets().get(0).getNome() + " está " + cliente1.getPets().get(0).getEstadoanimal());
        /////////////////////////////////////////////////////////////////////////////////////
        cliente2.selecionaPets();
        cliente2response.add(petshop.atendimentoClinico(cliente2,cliente2.petsatendimento, "Um gato e um cachorro"));
        System.out.println("Fim " + cliente2.getPets().get(0).getObservacao());
        System.out.println(cliente2response.toString());
        List<Vacinas> vacinascliente2 = new ArrayList<Vacinas>();
        for (int petnumero = 0; petnumero < cliente2.getPets().size(); petnumero++){
            String vacina = cliente2.getPets().get(petnumero).getObservacao();
            vacinascliente2.add(converteVacina(vacina));
        }
        cliente2response.add(petshop.vacinacao(cliente2, cliente2.petsatendimento,vacinascliente2,"Tomar vacina"));
        System.out.println(cliente2.getPets().get(0).getNome() + " " + cliente2.getPets().get(0).getVacinas().toString());
        System.out.println(cliente2.getPets().get(1).getNome() + " " + cliente2.getPets().get(1).getVacinas().toString());
        System.out.println(cliente2response.toString());

    }
    public static Vacinas converteVacina(String vacina){
        Vacinas vacinacliente = null;

        if(vacina == Vacinas.VACINA_1.name()) {
           vacinacliente = Vacinas.VACINA_1;
        }
        if(vacina == Vacinas.VACINA_2.name()) {
            vacinacliente = Vacinas.VACINA_2;
        }
        if(vacina == Vacinas.VACINA_3.name()) {
            vacinacliente = Vacinas.VACINA_3;
        }
        if(vacina == Vacinas.VACINA_4.name()) {
            vacinacliente = Vacinas.VACINA_4;
        }
        if(vacina == Vacinas.VACINA_5.name()){
            vacinacliente = Vacinas.VACINA_5;
        }
        return vacinacliente;
    }
}