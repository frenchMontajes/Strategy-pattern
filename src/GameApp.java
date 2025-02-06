import ConcreteStrategies.*;
import java.util.Arrays;



public class GameApp {
    public static void main(String[] args) {
        Characters knight = new Characters("Knight", new SwingSword(),
                Arrays.asList(new Shield()));

        Characters wizard = new Characters("Wizard", new CastSpell(),  Arrays.asList(new CreateMagic()));

        Characters archer = new Characters("Archer", new ShootArrow(),  Arrays.asList(new Dodge()));


        System.out.println("Knight: ");
        knight.attack();
        knight.defense();

        System.out.println("\nWizard: ");
        wizard.attack();
        wizard.defense();

        System.out.println("\nArcher: ");
        archer.attack();
        archer.defense();
    }
}