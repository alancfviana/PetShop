package Menus;

import Util.Alimento;
import Util.Remedio;
import static Util.Remedio.*;

import java.util.ArrayList;
import java.util.List;

import static Util.Alimento.listaAlimento;

public class MenuRemedio {
    public static void menuRemedio(){

        List<Remedio> listaremedio = new ArrayList<Remedio>();
        listaremedio = listaRemedio();
        System.out.println("Digite qual remédio desejado");
        System.out.println("1 - " + listaremedio.get(0).getNome());
        System.out.println("2 - " + listaremedio.get(1).getNome());
        System.out.println("3 - " + listaremedio.get(2).getNome());
        System.out.println("4 - " + listaremedio.get(3).getNome());
        System.out.println("5 - " + listaremedio.get(4).getNome());
        System.out.println("0 - para retornar para opção anterior");
    }
    public static String escolhaRemedio(int escolha){
        List<Remedio> listaremedio = new ArrayList<Remedio>();
        listaremedio = listaRemedio();
        switch (escolha){
            case(1):{
                return listaremedio.get(0).getNome();
            }
            case(2):{
                return listaremedio.get(1).getNome();
            }
            case(3):{
                return listaremedio.get(2).getNome();
            }
            case(4):{
                return listaremedio.get(3).getNome();
            }
            case(5):{
                return listaremedio.get(4).getNome();
            }
            }

        return "";
    }
}
