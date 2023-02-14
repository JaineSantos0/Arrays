package matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float[][] matrizA = new float[4][4];

        System.out.println("Matriz");
        for (int linha = 0; linha < matrizA.length; linha ++) {
            for (int coluna = 0; coluna < matrizA.length; coluna ++) {
               float nota = sc.nextInt();
               matrizA[linha][coluna] = nota;
            }
        }

        float[] media = new float[10];
        float soma = 0;
        for (int linha = 0; linha < matrizA.length; linha ++) {
            for (int coluna = 0; coluna < matrizA.length; coluna ++) {
                soma += matrizA[linha][coluna];
            }
            media[linha] = soma / 4;
        }

        for (float medias: media) {
            System.out.println(medias);
        }
    }
}
