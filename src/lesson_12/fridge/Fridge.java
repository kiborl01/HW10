package lesson_12.fridge;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TransferQueue;

public class Fridge {


    HashMap<String, Integer> products = new HashMap<>();
    HashMap<String, Integer> orders = new HashMap<>();
    Scanner scanner = new Scanner(System.in);


    public void addProducts(String name, Integer count) {
        if (products.containsKey(name)) {
            products.put(name, products.get(name) + count);
        } else {
            products.put(name, count);
        }

    }

    public void take(String name, Integer count) {
        if (!products.containsKey(name)) {
            System.out.println(name + " - нет в холодильнике!");
        } else {
            if (products.get(name) < count) {
                products.put(name, takeFromFridge(name, count));
            } else if ((products.get(name) > count)) {
                System.out.println(name + " взял " + count + " шт. осталось в холодильнике " +
                        products.get(name) + " штук.");
            } else {
                products.remove(name);
                System.out.println(products.get(name) + " закончилось(ся,ись)");
            }
        }
    }

    public void addOrders(String name, int count) throws InterruptedException {
        if (products.containsKey(name)) {
            System.out.println(name + " уже есть " + products.get(name) + " штук." +
                    "\n хотите добавить еще? " + " Сколько нужно " + products.get(name) + " положить в холодильник."
                    + " Если не хотите, введите 0.");
            int takeCount = scanner.nextInt();
            if (takeCount > 0) {
                orders.put(name, takeCount);
            }
        } else {
            orders.put(name, count);
        }
        System.out.println("Нужно подумать, дайте 10 секунд.");
        Thread.sleep(10000);
        transferOrdersInFridges(orders);
        System.out.println("Продукты положены в холодильник.");
    }

    private void transferOrdersInFridges(Map<String, Integer> map) {
        products.putAll(map);
    }

    public void printFridge() {
        if (products.isEmpty()) {
            System.out.println("Холодильник пустой.");
        } else {
            for (Map.Entry<String, Integer> product : products.entrySet()) {
                System.out.println(product + " шт.");
            }
        }

    }

    private Integer takeFromFridge(String name, Integer takeCount) {

        System.out.println(name + " " + takeCount + " в холодильнике столько нет " + products.get(name) +
                " \n Сколько хотите взять?");
        takeCount = scanner.nextInt();
        if (takeCount <= products.get(name)) {
            return products.get(name) - takeCount;
        }

        return takeFromFridge(name, takeCount);
    }
}










