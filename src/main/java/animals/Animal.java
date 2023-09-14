package animals;

public abstract class Animal {
    protected String name;
    private int age;
    private int maxRun;
    private int maxSwim;
    public static int count;

    public Animal(String name, int age, int maxRun, int maxSwim){
        this.name = name;
        this.age = age;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        count++;
    }

    public String getName(){
        this.name = name;
        return this.name;
    }

    public void run(int dist){
        if (dist<= this.maxRun){
            System.out.println(this.name + " пробежал " + dist + " метров");
        }else {
            System.out.println(this.name + " не справился с дистанцией");
        }
    }
    public void swim(int dist){
        if (dist<= this.maxSwim){
            System.out.println(this.name + " проплыл " + dist + " метров");
        }else {
            System.out.println(this.name + " не справился с дистанцией");
        }
    }

    public static int getCount() {
        return count;
    }
}
