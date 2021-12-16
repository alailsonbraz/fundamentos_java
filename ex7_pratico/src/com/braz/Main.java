package com.braz;

import com.braz.menu.MenuQuestoes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int cont= 1;

        Scanner input = new Scanner(System.in);
        MenuQuestoes mostrarMenu = new MenuQuestoes();

        do{
            mostrarMenu.menu();

            System.out.println("Deseja continuar? (1 - SIM/ 2 - NÃO)");
            cont=input.nextInt();

        }while (cont==1);

    }
}
