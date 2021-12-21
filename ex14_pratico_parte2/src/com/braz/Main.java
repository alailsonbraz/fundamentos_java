package com.braz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        String turno;
        System.out.println("Informe o turno em que estuda:\n M – Matutino\n" +
                " V- Vespertino\n" +
                " N – Noturno");
        turno=input.next().toLowerCase();

        switch (turno){
            case "m":
                System.out.println("Bom dia");
                break;
            case "v":
                System.out.println("Boa tarde");
                break;
            case "n":
                System.out.println("Boa noite");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
