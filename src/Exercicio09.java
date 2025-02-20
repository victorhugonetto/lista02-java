/* Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova.  */

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeMaisNovo = "";
        int idadeMaisNovo = Integer.MAX_VALUE; ;
        for (int quantidade = 1; quantidade <= 3; quantidade++) {
            System.out.println("informe seu nome: "+ quantidade + ": ");
            String nome = scanner.nextLine();
            System.out.print("Informe a idade " + quantidade + ": ");
            int idade = scanner.nextInt();
            scanner.nextLine();
            if (idade < idadeMaisNovo) {
                idadeMaisNovo = idade;
                nomeMaisNovo = nome;
            }
        }
        System.out.println("A pessoa mais nova é: " + nomeMaisNovo +" com idade: "+ idadeMaisNovo);

    }
}
