package org.example;

public class Animal {
    private String name;
    private static int animalCount;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public String getName() {
        return name;
    }
    public void run(int distance) {
        System.out.println(this.getName() + " пробежал(а) " + distance + " м.");
    }

    public void swim(int distance) {
        System.out.println(this.getName() + " проплыл(а) " + distance + " м.");
    }
    public static int getAnimalCount() {
        return animalCount;
    }
}

