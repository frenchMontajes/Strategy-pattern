package ConcreteStrategies;

import StrategyInterface.DefenseStrategy;

public class Shield implements DefenseStrategy {
    @Override
    public void defense() {
        System.out.println("Using a shield to defend!");
    }
}
