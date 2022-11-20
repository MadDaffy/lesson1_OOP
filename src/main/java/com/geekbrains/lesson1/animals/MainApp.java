package com.geekbrains.lesson1.animals;

public class MainApp {
    public static void main(String[] args) {

        Animal[] animals = {
                new Dog("Бобик"),
                new Dog("Барбос"),
                new Dog("Тузя"),
                new Dog("Кутузя"),
                new Tiger("Тигр Амурский"),
                new Tiger("Тигр Тунгусский"),
                new Cat("Барсик"),
        };

        for (Animal animal : animals) {
            animal.run(150);
            animal.swim(10);
        }

        System.out.println("Всего животных: " + Animal.count);
        System.out.println("Всего собак: " + Dog.dogCount);
        System.out.println("Всего тигров: " + Tiger.tigerCount);
        System.out.println("Всего котов: " + Cat.catCount);

    }


}
