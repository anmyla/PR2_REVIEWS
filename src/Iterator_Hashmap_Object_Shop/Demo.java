package Iterator_Hashmap_Object_Shop;

public class Demo {
    public static void main(String[] args) {
        Product product0 = new Product("Product0", 35, "Product0 from Shop A");
        Product product1 = new Product("Product1", 100, "Product1 from Shop A");
        Product product2 = new Product("Product1", 100, "Product1 from Shop B");
        Product product3 = new Product("Product2", 50, "Product2 from Shop A");
        Product product4 = new Product("Product2", 90, "Product2 from Shop B");


        Shop shopA = new Shop();
        shopA.add(product0);
        shopA.add(product1);
        shopA.add(product3);

        Shop shopB = new Shop();
        shopB.add(product2);
        shopB.add(product4);


        product1.setDiscount(10);
        System.out.println("Discounted price of " +product1.getTitle() + " : " + product1.getPriceWithDiscount());
        product3.setDiscount(10);
        System.out.println("Discounted price of " +product3.getTitle() + " : " + product3.getPriceWithDiscount());

        System.out.println("Comparing the same products with the same price from different shops: " + product1.equals(product2));


        product2.setDiscount(10);
        System.out.println("Discounted price of " +product2.getTitle() + " : " + product2.getPriceWithDiscount());
        product4.setDiscount(100);
        System.out.println("Discounted price of " +product3.getTitle() + " : " + product4.getPriceWithDiscount());

        System.out.println();
        System.out.println("Is this product available in shop:");
        shopA.get("Product4");

        System.out.println();
        System.out.println("Is there a free product from Shop B: " +shopB.isThereFreeProduct());

        System.out.println();
        System.out.println("List Products cheaper than  100");
        shopA.print(shopA.getByPriceFrom(100));


        System.out.println();
        System.out.println("List Products more expensive than 50");
        shopA.print(shopA.getByPriceTo(50));


        System.out.println();
        System.out.println("Remove Products more expensive than 75: ");
        shopA.removeProductsFromByIterator(75);
        System.out.println(shopA.getProducts());

        System.out.println();
        System.out.println("Remove Products more expensive than 40: ");
        shopA.removeProductsFromByIterator2(40);
        System.out.println(shopA.getProducts());


        System.out.println();
        System.out.println("Remove Products From By KeySet: ");
        shopA.removeProductsFromByKeySet(10);
        System.out.println(shopA.getProducts());

    }
}
