import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lecturaDatos = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("Grupo: 1");
        System.out.println("Integrantes: \n- Amores.Karla\n- Anasi.Eduardo \n- Basantes.Alexis \n- Burgos.Ariel\n- Cadena.Steve");

        while (continuar) {
            System.out.print("\nIngrese número de reto (o 0 para salir): ");
            int opcion = lecturaDatos.nextInt();
            lecturaDatos.nextLine();

            if (opcion == 0) {
                System.out.println("Programa finalizado por el usuario.");
                break;
            }

            switch (opcion) {
                case 4:
                    System.out.println("Reto 4: series Fibonacci");
                    RetosCadenas.GestorPkgCadenas.retoseriesFibonacci();
                    break;
                case 9:
                    System.out.println("Reto 9: potencias de 2");
                    RetosCadenas.GestorPkgCadenas.retoPotenciasDeDos();
                    break;
                case 14:
                    System.out.println("Reto 14: símbolos incrementales");
                    RetosCadenas.GestorPkgCadenas.retoSimbolosIncrementales();
                    break;
                case 19:
                    System.out.println("Reto 19: letras incrementales");
                    RetosCadenas.GestorPkgCadenas.retoLetrasIncrementales();
                    break;
                case 24:
                    System.out.println("Reto 24: escalera de asteriscos");
                    RetosFiguras.GestorPkgFiguras.retoEscaleraAsteriscos();
                    break;
                case 29:
                    System.out.println("Reto 29: escalera hacia la izquierda");
                    RetosFiguras.GestorPkgFiguras.retoEscaleraIzquierda();
                    break;
                case 34:
                    System.out.println("Reto 34: escalera de números");
                    RetosFiguras.GestorPkgFiguras.retoEscaleraNumeros();
                    break;
                case 39:
                    System.out.println("Reto 39: escalera avanzada");
                    RetosFiguras.GestorPkgFiguras.retoEscaleraFinal();
                    break;
                case 44:
                    System.out.println("Reto 44: eliminar letra de una frase");
                    RetosCadenas.GestorPkgCadenas.retoEliminarLetra();
                    break;
                case 49:
                    System.out.println("Reto 49: cambiar letras de una frase");
                    RetosCadenas.GestorPkgCadenas.retoCambiarLetras();
                    break;
                case 54:
                    System.out.println ("Reto 54: matriz cuadrada con nombres");
                    RetosArray.GestorPkgArray.retoMatrizCuadrada();
                    break;
                case 59:
                    System.out.println ("Reto 59: loadings de retos");
                    RetosLoading.GestorPkgLoading.main(args);
                    break;
                case 64:
                    System.out.println("Reto 64: spinner de escalones");
                    RetosLoading.GestorPkgLoading.retoSpinner();
                    break;
                case 69:
                    System.out.println ("Reto 69: multiplicación recursiva");
                    RetosRecursividad.GestorPkgRecurs.retoMultiplicacionRecursiva();
                    break;
                case 74:
                    System.out.println("Reto 74: conteo progresivo hasta");
                    RetosRecursividad.GestorPkgRecurs.conteoProgresivoHasta();
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }

            System.out.print("\n¿Desea ejecutar otro reto? (si/no): ");
            String respuesta = lecturaDatos.nextLine();
            if (!respuesta.equalsIgnoreCase("si")) {
                continuar = false;
                System.out.println("Programa finalizado.");
            }
        }

        lecturaDatos.close();
    }
}
