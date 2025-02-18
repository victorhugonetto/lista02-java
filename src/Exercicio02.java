/* ) Escreva um algoritmo que calcule a soma dos números de 1 a 15. */


public class Exercicio02 {
    public static void main(String[] args) {
        int soma = 0;

        for (int valor = 0; valor <= 15; valor++) {
            soma += valor;
        }
        System.out.println("A soma dos numeros de 1 a 15 é: "+soma);

    }
}
