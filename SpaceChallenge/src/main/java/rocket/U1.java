package main.java.rocket;


import java.util.Random;

public class U1 extends Rocket {
    private final static int COST = 100000000;
    private final static int WEIGHT = 10000;
    private final static int MAX_WEIGHT = 18000;
    Random random = new Random();


    public U1() {
        super(COST, WEIGHT, MAX_WEIGHT);
    }

    @Override
    public boolean launch() {
        //Add launch logic chance to crash
//        return Math.random() < (0.05 * (this.currentWeight / MAX_WEIGHT));
        return random.nextBoolean();
    }

    @Override
    public boolean land() {
        //Add land logic chance to crash
//        return Math.random() < (0.01 * (this.currentWeight / MAX_WEIGHT));
        return random.nextBoolean();
    }
}
