package RetosCadenas;

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
}


