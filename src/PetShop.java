import Modelos.*;
import Enum.Higiene;
import Enum.Vacinas;
import Enum.Servicos;
import Enum.EstadoAnimal;
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
import static Util.Alimento.listaAlimento;
import static Util.LerTeclado.*;
import static Util.Remedio.listaRemedio;

public class PetShop {
    String cnpj;
    Endereco endereco;

    ResponseVO higienizar (Cliente cliente, List<Animais> animais, Higiene higiene, String observacao) {

        ResponseVO responseVO = new ResponseVO();
        responseVO.setCliente(cliente);
        for (int numeroatendimento = 0; numeroatendimento < animais.size(); numeroatendimento++) {
            System.out.println(animais.get(numeroatendimento).getNome() + " está se higienizado, ele está " + animais.get(numeroatendimento).getEstadoanimal() );
            pausa();
            responseVO.setServico(Servicos.HIGIENIZAR);
            if (higiene == Higiene.BANHO) {
                responseVO.setId(1201);
                responseVO.setValor(BigDecimal.valueOf(40));
                animais.get(numeroatendimento).setEstadoanimal(EstadoAnimal.LIMPO);
            }
            if (higiene == Higiene.TOSA) {
                responseVO.setId(1202);
                responseVO.setValor(BigDecimal.valueOf(30));
                animais.get(numeroatendimento).setEstadoanimal(EstadoAnimal.TOSADO);
            }
            if (higiene == Higiene.BANHO_E_TOSA) {
                responseVO.setId(1203);
                responseVO.setValor(BigDecimal.valueOf(60));
                animais.get(numeroatendimento).setEstadoanimal(EstadoAnimal.LIMPO_E_TOSADO);
            }
        }
return responseVO;
    }
    ResponseVO atendimentoClinico (Cliente cliente, List<Animais> animais, String observacao) {
        ResponseVO responseVO = new ResponseVO();
        responseVO.setCliente(cliente);
        String observacaoin = observacao;
        for (int numeroatendimento = 0; numeroatendimento < animais.size(); numeroatendimento++) {
            responseVO.setId(1001);
            responseVO.setValor(BigDecimal.valueOf(50));
            responseVO.setServico(Servicos.ATENDIMENTO_CLINICO);
            String observacaoout;
            System.out.println(animais.get(numeroatendimento).getNome() + " está em atendimento");
            int retorno;
            int escolha;
            while (true) {
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
                            case (0): {
                                System.out.println("O pet está bem");
                                break;
                            }
                            case (1): {
                                while (true) {
                                    menuVacina();
                                    escolha = lerTeclado();
                                    if (escolha > Vacinas.values().length) {
                                        System.out.println("Vacina inválida tente novamente");
                                        continue;
                                    }
                                    break;
                                }
                                if (escolha == 0) {
                                    continue;
                                }
                                observacaoout = escolhaVacina(escolha);
                                System.out.println(observacaoout);
                                animais.get(numeroatendimento).setObservacao(observacaoout);
                                break;
                            }
                            case (2): {
                                List<Remedio> lista = new ArrayList<Remedio>();
                                lista = listaRemedio();
                                while (true) {
                                    menuRemedio();
                                    escolha = lerTeclado();
                                    if (escolha > lista.size()) {
                                        System.out.println("Remédio inválido tente novamente");
                                        continue;
                                    }
                                    break;
                                }
                                if (escolha == 0) {
                                    continue;
                                }
                                observacaoout = escolhaRemedio(escolha);
                                System.out.println(observacaoout);
                                animais.get(numeroatendimento).setObservacao(observacaoout);
                                break;
                            }
                            case (3): {
                                List<Alimento> lista = new ArrayList<Alimento>();
                                lista = listaAlimento();
                                while (true) {
                                    menuAlimento();
                                    escolha = lerTeclado();
                                    if (escolha > lista.size()) {
                                        System.out.println("Alimento inválido tente novamente");
                                        continue;
                                    }
                                    break;
                                }
                                if (escolha == 0) {
                                    continue;
                                }
                                observacaoout = escolhaAlimento(escolha);
                                System.out.println(observacaoout);
                                animais.get(numeroatendimento).setObservacao(observacaoout);
                                break;
                            }
                        }break;
                    }
                }
            return responseVO;
        }


    ResponseVO vacinacao (Cliente cliente, List<Animais> animais, List<Vacinas> vacinas, String observacao){
        ResponseVO responseVO = new ResponseVO();
        responseVO.setCliente(cliente);
        for (int numeroatendimento = 0; numeroatendimento < animais.size(); numeroatendimento ++ ) {
            responseVO.setId(1101+vacinas.get(numeroatendimento).ordinal());
            responseVO.setValor(BigDecimal.valueOf(80));
            responseVO.setServico(Servicos.VACINACAO);
            System.out.println("Pet em atendimento "+animais.get(numeroatendimento).getNome());
            EsquemaVacinal vacina = new EsquemaVacinal(vacinas.get(numeroatendimento),"Vaciando");
            cliente.getPets().get(numeroatendimento).setVacinas(vacina);
        }
    return responseVO;
    }

    void veralimentos(){
        List<Alimento> listaalimento = new ArrayList<Alimento>();
        listaalimento = listaAlimento();
        for (Alimento alimentos:listaalimento) {
            System.out.println(alimentos.toString());
        }
    }

    void verremedios(){
        List<Remedio> listaremedio = new ArrayList<Remedio>();
        listaremedio = listaRemedio();
        for (Remedio remedio:listaremedio) {
            System.out.println(remedio.toString());
        }
    }
}
