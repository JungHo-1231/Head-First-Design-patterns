package chpater8;

public abstract class CaffeineBeverageWithHook {
    void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (customerWantsConditions()) {
            addCondiments();
        }
    }

    abstract void addCondiments();

    abstract void brew();

    boolean customerWantsConditions() {
        return true;
    }

    void boilWater() {
        System.out.println("물 끓이는 중");
    }

    void pourInCup(){
        System.out.println("컵에 따르는 중");
    }

}
