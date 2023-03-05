package br.com.dio.exercicios.arrays;

import java.util.Locale;
import java.util.Scanner;

public class EX6_Fatorial {
    /* Faça um programa que calcule o fatorial de um numero inteiro fornecido pelo usuario.
       EX: 5! = 120 (5 x 4 x 3 x 2 x 1) */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        int num;

        while(true){
            System.out.println("Digite um numero inteiro para ser calculado seu fatorial");
            num = scan.nextInt();

            if(num < 0){
                System.out.println("Digite um numero valido. É preciso um numero positivo para ser calculado o fatorial");
                continue;
            }else
                System.out.println(num + "! = " + calcularFatorial(num));
                break;
        }
        System.out.println("Programa encerrado...");
    }

    public static int calcularFatorial(int num){
        if(num == 0 || num == 1)
            return 1;
        else
            return num * calcularFatorial((num-1));
    }

}
