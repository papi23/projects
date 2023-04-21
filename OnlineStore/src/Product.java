import java.util.Objects;
public class Product {

    public String name;
    public float price;

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public Product(String name, int price) {

        this.name = name;
        this.price = price;

    }
    @Override
    public boolean equals(Object obj)
    {
        if(this == obj) return true;
        if(this == null || getClass()!=obj.getClass())
            return false;
        Product product = (Product) obj;
        return Objects.equals(name, product.name) && Objects.equals(price, product.price);

    }
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + Float.floatToIntBits(price);
        return result;
    }

    public String toString() {

        return this.getName() + " " + this.getPrice();
    }
}
