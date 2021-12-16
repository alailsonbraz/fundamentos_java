package com.braz.questoes;

import java.util.Scanner;

public class Questao2 {
   /* Desenvolva um programa que permita a
   multiplicação de dois algarismos inseridos
   pelo utilizador*/

    Scanner input = new Scanner(System.in);

    double multiplica(double a, double b){
        return a*b;
    }

    public void imprimeResult(){
        System.out.println("Informe o Primeiro número: ");
        double a=input.nextDouble();
        System.out.println("Informe o Primeiro número: ");
        double b=input.nextDouble();
        System.out.println("A resultado da multiplicação é: " + multiplica(a, b));
    }
}
