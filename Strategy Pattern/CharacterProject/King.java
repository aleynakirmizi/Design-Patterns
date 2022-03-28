package CharacterProject;

public class King extends Character{
    public King(){
        super.weaponBehavior = new SwordBehavior();
    }

    public static void main(String[] args) {
        Character king = new King();
        king.fight();
    }
}
