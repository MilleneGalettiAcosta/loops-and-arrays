package dio.loops;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média dos números.
 */

import java.util.Scanner;

public class ex03_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        int count = 0;
        int maior = 0;
        int media = 0;
        do {
            System.out.println("Número:");
            numero = scan.nextInt();
            media = media + numero;
            if (numero > maior) maior = numero;

            count = count + 1;
        } while (count < 5);

        System.out.println("Maior número:" + maior);
        System.out.println("A média é: " + media/count);
    }
}
