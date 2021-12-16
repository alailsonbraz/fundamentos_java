package com.braz.questoes;

import java.util.Scanner;

public class Questao3 {
    /*Desenvolva um programa que permita 
    converter o valor de KM apresentado 
    pelo utilizador nos metros correspondentes.*/

    Scanner input = new Scanner(System.in);

    double converterDist(double km){
        return km*1000;
    }

    public void imprimeResult(){
        System.out.println("Informe a distância em kilometros: ");
        double km=input.nextDouble();
        System.out.println("A resultado da multiplicação é: " + converterDist(km));
    }
}
