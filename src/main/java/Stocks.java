public class Stocks implements MontrealTradedProducts {

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
