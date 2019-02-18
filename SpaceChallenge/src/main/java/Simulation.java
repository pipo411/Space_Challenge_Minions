package main.java;

import main.java.rocket.Rocket;
import main.java.rocket.U1;
import main.java.rocket.U2;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {
    private ArrayList<Item> listOfItems = new ArrayList<>();

    public ArrayList<Item> loadItems(String path_file) throws Exception {
        String path = String.format("src\\main\\java\\resources\\%s", path_file);
        File file = new File(path);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String[] item_description = scanner.nextLine().split("=");
            Item item = new Item(item_description[0], Integer.parseInt(item_description[1]));
            this.listOfItems.add(item);
        }
        return listOfItems;
    }

    public ArrayList<Rocket> loadU1() {
        ArrayList<Rocket> rocketList = new ArrayList<>();
        U1 rocket = new U1();
        for (Item item : this.listOfItems) {
            if (!rocket.canCarry(item)) {
                rocketList.add(new U1());
            }
            rocket.carry(item);
        }
        return rocketList;
    }

    public ArrayList<Rocket> loadU2() {

        ArrayList<Rocket> rocketList = new ArrayList<>();
        U2 rocket = new U2();
        for (Item item : this.listOfItems) {
            if (!rocket.canCarry(item)) {
                rocketList.add(new U2());
            }
            rocket.carry(item);
        }
        return rocketList;
    }

    public String runSimulation(ArrayList<Rocket> rockets) {
        long budget = 0;
        int rocketCount = 0;
        for (Rocket rocket : rockets) {
            while (!rocket.land() || !rocket.launch()) {
                rocketCount++;
                budget += rocket.getCost();
            }
            rocketCount++;
            budget += rocket.getCost();
        }
        return String.format("The simulation has the following results Budget: %s and Rockets: %s", budget, rocketCount);
    }
}
