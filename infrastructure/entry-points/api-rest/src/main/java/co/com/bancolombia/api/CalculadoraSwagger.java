package co.com.bancolombia.api;

import co.com.bancolombia.api.transfer.OpCommand;
import org.springframework.http.ResponseEntity;

public interface CalculadoraSwagger {

    ResponseEntity<Integer> performOperation(OpCommand nombre);

}
