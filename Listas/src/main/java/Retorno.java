import java.util.ArrayList;
import java.util.List;

public class Retorno {
    private String retorno = "";
    public String retornarElMedio(List<String> palabras){
        if(palabras.size() >= 3){
            for(String ret : palabras){
                if(!(ret.equals(palabras.get(0)) || ret.equals(palabras.get(palabras.size()-1)))){
                    retorno = retorno + " " + ret;
                }
            }
        }
        return retorno;
    }


}
