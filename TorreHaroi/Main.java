package TorreHaroi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        boolean valido = false;

        while (!valido) {
            try {
                System.out.print("\nIngrese el número de discos: ");
                n = scanner.nextInt();

                if (n > 0) {
                    valido = true;
                } else {
                    System.out.println("El número debe ser mayor que 0.\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida.\n");
                scanner.next();
            }
        }

        // Crear torres
        Torre torreA = new Torre(n);
        Torre torreB = new Torre(n);
        Torre torreC = new Torre(n);

        torreA.inicializar();

        System.out.println("\nEstado inicial de las torres:");
        torreA.mostrar('A');
        torreB.mostrar('B');
        torreC.mostrar('C');
        System.out.println();

        TorreDeHanoi.hanoi(n, torreA, torreB, torreC, 'A', 'B', 'C');

        int movimientosMinimos = (int) Math.pow(2, n) - 1;
        System.out.println("Movimientos mínimos: " + movimientosMinimos);

        scanner.close();
    }
}