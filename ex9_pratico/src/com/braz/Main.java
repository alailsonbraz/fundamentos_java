package com.braz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int nota;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a nota: ");
        nota=input.nextInt();

        if(nota >=0 && nota <=4){
            System.out.println("Fraco");
        }else if (nota >=5 && nota <=9) {
            System.out.println("insuficiente");
        }else if (nota >=10 && nota <=14) {
            System.out.println("satisfaz");
        }else if (nota >=15 && nota <=18) {
            System.out.println("Satisfaz bastante");
        }else if (nota >=19 && nota <=20) {
            System.out.println("excelente");
        }else{
            System.out.println("Nota inválida!");
        }
    }
}
