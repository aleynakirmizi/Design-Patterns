package DuckProject;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("MUTE!");
    }
}
