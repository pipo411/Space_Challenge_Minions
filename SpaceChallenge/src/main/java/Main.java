package main.java;

public class Main {
    public static void main(String[] args) throws Exception {
        //Phase 1
        System.out.println("************************************* Phase 1 *************************************");
        Simulation simulation = new Simulation();
        simulation.loadItems("phase-1.txt");
        System.out.println(simulation.runSimulation(simulation.loadU1()));
        System.out.println(simulation.runSimulation(simulation.loadU2()));
        //Phase 2
        System.out.println("************************************* Phase 2 *************************************");
        Simulation simulation2 = new Simulation();
        simulation2.loadItems("phase-2.txt");
        System.out.println(simulation2.runSimulation(simulation2.loadU1()));
        System.out.println(simulation2.runSimulation(simulation2.loadU2()));
    }
}
