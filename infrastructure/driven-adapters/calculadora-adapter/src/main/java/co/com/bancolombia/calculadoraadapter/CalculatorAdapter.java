package co.com.bancolombia.calculadoraadapter;

import co.com.bancolombia.model.calculadora.gateways.CalculadoraRepository;

public class CalculatorAdapter implements CalculadoraRepository {

    private final OperacionCompleja operacionCompleja;

    public CalculatorAdapter(OperacionCompleja operacionCompleja) {
        this.operacionCompleja = operacionCompleja;
    }

    @Override
    public int txPerPerson(String name) {
        if (operacionCompleja.findIterate(name) == null) {
            return 0;
        }
        return 10;
    }
}
