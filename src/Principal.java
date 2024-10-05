import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conversor conversor = new Conversor();
        int opcion;

        do {
            mostrarMenu();
            opcion = Integer.parseInt(scanner.nextLine());

            if (opcion >= 1 && opcion <= 6) {
                System.out.print("Ingrese el valor a convertir: ");
                double valor = Double.parseDouble(scanner.nextLine());
                double resultado = conversor.convertir(opcion, valor);
                System.out.printf("El resultado de la conversión es: %.2f\n", resultado);
            } else if (opcion != 7) {
                System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (opcion != 7);

        System.out.println("Saliendo del programa.");
        scanner.close();
    }

    private static void mostrarMenu() {
        String menu = """
                Seleccione una opción de conversión:
                1) Dólar -> Peso Argentino
                2) Peso Argentino -> Dólar
                3) Dólar -> Real Brasileño
                4) Real Brasileño -> Dólar
                5) Dólar -> Peso Colombiano
                6) Peso Colombiano -> Dólar
                7) SALIR
                Ingrese su opción: """;

        System.out.print(menu);
    }
}
