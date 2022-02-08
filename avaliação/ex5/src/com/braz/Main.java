package com.braz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        int n1, n2;

        System.out.println("Informe o primeiro inteiro: ");
        n1=input.nextInt();
        System.out.println("Informe o segundo inteiro: ");
        n2=input.nextInt();

        System.out.println("A soma dos inteiros é: " + (n1+n2));
        System.out.println("A direfença dos inteiros é: " + (n1-n2));
        System.out.println("O produto dos inteiros é: " + (n1*n2));
        System.out.println("A média dos inteiros é: " + ((n1+n2)/2));
        if(n1>n2){
            System.out.println("O maior dos inteiros é: " + n1);
            System.out.println("O menor dos inteiros é: " + n2);
        }else{
            System.out.println("O maior dos inteiros é: " + n2);
            System.out.println("O menor dos inteiros é: " + n1);
        }
    }
}
