package br.com.dio.exercicios.arrays;

import java.util.Locale;
import java.util.Scanner;

public class EX8_Consoantes {
    /* Faça um programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas. Imprima
       as consoantes.*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        int cont = 0, qtdeConsoantes = 0;
        String[] palavra = new String[6];

        while(cont < palavra.length){
            System.out.println("Letra"+ cont +":");
            String letra = scan.next();
            if(!(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))){
                palavra[cont] = letra;
                qtdeConsoantes++;
            }
            cont++;
        }
        System.out.println("Foram digitadas "+ qtdeConsoantes +" consoantes. As consoantes digitadas foram: ");
        for ( String consoante : palavra ) {
            if (consoante != null)
                System.out.println(consoante);
        }
    }
}
