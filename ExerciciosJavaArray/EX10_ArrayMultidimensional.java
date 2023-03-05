package br.com.dio.exercicios.arrays;

import java.util.Random;

public class EX10_ArrayMultidimensional {
    /* Gerir e imprimir uma matriz M 4x4 com valores aleatorios entre 0-9*/

    public static void main(String[] args) {
        Random random = new Random();

        int[][] valoresAleatorios = new int[4][4];
        for (int i = 0; i < 4 ; i++){
            System.out.println("\n");
            for (int j = 0; j < 4; j++){
                valoresAleatorios[i][j] = random.nextInt(9);
            }
        }
        for (int i = 0; i < 4 ; i++){
            System.out.println("\n");
            for (int j = 0; j < 4; j++){
                System.out.println(" "+ valoresAleatorios[i][j]+ " ");
            }
        }
    }
}
