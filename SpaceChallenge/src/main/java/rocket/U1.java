package main.java.rocket;


import java.util.Random;

public class U1 extends Rocket {
    private final static int COST = 100000000;
    private final static int WEIGHT = 10000;
    private final static int MAX_WEIGHT = 18000;
    private final static int CURRENT_WEIGHT = 0;

    public U1() {
        super(COST, WEIGHT, MAX_WEIGHT, CURRENT_WEIGHT);
    }

    @Override
    public boolean launch() {
        double probability = (double) getCurrentWeight() / MAX_WEIGHT;
        return Math.random() > 0.05 * probability;
    }

    @Override
    public boolean land() {
        double probability = (double) getCurrentWeight() / MAX_WEIGHT;
        return Math.random() > 0.01 * probability;
    }
}
