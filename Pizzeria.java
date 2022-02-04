import pizzas.Pizza;
import pizzas.PizzaType;

public class Pizzeria {

    private final PizzaFactory pizzaFactory;

    public Pizzeria(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza pizzaOrder(PizzaType pizzaType) {
        System.out.println("Принимаем заказ");
        Pizza pizza = pizzaFactory.createPizza(pizzaType);
        System.out.println("Готовим пиццу: " + pizza.getClass().getSimpleName());
        pizza.rollingTheDough();
        pizza.addTheFilling();
        pizza.bake();

        return pizza;
    }






}
