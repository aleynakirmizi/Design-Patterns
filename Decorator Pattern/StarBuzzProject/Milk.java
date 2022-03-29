package StarBuzzProject;

public class Milk extends CondimentDecorator{
    Baverage baverage;
    public Milk(Baverage baverage){
        this.baverage = baverage;
    }

    @Override
    public double cost() {
        return baverage.cost()+.10;
    }

    @Override
    public String getDescription() {
        return baverage.getDescription()+" with Milk";
    }
}
