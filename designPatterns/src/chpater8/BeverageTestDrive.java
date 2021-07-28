package chpater8;

public class BeverageTestDrive {
    public static void main(String[] args) {
        TeakWithHook teaHook = new TeakWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\n 차 준비중 ...");
        teaHook.prepareRecipe();

        System.out.println("\n 커피 준비중 ...");
        coffeeHook.prepareRecipe();
    }
}
