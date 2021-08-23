package co.com.bancolombia.api;

import co.com.bancolombia.api.transfer.OpCommand;
import co.com.bancolombia.usecase.factorial.MathematicsService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class ApiRest implements CalculadoraSwagger {

    private final MathematicsService mathematicsService;

    public ApiRest(MathematicsService mathematicsService) {
        this.mathematicsService = mathematicsService;
    }

    /**
     * @param nombre
     * @return
     */
    @Override
    public ResponseEntity<Integer> performOperation(@RequestBody final OpCommand nombre) {

        HttpHeaders h = new HttpHeaders();
        h.get("Content-Type");
        h.get(HttpHeaders.CONTENT_TYPE);
        return ResponseEntity.ok(mathematicsService.factorialOf(nombre.getNombre()));
    }

    /**
     * 1. Modelo son REGLAS de negocio, NO SON DTO
     * 2. DTO tienen validaciones en sus atributos Y NO SON ENTIDADES PERSISTENTES
     * 3. El adaptador es la Implementación del puerto (input port) en banco esto es <MODEL_NAME>Repository
     * 4. El UseCase usa el Modelo y se apoya en el adapter para enviar/recibir/validar información con terceros
     * 5. Se debe Programar Orientado a Interfaces (facilita el DI)
     * 6. Los test deben ser CORTOS, SENCILLOS y Testear SOLO lo que amerita
     * 7. NO MEZCLEN UseCases
     * 8. NO deben validar toString ni equalsAndHashCode en Entidades Persistentes (JPA) (lazyFetch eagerFetch)
     *
     */

}
