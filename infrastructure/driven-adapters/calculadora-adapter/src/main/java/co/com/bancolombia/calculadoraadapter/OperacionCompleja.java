package co.com.bancolombia.calculadoraadapter;

import java.util.HashMap;

public class OperacionCompleja {


    public String findIterate(String name){
        var map =  new HashMap<String, String>(){{
            put("nombre1", "David");
            put("nombre2", "Alejandro");
            put("nombre3", "Andres");
            put("nombre4", "Julian");
        }};

        return map.get(name);
    }

}
