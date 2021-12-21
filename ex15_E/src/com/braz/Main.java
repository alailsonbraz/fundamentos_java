package com.braz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        String mes;

        System.out.println("Informe o mês:");
        mes=input.next();

        if(mes.equalsIgnoreCase("janeiro")||
        mes.equalsIgnoreCase("fevereiro")||
        mes.equalsIgnoreCase("março")){
            System.out.println("1º trimestre");
        }else if(mes.equalsIgnoreCase("abril")||
                mes.equalsIgnoreCase("maio")||
                mes.equalsIgnoreCase("junho")){
            System.out.println("2º trimestre");
        }else if(mes.equalsIgnoreCase("julho")||
                mes.equalsIgnoreCase("agosto")||
                mes.equalsIgnoreCase("setembro")){
            System.out.println("3º trimestre");
        }else if(mes.equalsIgnoreCase("outubro")||
                mes.equalsIgnoreCase("novembro")||
                mes.equalsIgnoreCase("dezembro")){
            System.out.println("4º trimestre");
        }else{
            System.out.println("Mês inválido");
        }
    }
}
