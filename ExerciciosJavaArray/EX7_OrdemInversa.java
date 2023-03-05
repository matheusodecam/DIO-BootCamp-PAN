package br.com.dio.exercicios.arrays;

import java.util.Locale;
import java.util.Scanner;

public class EX7_OrdemInversa {
    /*Crie um vetor de 6 numeros inteiros e mostre-os na ordem inversa.*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        int[] numero = new int[6];

        for(int cont = 0; cont < 6; cont++){
            System.out.println("Digite o "+ cont +"o numero: ");
            numero[cont] = scan.nextInt();
        }

        System.out.println("O array é: ");
        for(int cont = 0; cont < 6; cont++){
            System.out.println(" "+ numero[cont]);
        }

        System.out.println("O array invertido é: ");
        for(int cont = 5; cont >= 0; cont--){
            System.out.println(" "+ numero[cont]);
        }
        System.out.println("Programa encerrado com sucesso...");
    }
}
