package com.geekbrains.lesson1.animals;

public abstract class Animal {

    String name;
    static int count = 0;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public abstract void run(int rangeRun);

    public abstract void swim(int rangeSweem);
}
