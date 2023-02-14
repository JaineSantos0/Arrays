package vetores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Vetor ");
        for (int i = 0; i < numeros.length; i++) {
            int numero = sc.nextInt();
            numeros[i] = numero;
        }

        System.out.print("Digite o número que você deseja encontrar: ");
        int numero = sc.nextInt();

        Arrays.sort(numeros);
        int posicao = Arrays.binarySearch(numeros,numero);
        if (posicao >= 0) {
            System.out.println("O número " + numero + " está localizado na posição: " + posicao);
        } else {
            System.out.println("O número " + numero + " não foi encontrado!");
        }
    }
}