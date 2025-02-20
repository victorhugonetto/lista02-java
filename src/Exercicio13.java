
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroGuarda = 0;
        for (int quantidade = 1; quantidade <= 20; quantidade++) {
            System.out.print("Informe o numero " + quantidade + ": ");
            int numero = scanner.nextInt();
            scanner.nextLine();
            if (numero >= 0 && numero <= 100) {
                numeroGuarda++;

            }
        }
        System.out.println("A quantidade de numero entre 0 e 100 é: " + numeroGuarda);

    }
}