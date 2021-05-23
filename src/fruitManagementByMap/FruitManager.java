package fruitManagementByMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FruitManager {
    Map<Integer, Fruit> fruitMap;

    public FruitManager() {
        fruitMap = new HashMap<>();
        fruitMap.put(1, new Fruit("lê", 45000, "yellow"));
        fruitMap.put(2, new Fruit("xoài", 30000, "yellow"));
        fruitMap.put(3, new Fruit("mận", 20000, "red"));
        fruitMap.put(4, new Fruit("orange", 25000, "orange"));
    }
    public Fruit input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên quả");
        String name = scanner.next();
        System.out.println("Nhập giá");
        int price = scanner.nextInt();
        System.out.println("Nhập màu");
        String color = scanner.next();
        return new Fruit(name, price, color);
    }
    public void display(){
        Set<Integer> keys = fruitMap.keySet();
        for (Integer key: keys){
            System.out.println(fruitMap.get(key));
        }
    }
    public void add(Integer key, Fruit fruit) {
        fruitMap.put(key, fruit);
    }
    public boolean checkKey(Integer key){
        if (fruitMap.containsKey(key))
            return true;
        return false;
    }
    public void edit(Integer key){
        if (checkKey(key)){
            fruitMap.put(key, input());
        }else
            System.out.println("Không có thông tin loại quả muốn sửa");
    }
    public void delete(Integer key){
        if (checkKey(key)){
            fruitMap.remove(key);
        }else
            System.out.println("Không có thông tin loại quả cần xóa");
    }
}
