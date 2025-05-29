package RetosRecursividad;

import java.util.Scanner;

public class GestorPkgRecurs {

    public static void retoMultiplicacionRecursiva() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número (a): ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo número (b): ");
        int b = scanner.nextInt();

        int resultado = multiplicarConMemoria(a, b, 0);
        System.out.println("El resultado de " + a + " x " + b + " es: " + resultado);
    }

    private static int multiplicarConMemoria(int a, int b, int acumulado) {
        if (b == 0) {
            return acumulado;
        }
        return multiplicarConMemoria(a, b - 1, acumulado + a);
    }

    public static void conteoProgresivoHasta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número final del conteo: ");
        int n = scanner.nextInt();

        System.out.println("Conteo progresivo hasta " + n + ":");
        conteoProgresivoRecursivo(n, 1);
    }


    private static void conteoProgresivoRecursivo(int finalNum, int actual) {
        if (actual > finalNum) {
            return; // Caso base: ya se alcanzó el final
        }

        System.out.println("Avance: " + actual);
        conteoProgresivoRecursivo(finalNum, actual + 1); // llamada recursiva
    }

}
