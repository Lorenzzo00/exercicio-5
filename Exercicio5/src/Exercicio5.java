import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;

        String resposta;

        do {

            System.out.print("Digite um número inteiro: ");
            int numero = entrada.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }

            System.out.print("Deseja encerrar o programa? (S/N): ");
            resposta = entrada.next();

        } while (!resposta.equalsIgnoreCase("S"));

        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);

        entrada.close();
    }
}