package co.com.bancolombia.calculadoraadapter.config;

import co.com.bancolombia.calculadoraadapter.CalculatorAdapter;
import co.com.bancolombia.calculadoraadapter.OperacionCompleja;
import co.com.bancolombia.model.calculadora.gateways.CalculadoraRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
@Component
public class CalculatorAutoConfiguration {

    @Bean
    public CalculadoraRepository calculadoraRepository(){
        return new CalculatorAdapter(new OperacionCompleja());
    }

}
