

import java.util.Scanner;
import java.util.ArrayList;


public class ShoppingList {
    ArrayList<String> productList = new ArrayList<String>();
    ArrayList<Double> priceList = new ArrayList<Double>();
    private String name;
    private String store;

    Scanner scan = new Scanner(System.in);

    public ShoppingList(String name, String store) {
        this.name = name;
        this.store = store;
    }

    public ShoppingList(String name, int defaultStore) {
        this.name = name;
        store = setStore();
    }


    public String getName() {
        return name;
    }

    public String getStore() {
        return store;
    }

    public void addItem(){
        System.out.print("Enter the item name: ");
        String itemName = scan.nextLine();
        System.out.print("Enter the price of the item: ");
        double itemCost = scan.nextDouble();
        scan.nextLine();

        Item item = new Item(itemName, itemCost);
        productList.add(item.getName());
        priceList.add(item.getPrice());
    }

    public void deleteItem(){
        getProductList();
        System.out.println("Which item do you want to delete? ");
        String item= scan.nextLine();
        if(productList.contains(item)){
            int idx = productList.indexOf(item);
            productList.remove(idx);
            priceList.remove(idx);
            System.out.println("Item removed.");
        } else {
            System.out.println("Your list does not contain this item.");
        }
    }

    public double total() {
        double total = 0;
        for (int i = 0; i < priceList.size(); i++) {
            total += priceList.get(i);
        }
        return total;
    }

    public double total(double tax) {
        double total = 0;
        for (int i = 0; i < priceList.size(); i++) {
            total += priceList.get(i);
        }
        return total + (total * tax);
    }

    public boolean checkDuplicate() {
        for (int i = 0; i < productList.size(); i ++) {
            for (int j = i + 1; j < productList.size(); j ++) {
                if (productList.get(i).equals(productList.get(j))) {
                    return true;
                }
            }
        }
        return false;
    }

    public String getProductList() {
        return productList.toString();
    }

    public String getPriceList() {
        return priceList.toString();
    }

    private String setStore(){
        int num = (int)(Math.random() * 4) + 1;
        if (num == 1) {
            store = "Trader Joe's";
        } else if (num == 2) {
            store = "Walgreens";
        } else if (num == 3) {
            store = "Costco";
        } else {
            store = "Whole Foods";
        }
        return store;
    }

}

