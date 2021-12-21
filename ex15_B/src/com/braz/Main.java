package com.braz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*Desenvolva um programa que:
        Verifique se a letra digitada é vogal ou consoante*/

        Scanner input = new Scanner(System.in);
        String letra;
        System.out.println("Informe uma letra");
        letra=input.next().toLowerCase();
        boolean isLetter = letra.matches("[aA-zZ]*");
        if(!isLetter) {
            System.out.println("O caracter inserido não é uma letra");
        }else if(letra.equals("a")||letra.equals("e")||letra.equals("i")||letra.equals("o")||letra.equals("u")){
            System.out.println("É uma vogal");
        }else {
            System.out.println("É uma consoante");
        }
    }
}
