package Dio.OrangeTechBackEnd.Exercicios.Collections.List.test;

import Dio.OrangeTechBackEnd.Exercicios.Collections.List.domain.Gato;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoList01 {

    public static void main(String[] args) {


        Gato gato1 = new Gato("Ayato", 48, "Branco");
        Gato gato2 = new Gato("Neni", 24, "Cinza");
        Gato gato3 = new Gato("Salen", 36, "Preto");

        List<Gato> gatos = new ArrayList<>();
        gatos.add(gato1);
        gatos.add(gato2);
        gatos.add(gato3);

        //Sortear uma lista
        //Collections.shuffle(gatos);
        //System.out.println(gatos);

        //Order natual (Nome)
        //Collections.sort(gatos);
        //System.out.println(gatos);

        //Ordem pela idade
        //Collections.sort(gatos, new CompareIdade());
        //System.out.println(gatos);

        //Ordem pela cor
        //Collections.sort(gatos, new CompareCor());
        //System.out.println(gatos);

        //Ordena pelo Nome, pela Cor e depois pela Idade
        //gatos.sort(new CompareNomeIdadeCor());
        //System.out.println(gatos);
    }
}
