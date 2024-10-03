import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner scanner = new Scanner(System.in);

        // Solicitar los 5 números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un número para la posición " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar los números
        System.out.println("Los números introducidos son:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número en la posición " + i + ": " + numeros[i]);
        }
    }
}
