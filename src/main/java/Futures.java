import java.util.ArrayList;
import java.util.List;

public class Futures implements MontrealTradedProducts {

    List<Product> productList = new ArrayList<>();

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

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
        return "Futures Products";
    }
}
