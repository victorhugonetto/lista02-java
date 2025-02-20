/* Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são
pares  */

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroPar = 0;
        for (int quantidade = 1; quantidade <= 20; quantidade++) {
            System.out.print("Informe o numero " + quantidade + ": ");
            int numero = scanner.nextInt();
            scanner.nextLine();
            if (numero % 2 == 0) {
                numeroPar++;

            }
        }
        System.out.println("Os numeros pares são: " + numeroPar);

    }
}
