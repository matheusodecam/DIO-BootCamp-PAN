package br.com.dio.exercicios.arrays;

import java.util.Scanner;

public class EX1_NomeEIdade {
    /* Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome do aluno e o segundo
       representando sua idade. (Pare o programa inserindo o valor 0 no campo nome) */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true){
            System.out.println("Digite o nome: ");
            nome = scan.next();
            if(nome.equals("0")) break;
            do{
                System.out.println("Digite a idade: ");
                idade = scan.nextInt();
            }while(idade < 0 || idade > 120);
        };
        System.out.println("Programa encerrado com sucesso...");
    }
}
