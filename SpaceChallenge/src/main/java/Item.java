package main.java;

public class Item {
    private String name;
    private int weight;

    protected Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
