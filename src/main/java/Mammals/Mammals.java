package Mammals;

import animals.Animal;

public abstract class Mammals extends Animal {
//    protected int duration;
    private final int duration;
    public static int count;

    public Mammals(String name, int age, int maxRun, int maxSwim, int duration) {
        super(name, age, maxRun, maxSwim);
        count++;
        this.duration = duration;

//        this.duration = duration;
    }
    public void pregnancy() {
        System.out.println(this.name + " вынашивает детеныша " + this.duration + " месяцев");
    }
    public static int getCount() {
        return count;
    }

}
