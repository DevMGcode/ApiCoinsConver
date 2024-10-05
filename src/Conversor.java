import java.io.IOException;

public class Conversor {
    private ApiExchangeRate api;  // Instancia de ApiExchangeRate para obtener tasas de cambio

    public Conversor() {
        this.api = new ApiExchangeRate(); // Inicializa la API
    }

    public double convertir(int opcion, double valor) {
        try {
            double tasaDolarAR = api.obtenerTasaCambio("ARS"); // Tasa Dólar -> Peso Argentino
            double tasaDolarBRL = api.obtenerTasaCambio("BRL"); // Tasa Dólar -> Real Brasileño
            double tasaDolarCOP = api.obtenerTasaCambio("COP"); // Tasa Dólar -> Peso Colombiano

            switch (opcion) {
                case 1: // Dólar -> Peso Argentino
                    return valor * tasaDolarAR;
                case 2: // Peso Argentino -> Dólar
                    return valor / tasaDolarAR;
                case 3: // Dólar -> Real Brasileño
                    return valor * tasaDolarBRL;
                case 4: // Real Brasileño -> Dólar
                    return valor / tasaDolarBRL;
                case 5: // Dólar -> Peso Colombiano
                    return valor * tasaDolarCOP;
                case 6: // Peso Colombiano -> Dólar
                    return valor / tasaDolarCOP;
                default:
                    return 0; // Opción no válida
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("Error al obtener la tasa de cambio: " + e.getMessage());
            return 0;
        }
    }
}
