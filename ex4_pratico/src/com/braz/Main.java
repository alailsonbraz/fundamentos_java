package com.braz;

import java.util.Scanner;

class CalcFinalSalary {
    public float finalSalary(float base, float comiss, float tSales){
        return (float) (base+(tSales*0.15));
    }
}

public class Main {

    public static void main(String[] args) {
        // write your code here
        String nameSeller;
        float baseSalary, commission= 0.15f, totalSales;


        Scanner input = new Scanner(System.in);
        CalcFinalSalary calc = new CalcFinalSalary();

        System.out.println("Informe o nome do Vendedor: ");
        nameSeller=input.nextLine();

        System.out.println("Informe o salário base do Vendedor: " + nameSeller);
        baseSalary=input.nextFloat();

        System.out.println("Informe o valor das vendas efetuadas pelo Vendedor: " + nameSeller);
        totalSales=input.nextFloat();

        System.out.println("O salário final é: " + calc.finalSalary(baseSalary, commission, totalSales));
    }
}
