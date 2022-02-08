package com.braz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input =  new Scanner(System.in);
        String nome;
        Double ordenado, vendas, premio;
        int profissao;

        System.out.println("Informe o nome:");
        nome= input.next();

        System.out.println("Informe a profissão: ");
        System.out.println("1 - Conercial");
        System.out.println("2 - Técnico");
        System.out.println("3 - Diretor");
        System.out.println("4 - Gerente");
        profissao=input.nextInt();

        System.out.println("Informe o valor das vendas: ");
        vendas=input.nextDouble();

        switch (profissao){
            case 1:
                ordenado=1200.00;
                premio=vendas*1.4;
                System.out.println("Nome: " + nome + "Profissão: Comercial");
                System.out.println("Valor do prêmio: " + premio);
                System.out.println("Valor final do ordenado: " + (ordenado+premio));
                break;
            case 2:
                ordenado=800.00;
                premio=vendas*1.2;
                System.out.println("Nome: " + nome + "Profissão: Técnico");
                System.out.println("Valor do prêmio: " + premio);
                System.out.println("Valor final do ordenado: " + (ordenado+premio));
                break;
            case 3:
                ordenado=1700.00;
                premio=vendas*1.3;
                System.out.println("Nome: " + nome + "Profissão: Diretor");
                System.out.println("Valor do prêmio: " + premio);
                System.out.println("Valor final do ordenado: " + (ordenado+premio));
                break;
            case 4:
                ordenado=1500.00;
                premio=vendas*1.2;
                System.out.println("Nome: " + nome + "Profissão: Comercial");
                System.out.println("Valor do prêmio: " + premio);
                System.out.println("Valor final do ordenado: " + (ordenado+premio));
                break;
            default:
                System.out.println("OPÇÃO INVÁLIDA!");
        }
    }
}
