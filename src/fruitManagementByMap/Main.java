package fruitManagementByMap;

public class Main {
    public static void main(String[] args) {
        FruitManager fm = new FruitManager();
        fm.add(1, new Fruit("táo", 15000, "red"));
        fm.display();
        fm.edit(2);
        fm.display();
    }
}
