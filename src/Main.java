public class Main {
    public static void main(String[] args) {
        // Crear un nuevo deck de cartas
        Deck deck = new Deck();

        // Mezclar el deck
        deck.shuffle();

        // Mostrar la primera carta y actualizar el deck
        deck.head();

        // Seleccionar una carta al azar y actualizar el deck
        deck.pick();

        // Repartir una mano de 5 cartas y actualizar el deck
        deck.hand();
    }
}
