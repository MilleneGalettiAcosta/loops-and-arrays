package dio.loops;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares
 */

import java.util.Scanner;

public class ex04_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtyNum;
        int numero;
        int par = 0;
        int impar = 0;

        System.out.println("Quantidade de números: ");
        qtyNum = scan.nextInt();


        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) {
                par ++;
            } else {
                impar ++;
            }

            count ++;
        } while(count < qtyNum);

        System.out.println("Números pares: " + par);
        System.out.println("Números impares: " + impar);
    }
}
