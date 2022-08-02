package dio.arrays;

/*
Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100)
Armazene-os num vetor
Mostre os números e seus sucessores.
 */

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numeros = new int[20];

        for(int i = 0; i < numeros.length; i++) {
            int num = random.nextInt(100);
            numeros[i] = num;
        }

        System.out.print("\nNúmeros aleatórios: ");
        for (int n : numeros) {
            System.out.print(n + " ");
        }

        System.out.print("\nSucessores: ");
        for (int n : numeros) {
            System.out.print((n+1) + " ");
        }
    }
}
