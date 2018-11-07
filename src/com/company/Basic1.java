package com.company;

import java.util.Scanner;

public class Basic1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numero = in.nextInt();
        int multiplo4 = 4;
        int resultado;

        resultado = numero%multiplo4;

        if (resultado==0 ){
            System.out.println("año bisiesto");
        }else{
            System.out.println("año normal");
        }

    }
}