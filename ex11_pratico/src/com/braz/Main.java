package com.braz;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        int opcao;
        int numMes;
        String nomeMes;

        System.out.println("Se quer informar as os meses através de números digite 1:");
        System.out.println("Se quer informar as os meses através dos nomes digite 2:");

        opcao=input.nextInt();
        switch (opcao){
            case 1:
                System.out.println("Insira o número relacionado ao mês: ");
                numMes=input.nextInt();
                if(numMes>=1 && numMes<=3){
                    System.out.println("Inverno");
                }else if(numMes>=4 && numMes<=6) {
                    System.out.println("Primavera");
                }else if(numMes>=7 && numMes<=9) {
                    System.out.println("Verão");
                }else if(numMes>=10 && numMes<=12) {
                    System.out.println("Outono");
                }else {
                    System.out.println("Mês inválido");
                }
                break;
            case 2:
                System.out.println("Insira o nome do mês: ");

                nomeMes=input.next();

                nomeMes=nomeMes.toLowerCase();
                
                if(nomeMes.equals("janeiro") || nomeMes.equals("fevereiro") || nomeMes.equals("março")) {
                    System.out.println("Inverno");
                }else if(nomeMes.equals("abril") || nomeMes.equals("maio") || nomeMes.equals("junho")) {
                    System.out.println("Primavera");
                }else if(nomeMes.equals("julho") || nomeMes.equals("agosto") || nomeMes.equals("setembro")) {
                    System.out.println("Verão");
                }else if(nomeMes.equals("outubro") || nomeMes.equals("novembro") || nomeMes.equals("dezembro")) {
                    System.out.println("Outono");
                }else {
                    System.out.println("Mês inválido");
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + opcao);
        }
    }
}
