/* Leia a idade de 20 pessoas e exiba a soma das idades.  */

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        for (int quantidade = 1; quantidade <= 20; quantidade++) {
            System.out.print("Informe a idade " + quantidade + ": ");
            int idade = scanner.nextInt();
            soma += idade;
        }

        System.out.println("A soma das idades é: " + soma);

    }
}
