package br.com.dio.exercicios.arrays;

import java.util.Locale;
import java.util.Scanner;

public class EX4_ParEImpar {
    /* Faça um programa que peça N numeros inteiros, calcule e mostre a quantidade de numeros pares
       e a quantidade de numeros impares.*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        int cont, N = 0, par = 0, impar = 0;

        do{
            System.out.println("Digite a quantidade de numeros: ");
            N = scan.nextInt();
            if(N < 1){
                System.out.println("!!!Digite uma quantidade de numeros maior que 0!!!");
                continue;
            }else break;
        }while(true);

        int[] numero = new int[N];

        for(cont = 0; cont < N; cont ++){
            System.out.println("Digite o " + cont + "o numero");
            numero[cont] = scan.nextInt();
            if(numero[cont] % 2 == 0)
                par++;
            else
                impar++;
        }
        System.out.println("Foram digitados " + N + " numeros!\nOs numeros digitados foram: ");
        for(cont = 0; cont < N; cont ++){
            System.out.println(" " + numero[cont]);
        }
        System.out.println("Dos numeros digitados " + par + " era(m) par(es) e " + impar + " era(m) impar(es).");
    }
}
