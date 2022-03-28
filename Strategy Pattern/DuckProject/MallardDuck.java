package DuckProject;

public class MallardDuck extends Duck{
    public MallardDuck(){
        super.f = new FlyWithWings();
        super.q=new Quack();
    }
    @Override
    public void display() {
        System.out.println("I am Mallard Duck");
    }

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();

    }
}
