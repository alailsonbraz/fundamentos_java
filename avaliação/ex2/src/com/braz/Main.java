package com.braz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        double n1, n2, media;

        System.out.println("Informe a primeira nota: ");
        n1=input.nextDouble();
        System.out.println("Informe a segunda nota: ");
        n2=input.nextDouble();

        media=(n1+n2)/2;

        if(media>=9){
            System.out.println("Aprovado");
        }else if(media > 7 && media < 9){
            System.out.println("Em recuperação");
        }else{
            System.out.println("Reprovado");
        }
    }
}
