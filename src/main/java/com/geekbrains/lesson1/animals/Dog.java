package com.geekbrains.lesson1.animals;

public class Dog extends Animal {

    final int maxDistanceRun = 500;
    final int maxDistanceSweem = 10;
    static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
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
        if (rangeSweem > maxDistanceSweem) {
            System.out.println(this.name + " не смог проплыть дистанцию");
        } else {
            System.out.println(this.name + " проплыл " + rangeSweem + "м.");
        }
    }
}
