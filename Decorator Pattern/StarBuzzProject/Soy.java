package StarBuzzProject;

public class Soy extends CondimentDecorator{
    Baverage baverage;
    public Soy(Baverage baverage){
        this.baverage=baverage;
    }

    @Override
    public double cost() {
        return baverage.cost()+.15;
    }

    @Override
    public String getDescription() {
        return baverage.getDescription()+" with Soy!";
    }
}
