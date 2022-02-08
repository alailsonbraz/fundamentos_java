package com.braz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input =  new Scanner(System.in);
        int nTurmas, nAlunos, cont=0, totalAlunos=0;
        double mediaAlunos;

        System.out.println("Insira a quantidade de turmas: ");
        nTurmas=input.nextInt();

        do {
            cont++;
            System.out.println("Informe a quantidade de aluno da turma " + cont);
            nAlunos=input.nextInt();
            if(nAlunos>20){
                System.out.println("A turma não pode ter mais de 20 alunos.");
                System.out.println("Informe a quantidade de aluno da turma " + cont);
                nAlunos=input.nextInt();
            }
            totalAlunos=totalAlunos+nAlunos;
        }while (cont <nTurmas);

        System.out.println("A média de alunos por turma é de: " + (totalAlunos/nTurmas) + " alunos");
    }
}
