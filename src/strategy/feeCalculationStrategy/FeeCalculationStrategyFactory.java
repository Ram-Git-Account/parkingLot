package strategy.feeCalculationStrategy;

public class FeeCalculationStrategyFactory {
    public static LowFeeCalculationStrategy getFeeCalculationStrategy(){
        return new LowFeeCalculationStrategy();
    }
}
