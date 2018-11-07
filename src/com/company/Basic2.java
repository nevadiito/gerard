package com.company;

import java.util.Scanner;

public class Basic2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int numero1 = in.nextInt();
        System.out.println("Introduce el segundo numero");
        int numero2 = in.nextInt();
        System.out.println("Introduce el numero 1 si deseas multiplicar  // Introduce el numero 2 si deseas sumarlos");
        int introduce = in.nextInt();

        int resultado =0;

        if(introduce == 2){
            resultado = numero1+numero2;
        }else if(introduce == 1){
            resultado = numero1*numero2;
        }

        System.out.println(resultado);

    }
}