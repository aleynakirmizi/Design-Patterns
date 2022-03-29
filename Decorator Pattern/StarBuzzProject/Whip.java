package StarBuzzProject;

public class Whip extends CondimentDecorator{
    Baverage baverage;
    public Whip(Baverage baverage){
        this.baverage = baverage;
    }

    @Override
    public double cost() {
        return baverage.cost()+.10;
    }

    @Override
    public String getDescription() {
        return baverage.getDescription()+" with Whip!";
    }
}
