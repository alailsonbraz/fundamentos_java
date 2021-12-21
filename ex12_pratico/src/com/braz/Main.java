package com.braz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int opcao;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o mês");
        opcao=input.nextInt();

        switch (opcao){
            case 1:
            case 2:
            case 3:
                System.out.println("Inverno");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Primavera");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Verão");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Outono");
                break;
            default:
                System.out.println("Opção invalida");
        }
    }
}
