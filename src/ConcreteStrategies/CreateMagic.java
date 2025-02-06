package ConcreteStrategies;

import StrategyInterface.DefenseStrategy;

public class CreateMagic implements DefenseStrategy {
    @Override
    public void defense() {
        System.out.println("Creating a magic barrier for defense!");
    }
}
