package StarBuzzProject;

public class Espresso extends Baverage{
    public Espresso(){
        description = "Espresso Coffee";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
