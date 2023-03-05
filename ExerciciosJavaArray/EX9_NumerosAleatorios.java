package br.com.dio.exercicios.arrays;

import java.util.Random;

public class EX9_NumerosAleatorios {
    /*Faça um programa que leia 20 numeros inteiros aleatorios (entre 0 e 100), armazene-os em um vetor.
      Ao final mostre os numeros e seus sucessores*/

    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
            System.out.println((i+1) +"o NUMERO: "+ numerosAleatorios[i]);
        }
    }
}
