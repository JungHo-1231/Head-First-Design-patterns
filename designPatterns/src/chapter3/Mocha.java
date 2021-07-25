package chapter3;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        float sizeCost = getSizeCost();
        return .20 + beverage.cost() + sizeCost;
    }

    private float getSizeCost() {
        if (beverage.getSize() != null) {
            return beverage.getSize().getPrice();
        } else {
            return 0;
        }
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , 모카";
    }

    public Size getSize(){
        return beverage.getSize();
    }

}
