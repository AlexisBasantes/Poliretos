import java.util.Scanner;

public class App {
    public static void main(String[] args)throws Exception {
    Scanner lecturaDatos = new Scanner(System.in);

        System.out.println("Grupo: 1");
        System.out.println("Integrantes: \n- Amores.Karla\n- Anasi.Eduardo \n- Basantes.Alexis \n- Burgos.Ariel\n- Cadena.Steve");
        System.out.print("Ingrese numero de reto: ");
        int opcion = lecturaDatos.nextInt();
        switch (opcion) {
            case 4:
                System.out.println("Reto 4: series Fibonacci");
                RetosCadenas.GestorPkgCadenas.retoseriesFibonacci();
                break;
            case 9 :
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

        }

    }
}
