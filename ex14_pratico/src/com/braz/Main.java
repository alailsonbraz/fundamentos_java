package com.braz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        double preco1, preco2, preco3;

        System.out.println("Informe o preco do primeiro produto:");
        preco1=input.nextDouble();
        System.out.println("Informe o preco do segundo produto:");
        preco2=input.nextDouble();
        System.out.println("Informe o preco do terceiro produto:");
        preco3=input.nextDouble();

        if(preco1<preco2 && preco1<preco3){
            System.out.println("C0mpre o primeiro produto");
        }else if(preco2<preco1 && preco2<preco3){
            System.out.println("Compre o segundo produto");
        }else if(preco3<preco1 && preco3<preco2){
            System.out.println("Compre o terceiro produto");
        }else{
            System.out.println("Os produtos tem o mesmo preço");
        }

    }
}
