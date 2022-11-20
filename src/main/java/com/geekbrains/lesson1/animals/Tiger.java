package com.geekbrains.lesson1.animals;

public class Tiger extends Animal {
    final int maxDistanceRun = 400;
    static int tigerCount = 0;

    public Tiger(String name) {
        super(name);
        tigerCount++;
    }

    @Override
    public void run(int rangeRun) {
        if (rangeRun > maxDistanceRun) {
            System.out.println(this.name + " не смог пробежать дистанцию");
        }
        else {
            System.out.println(this.name + " пробежал " + rangeRun + "м.");
        }

    }

    @Override
    public void swim(int rangeSweem) {
        System.out.println("Не умеет плавать");
    }
}
