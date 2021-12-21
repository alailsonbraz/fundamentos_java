package com.braz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        String mes;

        System.out.println("Informe o mês:");
        mes=input.next();

        switch (mes.toLowerCase()){
            case "janeiro":
            case "fevereiro":
            case "março":
                System.out.println("1º trimestre");
                break;
            case "abril":
            case "maio":
            case "junho":
                System.out.println("2º trimestre");
                break;
            case "julho":
            case "agosto":
            case "setembro":
                System.out.println("3º trimestre");
                break;
            case "outubro":
            case "novembro":
            case "dezembro":
                System.out.println("4º trimestre");
                break;
            default:
                System.out.println("Mês inválido");
        }
    }
}
