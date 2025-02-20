/* Crie um algoritmo leia um número do usuário e exiba a sua tabuada de
multiplicação. */

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int numero = scanner.nextInt();
        for (int n = 1; n <= 10; n++){
            int resultado = numero * n;
            System.out.println(numero +" vezes " + n + " é igual: " + resultado);
        }
    }
}
