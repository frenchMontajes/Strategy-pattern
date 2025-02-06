package ConcreteStrategies;

import StrategyInterface.AttackStrategy;

public class ShootArrow implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Archer shoots an arrow!");
    }
}
