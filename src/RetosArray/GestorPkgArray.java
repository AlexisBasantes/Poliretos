package RetosArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GestorPkgArray {

    public static void retoMatrizCuadrada() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su primer nombre completo (sin espacios): ");
        String nombre1 = scanner.nextLine().replace(" ", "");

        System.out.print("Ingrese su segundo nombre/apellido (sin espacios): ");
        String nombre2 = scanner.nextLine().replace(" ", "");

        int size = Math.max(nombre1.length(), nombre2.length());

        char[][] matriz = new char[size][size];

        // Inicializar con espacios
        for (int i = 0; i < size; i++) {
            Arrays.fill(matriz[i], ' ');
        }

        // Crear posiciones aleatorias
        List<int[]> posicionesLibres = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                posicionesLibres.add(new int[]{i, j});
            }
        }

        // Colocar letras de nombre1
        Collections.shuffle(posicionesLibres);
        Map<String, Character> posicionesNombre1 = new HashMap<>();
        for (char letra : nombre1.toCharArray()) {
            if (posicionesLibres.isEmpty()) break;
            int[] pos = posicionesLibres.remove(0);
            String key = pos[0] + "," + pos[1];
            posicionesNombre1.put(key, letra);
        }

        // Volver a llenar las posiciones y colocar letras de nombre2
        Collections.shuffle(posicionesLibres);
        for (char letra : nombre2.toCharArray()) {
            if (posicionesLibres.isEmpty()) break;
            int[] pos = posicionesLibres.remove(0);
            String key = pos[0] + "," + pos[1];

            if (posicionesNombre1.containsKey(key)) {
                matriz[pos[0]][pos[1]] = '*';
            } else {
                matriz[pos[0]][pos[1]] = letra;
            }

            mostrarMatriz(matriz);
            Thread.sleep(300); // delay de 300ms
        }

        // Colocar letras del nombre1 después, si no fueron sobreescritas
        for (Map.Entry<String, Character> entry : posicionesNombre1.entrySet()) {
            String[] indices = entry.getKey().split(",");
            int i = Integer.parseInt(indices[0]);
            int j = Integer.parseInt(indices[1]);
            if (matriz[i][j] == ' ') {
                matriz[i][j] = entry.getValue();
                mostrarMatriz(matriz);
                Thread.sleep(300); // delay
            }
        }

        System.out.println("Resultado final:");
        mostrarMatriz(matriz);
    }

    public static void mostrarMatriz(char[][] matriz) {
        for (char[] fila : matriz) {
            for (char c : fila) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
