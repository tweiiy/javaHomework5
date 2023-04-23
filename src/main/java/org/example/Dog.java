package org.example;

public class Dog extends Animal {
    private static int dogCount;
    public static final int runLimit = 500;
    public static final int swimLimit = 10;
    public Dog(String name) {
        super(name);
        dogCount++;
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
        if (distance <= swimLimit) {
            System.out.println(this.getName() + " проплыл(а) " + distance + " м.");
        } else {
            System.out.println(this.getName() + " не может проплыть больше " + swimLimit + " м.");
        }
    }
    public static int getDogCount() {
        return dogCount;
    }
}
