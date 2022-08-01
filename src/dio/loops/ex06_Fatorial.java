package dio.loops;

/*
Faça um programa que calcule o fatorial de um número inteiro
fornecido pelo usuário
 */

import java.util.Scanner;

public class ex06_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multi = 1;
        for (int i = fatorial;i >= 1; i--) {
            multi = multi * i;
        }

        System.out.println("Fatorial de " + fatorial + "!" + " = " + multi);
    }
}
