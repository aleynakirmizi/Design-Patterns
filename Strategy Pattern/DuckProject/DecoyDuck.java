package DuckProject;

public class DecoyDuck extends Duck{
    public DecoyDuck(){
        super.q = new MuteQuack();
        super.f = new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println("I am Decoy Duck");
    }
}
