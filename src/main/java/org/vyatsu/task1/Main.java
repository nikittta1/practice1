package org.vyatsu.task1;

import Mammals.Fox;
import Mammals.Jerboa;
import Mammals.Mammals;
import Mammals.Rabbit;
import animals.Animal;
import animals.Cat;
import animals.Dog;
import animals.Tiger;

//psvm
//sout
public class Main {

    public static void main(String[] args) {

        Animal[] animals =
        {
                new Cat("Барсик", 4, 200, 40),
                new Cat("Рыжик", 9,200, 25),
                new Dog("Бобик", 3, 10),
                new Dog("Тузик", 4, 10),
                new Tiger("Той", 8, 1000, 50),
                new Fox("Лис", 5, 800, 30, 15),
                new Rabbit("Кролик", 6, 300, 9, 5),
                new Jerboa("Тушканчик", 8, 40, 5, 5),
        };

        for (Animal a : animals) {
            a.run(300);
            a.swim(10);
        }

        System.out.println();

        System.out.println("Количество котов: " + Cat.getCount());
        System.out.println("Количество собак: " + Dog.getCount());
        System.out.println("Количество тигров: " + Tiger.getCount());
        System.out.println("Количество лис: " + Fox.getCount());
        System.out.println("Количество кроликов: " + Rabbit.getCount());
        System.out.println("Количество тушканчиков: " + Jerboa.getCount());
        System.out.println();
        System.out.println("Количество млекопитающих: " + Mammals.getCount());
        System.out.println("Всего животных: " + Animal.getCount());

        System.out.println();
        ((Mammals) animals[5]).pregnancy();
        ((Mammals) animals[6]).pregnancy();
        ((Mammals) animals[7]).pregnancy();

    }


}