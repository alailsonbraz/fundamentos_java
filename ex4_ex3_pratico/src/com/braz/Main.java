package com.braz;

import java.util.Scanner;

class Consumo{
    public static float mediaConsumo(float x, float y){
        return (x/y);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float distancia, consumo;

        System.out.println("Insira a distância percorrida:");
        distancia=input.nextFloat();

        System.out.println("Insira o consumo de combustivel:");
        consumo=input.nextFloat();

        System.out.println("O consumo foi de " +Consumo.mediaConsumo(distancia, consumo)+ "km/l");
    }
}
