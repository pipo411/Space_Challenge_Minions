package main.java.rocket;


import java.util.Random;

public class U2 extends Rocket {
    private final static int COST = 120000000;
    private final static int WEIGHT = 18000;
    private final static int MAX_WEIGHT = 29000;
    Random random = new Random();

    public U2() {
        super(COST, WEIGHT, MAX_WEIGHT);
    }

    @Override
    public boolean launch() {
        //Add launch logic chance to crash
//        return Math.random() < (0.04 * (this.currentWeight / MAX_WEIGHT));
        return random.nextBoolean();
    }

    @Override
    public boolean land() {
        //Add land logic chance to crash
//        return Math.random() < (0.08 * (this.currentWeight / MAX_WEIGHT));
        return random.nextBoolean();
    }
}
