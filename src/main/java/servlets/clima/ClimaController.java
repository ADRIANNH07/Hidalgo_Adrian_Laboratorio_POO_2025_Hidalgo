package servlets.clima;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ClimaController {

    @GetMapping("/clima")
    public ResponseEntity<Map<String, Object>> getClima(
            @RequestParam(name = "ciudad", required = true) String ciudadParam) {

        if (ciudadParam.trim().isEmpty()) {
             return ResponseEntity.badRequest().body(createErrorResponse("El parámetro 'ciudad' es obligatorio"));
        }

        String ciudadFormateada = formatCiudad(ciudadParam);
        Map<String, Object> responseBody = new HashMap<>();

        try {
            double temperatura = simularConsultaApiClima(ciudadParam);

            String estado = determinarEstado(temperatura);

            responseBody.put("ciudad", ciudadFormateada);
            responseBody.put("temperatura", temperatura);
            responseBody.put("estado", estado);

            return ResponseEntity.ok(responseBody); 

        } catch (Exception e) {
            String errorMessage = "No se pudo obtener informacion del clima para " + ciudadFormateada;
            return ResponseEntity.status(500).body(createErrorResponse(errorMessage)); // 500
        }
    }


    private double simularConsultaApiClima(String ciudad) throws Exception {
        String ciudadNorm = ciudad.toLowerCase().replaceAll("\\s+", "");

        switch (ciudadNorm) {
            case "buenosaires":
                return 23.5; 
            case "lapaz":
                return 7.1;  
            case "santiago":
                return 28.9; 
            case "error":
                throw new Exception("Simulacion de fallo de conexion.");
            default:
                return 10.0 + (Math.random() * 20.0); 
        }
    }

    private String determinarEstado(double temperatura) {
        if (temperatura < 10) {
            return "frio";
        } else if (temperatura <= 25) { 
            return "templado";
        } else {
            return "caluroso";
        }
    }
    
    private String formatCiudad(String ciudad) {
        return ciudad.replaceAll("([a-z])([A-Z])", "$1 $2");
    }

    private Map<String, Object> createErrorResponse(String message) {
        Map<String, Object> error = new HashMap<>();
        error.put("error", message);
        return error;
    }
}