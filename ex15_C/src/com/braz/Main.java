package com.braz;

import java.time.Year;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int anoInformado;
        int anoAtual = Year.now().getValue();

        System.out.println("Informe o ano de nascimento");
        anoInformado=input.nextInt();

        System.out.println("Sua idade é " + (anoAtual-anoInformado));

    }
}
