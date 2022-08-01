package dio.loops;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo até que o usário informe valor correto
 */
public class ex2_Nota {
    public static void main(String[] args) {
         Scanner  scan = new Scanner(System.in);

         int nota;

        System.out.println("Nota:");
        nota = scan.nextInt();

        while(nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Digite novamente");
            nota = scan.nextInt();
        }
    }
}

