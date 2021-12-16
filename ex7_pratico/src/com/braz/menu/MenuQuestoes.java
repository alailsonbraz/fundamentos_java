package com.braz.menu;

import com.braz.questoes.*;

import java.util.Scanner;

public class MenuQuestoes {

    Scanner input = new Scanner(System.in);
    Questao1 q1 = new Questao1();
    Questao2 q2 = new Questao2();
    Questao3 q3 = new Questao3();
    Questao4 q4 = new Questao4();
    Questao5 q5 = new Questao5();
    Questao6 q6 = new Questao6();


    public void menu(){
        System.out.println("-----**** MENU DE QUESTÕES ****----");
        System.out.println("Selecione a opção desejada:");
        System.out.println("1 - Calcular área do círculo:");
        System.out.println("2 - Multiplicar dois números:");
        System.out.println("3 - Conversão de KM em Metros");
        System.out.println("4 - IMC");
        System.out.println("5 - For Crescente");
        System.out.println("6 - For Decrescente");

        int op= input.nextInt();
        switch (op){
            case 1:
                q1.imprimeResult();
                break;
            case 2:
                q2.imprimeResult();
                break;
            case 3:
                q3.imprimeResult();
                break;
            case 4:
                q4.imprimeResult();
                break;
            case 5:
                q5.cicloCrescente();
                break;
            case 6:
                q6.cicloDecrescente();
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }


}
