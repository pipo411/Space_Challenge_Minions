package main.java;


import java.util.ArrayList;

import main.java.rocket.Rocket;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList results;
        double costU1;
        double costU2;
        //Phase 1
        System.out.println("************************************* Phase 1 *************************************");
        Simulation simulation = new Simulation();
        simulation.loadItems("phase-1.txt");
        results = simulation.runSimulation(simulation.loadU1());
        System.out.println("U1: ");
        System.out.println(String.format("The simulation has the following results Budget: %s and Rockets: %s", results.get(0), results.get(1)));
        costU1 = (Double) results.get(1);

        results = simulation.runSimulation(simulation.loadU2());
        System.out.println("U2: ");
        System.out.println(String.format("The simulation has the following results Budget: %s and Rockets: %s", results.get(0), results.get(1)));
        costU2 = (Double) results.get(1);

        //Phase 2
        System.out.println("************************************* Phase 2 *************************************");
        Simulation simulation2 = new Simulation();
        simulation2.loadItems("phase-2.txt");
        results = simulation2.runSimulation(simulation.loadU1());
        System.out.println("U1: ");
        System.out.println(String.format("The simulation has the following results Budget: %s and Rockets: %s", results.get(0), results.get(1)));
        costU1 += (Double) results.get(1);

        results = simulation2.runSimulation(simulation.loadU2());
        System.out.println("U2: ");
        System.out.println(String.format("The simulation has the following results Budget: %s and Rockets: %s", results.get(0), results.get(1)));
        costU2 += (Double) results.get(1);

        //get the best simulation:
        String finalOption =  costU1 < costU2 ? "The U1 is the best option" : "The U2 is the best option";
        System.out.println(finalOption);


    }
}
