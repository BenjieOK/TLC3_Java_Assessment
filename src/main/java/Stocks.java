import java.util.ArrayList;
import java.util.List;

public class Stocks implements MontrealTradedProducts {

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    List <Product> products = new ArrayList<>();


    @Override
    public void addNewProduct(Product product) throws ProductAlreadyRegisteredException {

    }

    @Override
    public void trade(Product product, int quantity) {

    }

    @Override
    public int totalTradeQuantityForDay() {
        return 0;
    }

    @Override
    public double totalValueOfDaysTradedProducts() {
        return 0;
    }

    @Override
    public String showTradedProducts() {
        return "Stocks Products";
    }
}
