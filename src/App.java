import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> diccionario = new HashMap<>(20);

        diccionario.put("Gato", "Cat");
        diccionario.put("Perro", "Dog");
        diccionario.put("Casa", "House");
        diccionario.put("Mesa", "Table");
        diccionario.put("Comida", "Food");
        diccionario.put("Madre ", "Mother");
        diccionario.put("Gente", "People");
        diccionario.put("Amigo", "Friend");
        diccionario.put("Love", "Amor");
        diccionario.put("Beber", "Drink");
        diccionario.put("Comer", "Eat");
        diccionario.put("Dormir", "Sleep");
        diccionario.put("Trabajar", "Work");
        diccionario.put("Manzana", "Apple");
        diccionario.put("Leche", "Milk");
        diccionario.put("Sol", "Sun");
        diccionario.put("Luna", "Moon");
        diccionario.put("Arbol", "Tree");
        diccionario.put("Rojo", "Red");
        diccionario.put("Amarillo", "Yellow");

        for (String español : diccionario.keySet()) {
            System.out.println(español + " - " + diccionario.get(español));
        }
    }
}
