package RetosCadenas;

import java.util.Scanner;

public class GestorPkgCadenas {
public static void retoseriesFibonacci() {
        int cantidad = 10;

        int a = 0;
        int b = 1;
        int denominador = 2;

        System.out.println("Secuencia de series (Fibonacci):");

        for (int i = 0; i < cantidad; i++) {
            System.out.println(a + "/" + denominador);
            int siguiente = a + b;
            a = b;
            b = siguiente;
            denominador += 2;
        }
    }
    public static void retoPotenciasDeDos() {
        int cantidad = 10;
        int valor = 2;

        System.out.println("Secuencia de potencias de 2:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(valor);
            valor *= 2;
        }
    }

    public static void retoSimbolosIncrementales() {
    int cantidad = 10;
    int longitud = 2;
    int incremento = 1;
    int contadorIncrementos = 0;

    System.out.println("Secuencia de símbolos '++ +++ +++++ ...':");

    for (int i = 0; i < cantidad; i++) {

        for (int j = 0; j < longitud; j++) {
            System.out.print("+");
        }
        System.out.println();


        longitud += incremento;
        contadorIncrementos++;


        if (contadorIncrementos == 2) {
            incremento++;
            contadorIncrementos = 0;
        }
    }
}

public static void retoLetrasIncrementales() {
    int cantidad = 10;
    int repeticiones = 2;
    char letra = 'a';

    System.out.println("Secuencia de letras con repeticiones:");

    for (int i = 0; i < cantidad; i++) {
        for (int j = 0; j < repeticiones; j++) {
            System.out.print(letra);
        }
        System.out.println();

        letra++;
        repeticiones += 2;
    }
}

public static void retoEliminarLetra() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese una frase: ");
    String frase = scanner.nextLine();

    System.out.print("Ingrese una letra a eliminar: ");
    String letra = scanner.nextLine();

    if (letra.length() != 1) {
        System.out.println("Por favor ingrese solo una letra.");
        return;
    }

    char letraAEliminar = letra.charAt(0);
    String resultado = frase.replaceAll("(?i)" + letraAEliminar, "");

    System.out.println("Frase resultante: " + resultado);
}

public static void retoCambiarLetras() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese una frase: ");
    String frase = scanner.nextLine();

    System.out.print("Ingrese la letra que desea convertir a MAYÚSCULA: ");
    String letraMayus = scanner.nextLine();

    System.out.print("Ingrese la letra que desea convertir a minúscula: ");
    String letraMinus = scanner.nextLine();

    if (letraMayus.length() != 1 || letraMinus.length() != 1) {
        System.out.println("Por favor, ingrese una sola letra para cada caso.");
        return;
    }

    char aMayus = letraMayus.toLowerCase().charAt(0);
    char aMinus = letraMinus.toUpperCase().charAt(0);

    StringBuilder resultado = new StringBuilder();

    for (char c : frase.toCharArray()) {
        if (Character.toLowerCase(c) == aMayus) {
            resultado.append(Character.toUpperCase(c));
        } else if (Character.toUpperCase(c) == aMinus) {
            resultado.append(Character.toLowerCase(c));
        } else {
            resultado.append(c);
        }
    }

    System.out.println("Frase modificada: " + resultado.toString());
}


}


