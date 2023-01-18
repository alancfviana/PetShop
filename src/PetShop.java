import Modelos.Animais;
import Modelos.Endereco;
import Modelos.ResponseVO;
import Modelos.Cliente;
import Enum.Higiene;
import Enum.Vacinas;
import Enum.Servicos;

import java.math.BigDecimal;
import java.util.List;

import static Util.LerTeclado.*;

public class PetShop {
    String cnpj;
    Endereco endereco;

    ResponseVO higienizar (Cliente cliente, List<Animais> animais, Higiene higiene, String observacao){
        return null;
    }

    ResponseVO atendimentoClinico (Cliente cliente, List<Animais> animais, String observacao){
        ResponseVO responseVO = new ResponseVO();
        responseVO.setId(1001);
        responseVO.setCliente(cliente);
        responseVO.setValor(BigDecimal.valueOf(50));
        responseVO.setServico(Servicos.ATENDIMENTO_CLINICO);
        int retorno;
        while(true) {
            while (true) {
                System.out.println("Digite qual a necessidade do pet");
                System.out.println("1 - Vacina");
                System.out.println("2 - Remédio");
                System.out.println("3 - Alimento");
                System.out.println("0 - O pet está bem");
                retorno = lerTeclado();
                if (retorno > 3) {
                    System.out.println("Necessidade inválida");
                } else {
                    break;
                }
            }
            switch (retorno) {
                case (1):
                    System.out.println("Digite qual a vacina");
                    System.out.println("1 - " + Vacinas.VACINA_1);
                    System.out.println("2 - " + Vacinas.VACINA_2);
                    System.out.println("3 - " + Vacinas.VACINA_3);
                    System.out.println("4 - " + Vacinas.VACINA_4);
                    System.out.println("5 - " + Vacinas.VACINA_5);
                    System.out.println("0 - para retornar para opção anterior");
            }
            return responseVO;
        }
    }

    ResponseVO vacinacao (Cliente cliente, List<Animais> animais, List<Vacinas> vacinas, String observacao){
        return null;
    }

    void veralimentos(){

    }

    void verremedios(){
        
    }
}
