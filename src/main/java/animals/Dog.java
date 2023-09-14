package animals;

public class Dog extends Animal{

    public static int count;
    public Dog(String name, int age,  int maxSwim) {
        super(name, age, 500, maxSwim);
        count++;
    }
//    public void run(int dist){
//        if(dist<= maxRunDist)
//            System.out.println(this.name + " пробежал " + dist + " метров");
//        else
//            System.out.println(this.name + " не справился с дистанцией");
//    }
//    public void swim(int dist){
//        if (dist<= this.maxSwimDist){
//            System.out.println(this.name + " проплыл " + dist + " метров");
//        }else {
//            System.out.println(this.name + " не справился с дистанцией");
//        }
//    }
    public static int getCount() {
        return count;
    }

}
