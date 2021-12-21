package com.braz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        String op;
        System.out.println("Informe o género");
        op=input.nextLine();

        switch (op.toLowerCase()){
            case "f":
                System.out.println("É do sexo feminino");
                break;
            case "m":
                System.out.println("É do sexo masculino");
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }
    }
}
