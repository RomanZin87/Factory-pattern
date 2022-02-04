package pizzas;

public abstract class Pizza {

    public void rollingTheDough() {
        System.out.println("Раскатываем тесто на основу для пиццы");
    }

    public abstract void addTheFilling();

    public void bake() {
        System.out.println("Выпекаем пиццу в печи");
    }



}
