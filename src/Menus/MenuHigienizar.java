package Menus;
import Enum.Higiene;

public class MenuHigienizar {

    public static void menuHigienizar() {
        System.out.println("Digite qual tipo de higienização deve ser realizada");
        System.out.println("1 - " + Higiene.BANHO);
        System.out.println("2 - " + Higiene.TOSA);
        System.out.println("3 - " + Higiene.BANHO_E_TOSA);
        System.out.println("0 - O pet está limpo e tosado");
    }
    public static String escolhaHigienizar(int escolha){
        switch (escolha){
            case(1):{
                return String.valueOf(Higiene.BANHO);
                }
            case(2):{
                return String.valueOf(Higiene.TOSA);
            }
            case(3):{
                return String.valueOf(Higiene.BANHO_E_TOSA);
            }
        }
        return "";
    }
}
