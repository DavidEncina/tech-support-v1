import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    // Genera numeros aleatorios
    private Random alAzar;
    // Almacena objetos de tipo String
    private ArrayList<String> lista;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        alAzar = new Random();
        lista = new ArrayList<>(Arrays.asList(
        "¿Puedes repetirme la pregunta?", "Ese problema te lo ha generado tu sistema operativo", "Estamos trabajando en una solucion para tu problema",
        "Intenta reiniciar tu ordenador", "Ese error no lo conociamos, tenemos que investigar"));
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        return lista.get(alAzar.nextInt(lista.size()));
    }
}
