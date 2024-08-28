import java.util.Random;

public class BancoDePalabras {

    private String[] palabras;

    public BancoDePalabras() {
        this.palabras = new String[] {"banana", "computadora", "telefono", "teclado", "mouse"};
    }

    String darPalabra() {
        Random rand = new Random();

        return palabras[rand.nextInt(palabras.length)];
    }

}