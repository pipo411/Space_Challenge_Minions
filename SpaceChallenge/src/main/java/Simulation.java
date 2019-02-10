package main.java;

import main.java.rocket.Rocket;

import java.util.ArrayList;

public class Simulation {
    public ArrayList<Item> loadItems() {
        //implement logic
        ArrayList<Item> itemList = new ArrayList<Item>();
        Item item = new Item("test",30);
        itemList.add(item);
        return itemList;
    }
    public ArrayList<Item> loadU1() {
        ArrayList<Item> itemList = loadItems();
        //implement logic
        return itemList;
    }
    public ArrayList<Item> loadU2() {
        ArrayList<Item> itemList = loadItems();
        //implement logic
        return itemList;
    }
    public int runSimulation() {
        ArrayList<Rocket> rocketList = new ArrayList<>();
        return 1;
    }

}
