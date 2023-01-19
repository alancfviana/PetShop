import Modelos.Animais;
import Modelos.Endereco;
import Modelos.ResponseVO;
import Modelos.Cliente;
import Enum.Higiene;
import Enum.Vacinas;
import Enum.Servicos;
import Util.Alimento;
import Util.Remedio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static Menus.MenuVacina.*;
import static Menus.MenuAlimento.*;
import static Menus.MenuHigienizar.*;
import static Menus.MenuRemedio.*;
import static Menus.MenuAtendimento.*;
import static Util.LerTeclado.*;

public class PetShop {
    String cnpj;
    Endereco endereco;

    ResponseVO higienizar (Cliente cliente, List<Animais> animais, Higiene higiene, String observacao){
        return null;
    }

    ResponseVO atendimentoClinico (Cliente cliente, List<Animais> animais, String observacao){
        ResponseVO responseVO = new ResponseVO();
        responseVO.setCliente(cliente);
        responseVO.setId(1001);
        responseVO.setValor(BigDecimal.valueOf(50));
        responseVO.setServico(Servicos.ATENDIMENTO_CLINICO);
        String observacaoin = observacao;
        String observacaoout;
        int numeroatendimento=0;
        int retorno;
        int escolha;
        while(true) {
            while (true) {
                menuAtendimento();
                retorno = lerTeclado();
                if (retorno > 3) {
                    System.out.println("Necessidade inválida");
                } else {
                    break;
                }
            }
            switch (retorno) {
                case (1): {
                    while(true) {
                        menuVacina();
                        escolha = lerTeclado();
                        if (escolha > Vacinas.values().length) {
                            System.out.println("Vacina inválida tente novamente");
                            continue;
                        }
                        break;
                    }
                    if(escolha == 0){
                        continue;
                    }
                    observacaoout = escolhaVacina(escolha);
                    System.out.println(observacaoout);
                    animais.get(numeroatendimento).setObservacao(observacaoout);
                    break;
                }
                case (2): {
                    List<Remedio> lista = new ArrayList<Remedio>();
                    while(true) {
                        menuRemedio();
                        escolha = lerTeclado();
                        if (escolha > lista.size()) {
                            System.out.println("Remédio inválido tente novamente");
                            continue;
                        }
                        break;
                    }
                    if(escolha == 0){
                        continue;
                    }
                    observacaoout = escolhaRemedio(escolha);
                    System.out.println(observacaoout);
                    animais.get(numeroatendimento).setObservacao(observacaoout);
                    break;
                }
                case (3): {
                    List<Alimento> lista = new ArrayList<Alimento>();
                    while(true) {
                        menuAlimento();
                        escolha = lerTeclado();
                        if (escolha > lista.size()) {
                            System.out.println("Alimento inválido tente novamente");
                            continue;
                        }
                        break;
                    }
                        if(escolha == 0){
                            continue;
                        }
                        observacaoout = escolhaAlimento(escolha);
                        System.out.println(observacaoout);
                        animais.get(numeroatendimento).setObservacao(observacaoout);
                        break;
                    }

            }
           break;
        }
        return responseVO;
    }

    ResponseVO vacinacao (Cliente cliente, List<Animais> animais, List<Vacinas> vacinas, String observacao){
        return null;
    }

    void veralimentos(){

    }

    void verremedios(){
        
    }
}
