package Main;
import Charecter.King;
import Charecter.Troll;
import Weapon.AxeBehavior;
import Weapon.BowAndArrowBehavior;
import Weapon.KnifeBehavior;
import Weapon.SwordBehavior;

public class Main {
    public static void main(String[] args) {
        Troll troll = new Troll();
        King king = new King();

        KnifeBehavior knifeBehavior = new KnifeBehavior();
        AxeBehavior axeBehavior = new AxeBehavior();
        SwordBehavior swordBehavior = new SwordBehavior();
        BowAndArrowBehavior bowAndArrowBehavior = new BowAndArrowBehavior();

        troll.setWeapon(knifeBehavior);
        troll.fight();

        troll.setWeapon(axeBehavior);
        troll.fight();

        troll.setWeapon(swordBehavior);
        troll.fight();

        troll.setWeapon(bowAndArrowBehavior);
        troll.fight();

        king.setWeapon(swordBehavior);
        king.fight();

        king.setWeapon(bowAndArrowBehavior);
        king.fight();
    }
}
