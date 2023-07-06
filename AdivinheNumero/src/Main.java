import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Seja bem-vindo ao jogo de adivinhação!\n");
        System.out.println("Você terá 5 tentativas de adivinhar um número de 1 a 100.");

        int numAleatorio = new Random().nextInt(100);
        int tentativas = 4;

        while (tentativas >= 0) {

            System.out.println("Digite um número de 0 a 100: ");
            int numeroTentado = teclado.nextInt();

            if (numAleatorio == numeroTentado) {

                System.out.println("\nParabéns! Você acertou! O número sorteado foi: " + numAleatorio);

            } else {

                System.out.println("Você errou :(. Tente novamente! Tentativa restantes: " + tentativas);
            }

            tentativas--;

        }

        System.out.println("O número sorteado foi: " + numAleatorio)
        ;
    }
}