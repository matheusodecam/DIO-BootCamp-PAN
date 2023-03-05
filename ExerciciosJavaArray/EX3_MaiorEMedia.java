package br.com.dio.exercicios.arrays;

import java.util.Locale;
import java.util.Scanner;

public class EX3_MaiorEMedia {
    /*Faça um programa que leia 5 numeros e informe o maior numero e a media
      desses numeros*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        int cont;
        float maior = Float.MIN_NORMAL;
        float[] numeros = new float[5];

        for (cont = 0; cont < 5; cont++){
            System.out.println("Digite o " + cont + "o numero: ");
            numeros[cont] = scan.nextFloat();
            if(numeros[cont] > maior)
                maior = numeros[cont];
        }
        System.out.println("Os numeros digitados foram: ");
        for (cont = 0; cont < 5; cont++){
            System.out.println("  " + numeros[cont]);
        }
        System.out.println("O maior numero digitado foi: " + maior);
    }
}
