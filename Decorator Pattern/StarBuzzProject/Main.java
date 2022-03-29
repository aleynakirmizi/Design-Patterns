package StarBuzzProject;

public class Main {
    public static void main(String[] args) {
        Baverage mocha = new Mocha(new Decaf());
        System.out.println(mocha.getDescription());
        System.out.println(mocha.cost());

        Baverage espresso = new Espresso();
        espresso = new Mocha(espresso);
        espresso=new Mocha(espresso);
        espresso=new Whip(espresso);
        System.out.println(espresso.getDescription());
        System.out.println(espresso.cost());
        Baverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Milk(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription());



    }
}
