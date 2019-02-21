package main.java.rocket;

import main.java.Item;
import main.java.interfaces.SpaceShip;

public abstract class Rocket implements SpaceShip {
    protected int cost;
    protected int weight;
    protected int maxWeight;
    protected int currentWeight;

    public Rocket(int currentWeight, int cost, int maxWeight, int weight) {
        this.currentWeight = 0;
        this.cost = cost;
        this.maxWeight = maxWeight;
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public abstract boolean launch();

    @Override
    public abstract boolean land();

    @Override
    public boolean canCarry(Item item) {
        return (this.currentWeight + item.getWeight()) <= this.maxWeight;
    }

    @Override
    public void carry(Item item) {
        this.currentWeight += item.getWeight();
    }

    public int getCurrentWeight() {
        return currentWeight;
    }
}
