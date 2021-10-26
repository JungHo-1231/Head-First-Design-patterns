package chapter3.first_reading;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .15 + beverage.cost() ;
    }

    @Override
    public String getDescription() {
        return  beverage.getDescription() + ", 두유";
    }

    public Size getSize(){
        return beverage.getSize();
    }
}
