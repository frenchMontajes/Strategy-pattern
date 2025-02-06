import StrategyInterface.AttackStrategy;
import StrategyInterface.DefenseStrategy;
import java.util.List;

public class Characters {
    private String type;
    private final AttackStrategy attackStrategy;
    private final List<DefenseStrategy> defenseStrategy;

    public Characters(String type, AttackStrategy attackStrategy, List<DefenseStrategy> defenseStrategy) {
        this.type = type;
        this.attackStrategy = attackStrategy;
        this.defenseStrategy = defenseStrategy;
    }

    public void attack() {
        attackStrategy.attack();
    }

    public void defense() {
        for (DefenseStrategy strategy : defenseStrategy) {
            strategy.defense();
        }
    }

}
