package main.java.rocket;

import main.java.Item;
import main.java.interfaces.SpaceShip;

public class Rocket implements SpaceShip {
    protected int cost;
    protected int weight;
    protected int maxWeight;
    protected int currentWeight;

    Rocket(int cost, int weight, int maxWeight, int currentWeight) {
        this.cost = cost;
        this.weight = weight;
        this.maxWeight = maxWeight;
        this.currentWeight = currentWeight;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
        return (this.currentWeight + item.getWeight()) <= this.maxWeight;
    }

    @Override
    public void carry(Item item) {
        this.currentWeight += item.getWeight();
    }

    public void setCurrentWeight(int currentWeight) {
        this.currentWeight = currentWeight;
    }

}
