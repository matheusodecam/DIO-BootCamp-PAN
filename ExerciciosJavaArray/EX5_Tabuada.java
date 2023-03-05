package br.com.dio.exercicios.arrays;

import java.util.Locale;
import java.util.Scanner;

public class EX5_Tabuada {
    /* Desenvolva um gerador de tabuada,
       capaz de gerar uma tabuada de qualquer numero inteiro entre 1 e 10.
       O usuario deve informar de qual numero ele deseja ver a tabuada. A saida  deve ser
       conforme o exemplo:
        Tabuada de 5:
        5 x 1 = 5
        5 x 2 = 10
        .
        .
        .
        5 x 10 = 50
        */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        int num1, cont;

        while(true){
            System.out.println("Digite um numero entre 1 e 10 para ver a tabuada desse numero: ");
            num1 = scan.nextInt();
            if(num1 < 1 || num1 > 10){
                System.out.println("Numero invalido. Digite um numero entre 1 e 10 ");
                continue;
            }else{
                System.out.println("Tabuada de " + num1 +" :");
                for(cont = 1; cont < 11; cont++){
                    System.out.println(num1 + " x " + cont + " = " + (num1*cont));
                }
                break;
            }
        }
    }
}
