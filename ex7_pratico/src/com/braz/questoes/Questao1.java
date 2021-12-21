package com.braz.questoes;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Questao1 {
    /*
    desenvolva um programa que permita calcular
     a área de um círculo, sendo o utilizador
     a atribuir o valor do raio.
    */
        Scanner input = new Scanner(System.in);

        double calculaAreaCirculo(double raio){
            return Math.PI * Math.pow(raio, 2);
        }

        public void imprimeResult(){
            System.out.println("Informe o Valor do raio: ");
            double r=input.nextDouble();
            System.out.println("A área do círculo é: " + calculaAreaCirculo(r));
        }


}

