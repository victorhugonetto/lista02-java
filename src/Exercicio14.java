/* Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e
100, quantos estão entre 101 e 200 e quantos são maiores de 200. */

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero0a100 = 0;
        int numero101a200 = 0;
        int numeroMaior200 = 0;
        for (int quantidade = 1; quantidade <= 5; quantidade++) {
            System.out.print("Informe o numero " + quantidade + ": ");
            int numero = scanner.nextInt();
            scanner.nextLine();
            if (numero >= 0 && numero <= 100) {
                numero0a100++;
            } else if (numero >= 101 && numero <= 200) {
                numero101a200++;
            } else if (numero > 200) {
                numeroMaior200++;
            }
        }
        System.out.println("A quantidade de numeros entre 0 e 100 é: " + numero0a100);
        System.out.println("A quantidade de numeros entre 101 e 200 é: " + numero101a200);
        System.out.println("A quantidade de numeros maiores que 200: " + numeroMaior200);
    }
}


