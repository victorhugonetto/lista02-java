/* Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade. */


import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maiorIdade = 0;
        for (int quantidade = 1; quantidade <= 20; quantidade++) {
            System.out.print("Informe a idade " + quantidade + ": ");
            int idade = scanner.nextInt();
            if (idade >= 18) {
                maiorIdade++;
            }
        }
        System.out.println("As idades maiores de 18 são: " + maiorIdade);

    }
}
