import java.util.*;
public class OnlineStore {

    public List<Product> products = new ArrayList<>();

    public float totalPrice = 0;

    public List getProducts() {

        System.out.println("These are the available products at the moment");
        Product product1 = new Product("bread", 10);
        Product product2 = new Product("water", 3);
        Product product3 = new Product("butter", 15);
        products.add(product1);
        products.add(product2);
        products.add(product3);

        for(Product p : products) {

            System.out.println(p.toString());
        }
        return products;
    }

    public void addToCart(String product, float quantity) {

        float pricePerProduct;
        for(Product p : products) {

            if(product.equals(p.getName())) {

                pricePerProduct = p.getPrice() * quantity;
                totalPrice = totalPrice + pricePerProduct;
                System.out.println("the price for " + p.getName() + "/s " + "will be: " + pricePerProduct);

            }
        }

    }

    public void checkout() {

        System.out.println("Total price will be: " + totalPrice);
    }
}
