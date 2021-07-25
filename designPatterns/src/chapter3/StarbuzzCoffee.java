package chapter3;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast(); // .99
        beverage2.setSize(Size.Venti);
        beverage2 = new Mocha(beverage2); // .20
        beverage2 = new Mocha(beverage2); // .20
        beverage2 = new Soy(beverage2); // .15

        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
