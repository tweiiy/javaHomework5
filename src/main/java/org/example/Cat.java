package org.example;

public class Cat extends Animal {
    private static int catCount;
    public static final int runLimit = 200;
    public static final int swimLimit = 0;
    public Cat(String name) {
        super(name);
        catCount++;
    }
    @Override
    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(this.getName() + " пробежал(а) " + distance + " м.");
        } else {
            System.out.println(this.getName() + " не может пробежать больше " + runLimit + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(this.getName() + " не умеет плавать.");
    }
    public static int getCatCount() {
        return catCount;
    }
}
