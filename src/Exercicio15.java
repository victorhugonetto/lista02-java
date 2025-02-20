/*  Escreva um algoritmo que leia uma sequência de números do usuário e realize a
soma desses números. Encerre a execução quando um número negativo for digitado */

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for (int quantidade = 1; quantidade <= 5; quantidade++) {
            System.out.print("Informe o numero " + quantidade + ": ");
            int numero = scanner.nextInt();
            soma += numero;
            if (numero < 0) {
                System.out.println("Numero negativios não são permitidos, programa sera encerrado");
                break;
            }
        }

        System.out.println("A soma dos números é: " + soma);
        scanner.close();


    }
}
