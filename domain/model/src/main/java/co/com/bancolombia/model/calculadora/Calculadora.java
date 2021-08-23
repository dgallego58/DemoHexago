package co.com.bancolombia.model.calculadora;

import java.math.BigDecimal;

public class Calculadora {


    private Calculadora() {
        //
    }

    public static Calculadora create(){
        return new Calculadora();
    }

    /**
     * metodo que si es menor que cero 0, le devuelve 1_000, si no es menor que cero 0, le devuelve 1
     * @param debt
     * @param <T>
     * @return
     */
    public <T extends Number> BigDecimal nonNegative(T debt) {
        boolean val = BigDecimal.valueOf(debt.doubleValue()).compareTo(BigDecimal.ZERO) < 1;
        return val ? BigDecimal.valueOf(1_000) : BigDecimal.ONE;
    }

    //stateless o stateful?


    //evalue si es > 18


}
