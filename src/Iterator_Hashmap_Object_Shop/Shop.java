package Iterator_Hashmap_Object_Shop;


import java.util.*;

public class Shop {
    private HashMap<String, Product> products = new HashMap<>();

    public void add(Product p) {
        products.put(p.getTitle(), p);
    }

    public Product get(String title) {
        Product temp = products.get(title);
        if (temp == null) {
            System.out.println("Product not available");
        }
        return temp;
    }

    public HashMap<String, Product> getProducts() {
        return products;
    }

    public boolean isThereFreeProduct() {

//-------------------this is an alternative solution-----------------
//        for (Product p : products.values()){
//            if(p.getDiscount() == 100){
//                return true;
//            }
//        }
//-------------------this is an alternative solution-----------------
//        for (String key : products.keySet()){
//            Product p = products.get(key);
//            if (p.getDiscount() == 100) {
//                return true;
//            }
//        }
// -------------------this is an alternative solution-----------------

        for (Map.Entry<String, Product> e : products.entrySet()) {
            Product p = e.getValue();
            if (p.getDiscount() == 100) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Product> getByPriceFrom(double from) {
        ArrayList<Product> temp = new ArrayList<>();
        for (Map.Entry<String, Product> entry : products.entrySet()) {
            Product p = entry.getValue();
            if (p.getPrice() < from ) {
                temp.add(entry.getValue());
            }
        }
        return temp;
    }


    public ArrayList<Product> getByPriceTo (double from) {
        ArrayList<Product> temp = new ArrayList<>();
        for (Map.Entry<String, Product> entry : products.entrySet()) {
            Product p = entry.getValue();
            if (p.getPrice() > from ) {
                temp.add(entry.getValue());
            }
        }
        return temp;
    }
    
    
    public void print(ArrayList<Product> temp) {
        for (Product p : temp) {
            System.out.println(p);
        }
        System.out.println();
    }

    public void  removeProductsFromByIterator(double from) {
        Iterator<Product> temp = products.values().iterator();
        while (temp.hasNext()) {
            Product p = temp.next();
            if (p.getPrice() > from) {
                temp.remove();
            }
        }
    }

    public void removeProductsFromByIterator2(double from){
        Iterator<Map.Entry<String, Product>> temp = products.entrySet().iterator();
        while (temp.hasNext()) {
            Map.Entry<String, Product> e = temp.next();
            Product p = e.getValue();
            if (p.getPrice() > from) {
                temp.remove();
            }
        }
    }

    public void removeProductsFromByKeySet(double from) {

        Set<String> keys = new HashSet<>();
        for (Product p : products.values()) {
            if (p.getPrice() > from) {
                keys.add(p.getTitle());
            }
        }
        products.keySet().removeAll(keys);
    }


}




//Public void removeProductsFromByIterator(double from) entfernt Produkte teurer als from. Soll mithilfe des Iterators gelöst werden
//Public void removeProductsFromByKeySet(double from) entfernt Produkte teurer als from. Soll unter Verwendung des KeySets gelöst werden

//    Iterator<Event> it = events.iterator();
//        while(it.hasNext()){
//        System.out.println(it.next());
//    }
//        System.out.println();