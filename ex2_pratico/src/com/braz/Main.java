package com.braz;

import java.util.Scanner;

class Calculadora{
    public float soma(float x, float y){
        return (x+y);
    }
    public float subtracao(float x, float y){
        return (x-y);
    }
    public float divisao(float x, float y){
        return (x/y);
    }
    public float multiplicacao(float x, float y){
        return (x*y);
    }
}

class Menu{
    public static void exibirMenu(){
        System.out.println("Esolha as opções:");
        System.out.println("1 - SOMA");
        System.out.println("2 - SUBTRAÇÃO");
        System.out.println("3 - DIVISÃO");
        System.out.println("4 - MULTIPLICACÃO");
        System.out.println("0 - ENCERRAR");
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        Calculadora calc= new Calculadora();

        System.out.println("Insira o primeiro número:");
        float n1 = input.nextFloat();

        System.out.println("Insira o segundo número:");
        float n2 = input.nextFloat();

        int opcao=1;

        do {
            Menu.exibirMenu();
            opcao = input.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("O resultado da soma é: " + calc.soma(n1, n2));
                    break;
                case 2:
                    System.out.println("O resultado da subtração é: " + calc.subtracao(n1, n2));
                    break;
                case 3:
                    System.out.println("O resultado da divisão é: " + calc.divisao(n1, n2));
                    break;
                case 4:
                    System.out.println("O resultado da multiplicação é: " + calc.multiplicacao(n1, n2));
                    break;
                case 0:
                    System.out.println("Programa encerrado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        while (opcao!=0);
    }
}
