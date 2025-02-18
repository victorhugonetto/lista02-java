/* Leia o nome um número do usuário um número N e escreva o nome dele na tela N
vezes. */

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String nome = leitor.nextLine();

        System.out.println("Informe um numero:");
        int numero = leitor.nextInt();

        for (int quantidade = 0; quantidade < numero; quantidade++){
            System.out.println(nome);
        }
    }
}
