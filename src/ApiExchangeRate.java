import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiExchangeRate {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/771c738ace86fd9edbb356f3/latest/USD";

    public double obtenerTasaCambio(String moneda) throws IOException, InterruptedException {
        // Crear HttpClient
        HttpClient client = HttpClient.newHttpClient();

        // Crear HttpRequest
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL)) // URL de la API
                .GET() // Método GET
                .build();

        // Enviar solicitud y obtener HttpResponse
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Verificar si el código de respuesta es 200 (éxito)
        if (response.statusCode() != 200) {
            throw new IOException("Error en la conexión a la API: " + response.statusCode());
        }

        // Parsear la respuesta JSON
        JsonObject jsonResponse = JsonParser.parseString(response.body()).getAsJsonObject();

        // Extraer la tasa de cambio específica
        return jsonResponse.getAsJsonObject("conversion_rates").get(moneda).getAsDouble();
    }
}
