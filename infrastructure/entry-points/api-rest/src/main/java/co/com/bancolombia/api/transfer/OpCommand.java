package co.com.bancolombia.api.transfer;

import java.io.Serializable;

public class OpCommand implements Serializable {


    private String nombre;

    public OpCommand() {
        //
    }

    public String getNombre() {
        return nombre;
    }

    public OpCommand setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
}
