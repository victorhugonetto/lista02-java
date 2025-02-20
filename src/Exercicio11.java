/*  Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são
maiores do que 8.  */

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroMaior8 = 0; ;
        for (int quantidade = 1; quantidade <= 3; quantidade++) {
            System.out.print("Informe o numero " + quantidade + ": ");
            int numero = scanner.nextInt();
            scanner.nextLine();
            if (numero >= 8) {
                numeroMaior8++;

            }
        }
        System.out.println("Os numeros maiores que 8 são: " + numeroMaior8);

    }
}
