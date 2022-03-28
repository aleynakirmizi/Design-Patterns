package DuckProject;

public abstract class Duck {
    FlyBehavior f;
    QuackBehavior q;
    public void swim(){
        System.out.println("All ducks float.");
    }
    public abstract void display();
    public void performFly(){
        f.fly();
    }
    public void performQuack(){
        q.quack();
    }

    public void setFlying(FlyBehavior f) {
        this.f = f;
    }

    public void setQuacking(QuackBehavior q) {
        this.q = q;
    }

}
