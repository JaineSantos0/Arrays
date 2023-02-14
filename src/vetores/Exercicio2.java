package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Vetor ");
        for (int i = 0; i < numeros.length; i++) {
            int numero = sc.nextInt();
            numeros[i] = numero;
        }

        System.out.print("Elementos nos índices ímpares: ");
        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 != 0) {
                System.out.print(numeros[i] + " ");
            }
        }

        System.out.println();
        System.out.print("Elementos pares: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
            }
        }

        double soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        System.out.println();
        System.out.println("Soma: " + soma);

        double media = soma/numeros.length;
        System.out.printf("%.2f",media );
    }
}