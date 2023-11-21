package lesson_12.fridge;

import java.util.HashMap;

public class Fridge {

    HashMap<String , Integer> products = new HashMap<>();


    public  void addProducts(String name, Integer count){
        if (products.containsKey(name)){
            products.put(name, products.get(name) + count);
        } else {
            products.put(name,count);
        }

    }

    public void take(String name, Integer count){
        if (!products.containsKey(name)){
            System.out.println(name + " - нет в холодильнике!");
        }
        if (count>products.get(name)){
            System.out.println("Вы хотите забрать " + count + ". У нас есть только" + products.get(name));
        }



    }

}
