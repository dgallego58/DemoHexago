package co.com.bancolombia.usecase.factorial;

import co.com.bancolombia.model.calculadora.Calculadora;
import co.com.bancolombia.model.calculadora.gateways.CalculadoraRepository;

public class FactorialUseCase implements MathematicsService {

    //puerto de entrada (inputPort
    private final CalculadoraRepository calculadoraRepository;

    public FactorialUseCase(CalculadoraRepository calculadoraRepository) {
        this.calculadoraRepository = calculadoraRepository;
    }


    @Override
    public int factorialOf(String nombre) {
        return Calculadora.create().nonNegative(calculadoraRepository.txPerPerson(nombre)).intValue();
    }
}
