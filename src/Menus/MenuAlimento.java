package Menus;

import Util.Alimento;

import java.util.ArrayList;
import java.util.List;

import static Util.Alimento.*;
public class MenuAlimento {

    public static void menuAlimento(){
        List<Alimento> listaalimento = new ArrayList<Alimento>();
        listaalimento = listaAlimento();
        System.out.println("Digite qual o alimento desejado");
        System.out.println("1 - " + listaalimento.get(0).getNome());
        System.out.println("2 - " + listaalimento.get(1).getNome());
        System.out.println("3 - " + listaalimento.get(2).getNome());
        System.out.println("4 - " + listaalimento.get(3).getNome());
        System.out.println("5 - " + listaalimento.get(4).getNome());
        System.out.println("0 - para retornar para opção anterior");

    }
    public static String escolhaAlimento(int escolha){
        List<Alimento> listaalimento = new ArrayList<Alimento>();
        listaalimento = listaAlimento();
        switch (escolha){
            case(1):{
                return listaalimento.get(0).getNome();
            }
            case(2):{
                return listaalimento.get(1).getNome();
            }
            case(3):{
                return listaalimento.get(2).getNome();
            }
            case(4):{
                return listaalimento.get(3).getNome();
            }
            case(5):{
                return listaalimento.get(4).getNome();
            }
            default:


        }
        return "";
    }
}
