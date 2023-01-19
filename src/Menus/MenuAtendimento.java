package Menus;

public class MenuAtendimento {
    public static void menuAtendimento(){

        System.out.println("Digite qual a necessidade do pet");
        System.out.println("1 - Vacina");
        System.out.println("2 - Remédio");
        System.out.println("3 - Alimento");
        System.out.println("0 - O pet está bem");
    }
    public static String escolhaAtendimento(int escolha){
        switch (escolha){
            case(1):{
                return "Vacina";
            }
            case(2):{
                return "Remedio";
            }
            case(3):{
                return "Alimento";
            }
        }
        return "";
    }
}
