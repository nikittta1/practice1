package Mammals;

public class Jerboa extends Mammals{
    public static int count;
    public Jerboa(String name, int age, int maxRun, int maxSwim, int duration){
        super(name, age, maxRun, maxSwim, duration);
        count++;
    }

    public static int getCount() {
        return count;
    }

//    public static void getDuration(){
//        pregnancy(duration);
//    }
}
