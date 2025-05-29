package RetosFiguras;

import java.util.Scanner;

public class GestorPkgFiguras {
public static void retoEscaleraAsteriscos() {
        Scanner scanner = new Scanner(System.in); // Scanner local al método

        System.out.print("Ingrese el número de niveles: ");
        int cantidad = scanner.nextInt();

        System.out.println("Escalera de asteriscos:");
        for (int i = 1; i <= cantidad; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        }

public static void retoEscaleraIzquierda() {
    Scanner scanner = new Scanner(System.in); // Scanner local al método
    System.out.print("Ingrese el número de niveles: ");
    int cantidad = scanner.nextInt();
    int espacios = cantidad - 1;

    System.out.println("Escalera hacia la izquierda:");

    for (int i = 0; i < cantidad; i++) {
        for (int j = 0; j < espacios; j++) {
            System.out.print("   ");
        }
        System.out.println("___|");
        espacios--;
    }
}
public static void retoEscaleraNumeros() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese el número de niveles: ");
    int cantidad = scanner.nextInt();

    System.out.println("Escalera hacia la izquierda:");

    for (int i = 1; i <= cantidad; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }
        System.out.println();
    }

}

public static void retoEscaleraFinal() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el número de niveles: ");
    int niveles = scanner.nextInt();

    System.out.println("Escalera personalizada:");

    for (int fila = 1; fila <= niveles; fila++) {
        if (fila == 1) {
            System.out.println("2");
            continue;
        }

        System.out.print("1 "); // Siempre empieza con 1

        int num1 = fila + 1;        // segundo número (crece: 3, 4, 5…)
        int num2 = num1 + (fila - 2); // siguiente (suma creciente)
        int descendente = num2 - 2;  // valor descendente para penúltimo

        System.out.print(num1 + " ");

        // Si hay más de 3 columnas, se imprimen los del medio
        for (int i = 3; i < fila; i++) {
            System.out.print(num2 + " ");
            // Actualiza para la siguiente sumatoria
            num2 += (fila - 2);
        }

        if (fila > 3) {
            System.out.print(descendente + " ");
        }

        System.out.println("2"); // Siempre termina con 2
    }
}
}
