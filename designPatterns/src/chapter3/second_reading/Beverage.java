package chapter3.second_reading;

import lombok.Getter;

public abstract class Beverage {
    @Getter
    String description = "Unknown Beverage";

    public abstract double cost();

}
