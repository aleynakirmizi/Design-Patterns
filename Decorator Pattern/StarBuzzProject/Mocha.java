package StarBuzzProject;

public class Mocha extends CondimentDecorator {
    Baverage baverage;
    public Mocha(Baverage baverage){
        this.baverage = baverage;
    }


    @Override
    public double cost() {
        return baverage.cost()+.20;
    }

    @Override
    public String getDescription() {
        return baverage.getDescription()+" with Mocha!";
    }
}
