import pizzas.*;

public class PizzaFactory {

    public Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza = null;

        switch (pizzaType) {
            case MARGHERITA -> pizza = new Margherita();
            case MARINARA -> pizza = new Marinara();
            case FATTORIA -> pizza = new Fattoria();
            case CARBONARA -> pizza = new Carbonara();
            case NAPOLETANA -> pizza = new Napoletana();
        }
        return pizza;
    }
}
