/* Leia a idade de 20 pessoas e exiba a média das idades.  */

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int media = 0;
        for (int quantidade = 1; quantidade <= 20; quantidade++) {
            System.out.print("Informe a idade " + quantidade + ": ");
            int idade = scanner.nextInt();
            soma += idade;
            media = soma / 20;

        }
        System.out.println("A media das idades é: " + media);



    }
}
