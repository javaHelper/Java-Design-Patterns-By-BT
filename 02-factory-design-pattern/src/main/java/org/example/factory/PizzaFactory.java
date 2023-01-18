package org.example.factory;

public class PizzaFactory {
    public static Pizza createPizza(String type) {
        Pizza p = null;
        if ("Cheese".equals(type)) {
            p = new CheesePizza();
        } else if ("Chicken".equals(type)) {
            p = new ChickenPizza();
        } else if ("Veggie".equals(type)) {
            p = new VeggiePizza();
        }
        return p;
    }
}