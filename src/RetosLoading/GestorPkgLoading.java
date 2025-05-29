package RetosLoading;

import java.util.Scanner;

public class GestorPkgLoading {
public static void main(String[] args) throws InterruptedException {
        int total = 20;

        for (int i = 1; i <= total; i++) {
            // Limpiar línea anterior (opcional para consola moderna)
            System.out.print("\r");

            // Parte llena
            StringBuilder barra = new StringBuilder("[");
            for (int j = 1; j < i; j++) {
                barra.append("=");
            }

            // Punta animada alterna entre > y -
            if (i < total) {
                barra.append((i % 2 == 0) ? ">" : "-");
                // Parte vacía
                for (int j = i + 1; j <= total; j++) {
                    barra.append(" ");
                }
            } else {
                barra.append("=");
            }

            barra.append("] ").append(i * 5).append("%");

            System.out.print(barra);
            Thread.sleep(200);
        }

        System.out.println();
    }

    public static void retoSpinner() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de escalones: ");
        int niveles = scanner.nextInt();

        for (int i = 0; i < niveles; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("    ");
            }

            System.out.print("|___");

            for (int k = 0; k < 3; k++) {
                System.out.print(".");
                Thread.sleep(200);
            }

            System.out.println(" / 100%");
            Thread.sleep(400);
        }
    }
}

