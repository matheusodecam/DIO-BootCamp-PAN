package br.com.dio.exercicios.arrays;

import java.util.Locale;
import java.util.Scanner;

public class EX2_Nota {
    /* Faça um programa que peça uma nota entre zero e dez.
       Mostre uma mensagem caso o valor seja inválido e continue pedindo até
       que o usuário informe um valor válido */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        float nota;

        do{
            //System.clearProperty();
            System.out.println("Digite uma nota entre zero e dez: ");
            nota = scan.nextFloat();
            if(nota < 0.0 || nota > 10.0){
                System.out.println("!!VALOR INVALIDO!!\nA nota digitada tem que esta entre 0(zero) e 10(dez)");
                continue;
            }else break;
        }while(true);
        System.out.println("Programa encerrado com sucesso...");
    }
}
