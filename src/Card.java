import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Card {
    private String palo; //representa el palo
    private String color; //representta el color (rojo o negro)
    private String valor; //representa los valores

    public Card(String suit, String color, String value) {
        this.palo = suit;
        this.color = color;
        this.valor = value;
    }

    public String toString() {
        return palo + ", " + color + ", " + valor.replace("(", "").replace(")", "");
    }
}

