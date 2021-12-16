package com.braz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n1, n2;

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        n1=input.nextInt();

        System.out.println("Insira o segundo número: ");
        n2=input.nextInt();

        System.out.println("A soma dos números informado é " + (n1+n2));
    }
}
