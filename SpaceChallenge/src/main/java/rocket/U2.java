package main.java.rocket;


import java.util.Random;

public class U2 extends Rocket {
    private final static int COST = 120000000;
    private final static int WEIGHT = 18000;
    private final static int MAX_WEIGHT = 29000;
    private final static int CURRENT_WEIGHT = 0;
    private final static Random random = new Random();
    public U2() {
        super(COST, WEIGHT, MAX_WEIGHT, CURRENT_WEIGHT);
    }

    @Override
    public boolean launch() {
        int number = random.nextInt(10);
        double randomProb = number / 100.0;
        return randomProb <= (0.04 * (this.currentWeight / MAX_WEIGHT));
    }

    @Override
    public boolean land() {
        int number = random.nextInt(10);
        double randomProb = number / 100.0;
        return randomProb <= (0.08 * (this.currentWeight / MAX_WEIGHT));
    }
}
