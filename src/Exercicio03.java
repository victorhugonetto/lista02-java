/*  Leia o nome do usuário e escreva o nome dele na tela 10 vezes. */

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String nome = leitor.nextLine();

        for (int quantidade = 0; quantidade < 10; quantidade++){
            System.out.println(nome);
        }
    }
}
