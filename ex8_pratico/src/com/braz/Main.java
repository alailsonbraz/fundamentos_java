package com.braz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        double soma=0, med;

        for(int i=0; i<3; i++){
            System.out.println("Informe a nota " + (i+1));

            double nota = input.nextDouble();
            soma += nota;
        }
        med=soma/3;

        if(med>=10){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
    }
}
