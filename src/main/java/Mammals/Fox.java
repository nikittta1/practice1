package Mammals;

public class Fox extends Mammals{
    public static int count;
    public int duration;
    public Fox(String name, int age, int maxRun, int maxSwim, int duration){
        super(name, age, maxRun, maxSwim, duration);
        count++;
        this.duration = duration;
    }

    public static int getCount() {
        return count;
    }

//    public static int getDuration(int duration){
//        return pregnancy(this.duration);
//    }
}
