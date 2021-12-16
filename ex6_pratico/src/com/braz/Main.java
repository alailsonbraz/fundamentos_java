package com.braz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int numTestes;
        float media, soma=0.0f, nota=0.0f;

        Scanner input = new Scanner(System.in);

        System.out.println("informe a quatidade de alunos: ");
        numTestes=input.nextInt();

        for(int i=0; i<numTestes; i++){
            System.out.println("Insira a nota do aluno nº " + (i+1) );
            nota=input.nextFloat();
            soma=soma+nota;
        }
        media=soma/numTestes;
        System.out.println("A média da turma é " + media);
    }
}
