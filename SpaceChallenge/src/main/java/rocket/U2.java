package main.java.rocket;

public class U2 extends Rocket {
    U2 (int cost, int weight, int maxWeight, int chanceLaunchExplosion, int chanceLandingCrash) {
        super(cost, weight, maxWeight, chanceLaunchExplosion, chanceLaunchExplosion);
    }
    @Override
    public boolean launch() {
        //implement logic
        return true;
    }
    @Override
    public boolean land() {
        //implement logic
        return true;
    }
}
