package animals;

import java.util.TreeMap;

public class Cat extends Animal {
    private int maxRunDist = 200;
    public static int count;
    public Cat(String name, int age, int maxRun, int maxSwim) {
        super(name, age, maxRun, maxSwim);
        count++;
    }
//    public void run(int dist){
//        if(dist<= maxRunDist)
//            System.out.println(this.name + " пробежал " + dist + " метров");
//        else
//            System.out.println(this.name + " не справился с дистанцией");
//    }
    public void swim(int dist){
        System.out.println(this.name + " не умеет плавать");
    }

    public static int getCount() {
        return count;
    }
}
