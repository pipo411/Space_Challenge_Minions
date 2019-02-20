package main.java;


import java.util.ArrayList;

import main.java.rocket.Rocket;

public class Main {
    public static void main(String[] args) throws Exception {
        //Phase 1
        System.out.println("************************************* Phase 1 *************************************");
        Simulation simulation = new Simulation();
        simulation.loadItems("phase-1.txt");
        ArrayList<Rocket> rockets = simulation.loadU1();
        String x = simulation.runSimulation(rockets);
        System.out.println(x);
        ArrayList<Rocket> rockets1 = simulation.loadU2();
        String x1 = simulation.runSimulation(rockets1);
        System.out.println(x1);
        //Phase 2
        System.out.println("************************************* Phase 2 *************************************");
        Simulation simulation2 = new Simulation();
        simulation2.loadItems("phase-2.txt");
        System.out.println(simulation2.runSimulation(simulation2.loadU1()));
        System.out.println(simulation2.runSimulation(simulation2.loadU2()));
    }
}
