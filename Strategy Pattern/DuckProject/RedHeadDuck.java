package DuckProject;

public class RedHeadDuck extends Duck{
    public RedHeadDuck(){
        f = new FlyWithWings();
        q = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I am Red Head Duck!");
    }

    public static void main(String[] args) {
        Duck duck = new RedHeadDuck();
        duck.performFly();
    }
}
