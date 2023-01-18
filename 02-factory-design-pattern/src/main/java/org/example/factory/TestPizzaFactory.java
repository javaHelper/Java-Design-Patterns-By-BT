package org.example.factory;

public class TestPizzaFactory {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza("Veggie");
    }
}