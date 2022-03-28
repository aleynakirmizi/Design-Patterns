package DuckProject;

public class RubberDuck extends Duck{
    public RubberDuck(){
        q = new Squeak();
        f = new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println("I am Rubber Duck");
    }

    public static void main(String[] args) {
        Duck duck = new RubberDuck();
        duck.performFly();
        duck.performQuack();
        duck.display();
    }
}
