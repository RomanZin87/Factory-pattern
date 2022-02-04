import pizzas.Pizza;
import pizzas.PizzaType;

public class Main {
    public static void main(String[] args) {

        Pizzeria pizzeria = new Pizzeria(new PizzaFactory());
        Pizza firstOrder = pizzeria.pizzaOrder(PizzaType.MARGHERITA);
        System.out.println("\n");
        Pizza secondOrder = pizzeria.pizzaOrder(PizzaType.NAPOLETANA);

    }
}
