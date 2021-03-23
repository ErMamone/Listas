import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class pruebaListas {
    public List<String> palabras = new ArrayList<>();
    public Retorno ret = new Retorno();


    @Test
    public void validarPalabras1(){
        palabras.add("Arbol");
        palabras.add("Casa");

        String retorno = ret.retornarElMedio(palabras);

        assertEquals(retorno, "");
    }



    @Test
    public void validarPalabras2(){
        palabras.clear();

        palabras.add("Pedro");
        palabras.add("Juan");
        palabras.add("Jose");
        palabras.add("Marcos");
        String retorno = ret.retornarElMedio(palabras);

        assertEquals(retorno, " Juan Jose");
    }


}
