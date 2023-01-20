package Menus;

import Util.Alimento;
import Util.Remedio;

import java.util.ArrayList;
import java.util.List;


import static Util.Alimento.listaAlimento;
import static Util.Remedio.listaRemedio;

public class MenuProdutos {
    public static void menuProdutos(){
        System.out.println("Serviços");
        System.out.println("id=1001, nome='Atendimento Clinico', valor=50");
        System.out.println("id=1101, nome='Vacinação', valor=80");
        System.out.println("id=1102, nome='Vacinação', valor=80");
        System.out.println("id=1103, nome='Vacinação', valor=80");
        System.out.println("id=1104, nome='Vacinação', valor=80");
        System.out.println("id=1105, nome='Vacinação', valor=80");
        System.out.println("id=1201, nome='Banho', valor=40");
        System.out.println("id=1202, nome='Tosa', valor=30");
        System.out.println("id=1203, nome='Banho e Tosa', valor=60");
        System.out.println("\nProdutos");
        List<Alimento> listaalimento = new ArrayList<Alimento>();
        listaalimento = listaAlimento();
        for (Alimento alimentos:listaalimento) {
            System.out.println(alimentos.toString());
        }

        List<Remedio> listaremedio = new ArrayList<Remedio>();
        listaremedio = listaRemedio();
        for (Remedio remedio:listaremedio) {
            System.out.println(remedio.toString());
    }
}
}
