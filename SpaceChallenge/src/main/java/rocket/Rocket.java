package main.java.rocket;

import main.java.Item;
import main.java.interfaces.SpaceShip;

public class Rocket implements SpaceShip {
    protected int cost;
    protected int weight;
    protected int maxWeight;
    protected int chanceLaunchExplosion;
    protected int chanceLandingCrash;
    Rocket(int cost, int weight, int maxWeight, int chanceLaunchExplosion, int chanceLandingCrash) {
        this.cost = cost;
        this.weight = weight;
        this.maxWeight = maxWeight;
        this.chanceLandingCrash = chanceLandingCrash;
        this.chanceLaunchExplosion = chanceLaunchExplosion;
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
        return false;
    }

    @Override
    public void carry(Item item) {

    }
}
