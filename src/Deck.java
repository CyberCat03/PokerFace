import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();//almacena las cartas del deck
        initializeDeck();
    }
//inicializa el juego con todas las cartas del poker
    private void initializeDeck() {
        // Crear una baraja completa de cartas
        String[] suits = {"Tréboles", "Corazones", "Picas", "Diamantes"};
        String[] colors = {"Negro", "Rojo"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};
        //Genera las combinaciones de las cartas
        for (String suit : suits) {
            for (String value : values) {
                String color = determineColor(suit);
                Card card = new Card(suit, color, value);
                cards.add(card);
            }
        }
    }
    //Escoje el color de la carta según el palo
    private String determineColor(String suit) {
        // Determinar el color de la carta según el palo
        if (suit.equals("Tréboles") || suit.equals("Picas")) {
            return "Negro";
        } else {
            return "Rojo";
        }
    }
    public void shuffle() {
        // Mezcla las cartas del deck
        Collections.shuffle(cards);
        System.out.println("Se mezcló el deck.");
    }

    public void head() {
        // Mostrar la primera carta del deck y la remueve
        if (!cards.isEmpty()) {
            Card card = cards.remove(0);
            System.out.println("La primera carta es: " + card);
            System.out.println("Quedan " + cards.size() + " cartas en el deck.");
        } else {
            System.out.println("El deck está vacío.");
        }
    }

    public void pick() {
        // Seleccionar una carta al azar
        if (!cards.isEmpty()) {
            int index = getRandomIndex();
            Card card = cards.remove(index);
            System.out.println("Carta seleccionada al azar: " + card);
            System.out.println("Quedan " + cards.size() + " cartas en el deck.");
        } else {
            System.out.println("El deck está vacío.");
        }
    }

    private int getRandomIndex() {
        // Obtiene un índice aleatorio para seleccionar una carta al azar
        return (int) (Math.random() * cards.size());
    }

    public void hand() {
        // Reparte una mano de 5 cartas del deck
        if (cards.size() >= 5) {
            System.out.println("Repartiendo una mano de 5 cartas:");
            for (int i = 0; i < 5; i++) {
                Card card = cards.remove(0);
                System.out.println(card);
            }
            System.out.println("Quedan " + cards.size() + " cartas en el deck.");
        } else {
            System.out.println("No hay suficientes cartas en el deck para repartir una mano.");
        }
    }
}
