package matrizes;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] numeros = new int[3][3];

        for (int linha = 0; linha < numeros.length; linha++) {
            for (int coluna = 0; coluna < numeros[linha].length; coluna++){
                int numero = sc.nextInt();
                numeros[linha][coluna] = numero;
            }
        }

        System.out.print("Elementos da Diagonal Principal: ");
        for (int linha = 0; linha < numeros.length; linha++) {
            for (int coluna = 0; coluna < numeros[linha].length; coluna++){
                if (linha == coluna) {
                    System.out.print(numeros[linha][coluna] + " ");
                }
            }
        }

        System.out.println();
        System.out.print("Elementos da Diagonal Secundária: ");
        for (int linha = 0; linha < numeros.length; linha++) {
            for (int coluna = 0; coluna < numeros[linha].length; coluna++){
                if (linha + coluna == numeros.length - 1){
                    System.out.print(numeros[linha][coluna] + " ");
                }
            }
        }

        int somaPrincipal = 0;
        for (int linha = 0; linha < numeros.length; linha++) {
            for (int coluna = 0; coluna < numeros[linha].length; coluna++){
                if (linha == coluna) {
                    somaPrincipal += numeros[linha][coluna];
                }
            }
        }
        System.out.println();
        System.out.println("Soma dos Elementos da Diagonal Principal: " + somaPrincipal);

        int somaSecundaria = 0;
        for (int linha = 0; linha < numeros.length; linha++) {
            for (int coluna = 0; coluna < numeros[linha].length; coluna++){
                if (linha + coluna == numeros.length - 1) {
                    somaSecundaria += numeros[linha][coluna];
                }
            }
        }
        System.out.print("Soma dos Elementos da Diagonal Secundária: " + somaSecundaria);
    }
}
