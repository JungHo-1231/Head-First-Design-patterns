package chapter3;

public enum Size {

    Tall(10),  Grande(15), Venti(20);
    private float price;
    Size(float i) {
        price = i;
    }

    public float getPrice() {
        return price;
    }
}
