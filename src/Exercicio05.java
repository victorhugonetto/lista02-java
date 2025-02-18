/* Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses
números.  */

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for (int quantidade = 1; quantidade <= 10; quantidade++) {
            System.out.print("Informe o numero " + quantidade + ": ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        System.out.println("A soma dos números é: " + soma);
        scanner.close();


    }
}
