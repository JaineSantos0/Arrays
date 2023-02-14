package matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[][] matrizA = new double[10][4];

        System.out.println("Matriz");
        for (int linha = 0; linha < matrizA.length; linha ++) {
            for (int coluna = 0; coluna < matrizA[linha].length; coluna ++) {
                matrizA[linha][coluna] = sc.nextDouble();
            }
        }

        double[] media = new double[10];
        double soma = 0;
        for (int linha = 0; linha < matrizA.length; linha ++) {
            for (int coluna = 0; coluna < matrizA[linha].length; coluna ++) {
                soma += matrizA[linha][coluna];
            }
            media[linha] = soma / matrizA[linha].length;
        }

        for (double medias: media) {
            System.out.printf("%.2f ",medias);
        }
    }
}