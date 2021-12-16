package com.braz.questoes;

import java.util.Scanner;

public class Questao4 {
    /*Desenvolva um programa que permita
    calcular o índice de massa corporal*/

    Scanner input = new Scanner(System.in);

    double imc(double peso, double altura){

        return peso/Math.pow(altura, 2);
    }

    public void imprimeResult(){
        System.out.println("Informe o peso em kilos: ");
        double p=input.nextDouble();
        System.out.println("Informe a altura: ");
        double a=input.nextDouble();
        System.out.println("A resultado da multiplicação é: " + imc(p, a));
    }
}
