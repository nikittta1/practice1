package animals;

public class Tiger extends Animal{
    public static int count;
    public Tiger(String name, int age, int maxRun, int maxSwim) {
        super(name, age, maxRun, maxSwim);
        count++;
    }
//    public void run(int dist){
//        System.out.println(this.name + " пробежал " + dist + " метров");
//    }
//    public void swim(int dist){
//        System.out.println(this.name + " проплыл " + dist + " метров");
//    }
    public static int getCount() {
        return count;
    }
}
