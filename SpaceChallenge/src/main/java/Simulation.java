package main.java;

import main.java.rocket.Rocket;
import main.java.rocket.U1;
import main.java.rocket.U2;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {
    private ArrayList<Item> listOfItems;

    public Simulation() {
        listOfItems = new ArrayList<>();
    }

    public void loadItems(String path_file) throws Exception {
        String path = String.format("src/main/java/resources/%s", path_file);
        File file = new File(path);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String[] item_description = scanner.nextLine().split("=");
            Item item = new Item(item_description[0], Integer.parseInt(item_description[1]));
            this.listOfItems.add(item);
        }
    }

    public ArrayList<Rocket> loadU1() {
        ArrayList<Rocket> rocketList = new ArrayList<>();
        U1 rocket = new U1();
        //Iterate item list
        for (Item item : this.listOfItems) {
            if (!rocket.canCarry(item)) {
                rocketList.add(rocket);
                rocket = new U1();
            }
            rocket.carry(item);
        }
        //verify if the last rocket was added to rocketList
        if (!rocketList.contains(rocket)) {
            rocketList.add(rocket);
        }
        return rocketList;
    }

    public ArrayList<Rocket> loadU2() {

        ArrayList<Rocket> rocketList = new ArrayList<>();
        U2 rocket = new U2();
        for (Item item : this.listOfItems) {
            if (!rocket.canCarry(item)) {
                rocketList.add(rocket);
                rocket = new U2();
            }
            rocket.carry(item);
        }
        if (!rocketList.contains(rocket)) {
            rocketList.add(rocket);
        }
        return rocketList;
    }

    public ArrayList<Double> runSimulation(ArrayList<Rocket> rockets) {
        ArrayList<Double> results = new ArrayList<>();

        double budget = 0;
        int rocketCount = 0;
        for (Rocket rocket : rockets) {
            while (!rocket.land() || !rocket.launch()) {
                rocketCount++;
                budget += rocket.getCost();
            }

            rocketCount++;
            budget += rocket.getCost();
        }
        results.add(budget);
        results.add((double) rocketCount);
        return results;
    }
}
