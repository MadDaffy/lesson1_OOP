package com.geekbrains.lesson1.animals;

public class Cat extends Animal {
    final int maxDistanceRun = 200;
    static int catCount = 0;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void run(int rangeRun) {
        if (rangeRun > maxDistanceRun) {
            System.out.println(this.name + " не смог пробежать дистанцию");
        } else {
            System.out.println(this.name + " пробежал " + rangeRun + "м.");
        }

    }

    @Override
    public void swim(int rangeSweem) {
        System.out.println("Не умеет плавать");
    }

}
