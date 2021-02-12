public class Product implements ProductPricingService {

    private String id;
    private double value;
    private String ticker;
    private String exchange;
    private  String contractCode;
    private int month;
    private int contractYear;


    public Product (String exchange, String contractCode, int month, int contractYear) {
        this.exchange = exchange;
        this.contractCode = contractCode;
        this.month = month;
        this.contractYear = contractYear;
    }

    public String getContractCode() {
        return contractCode;
    }

    public int getMonth() {
        return month;
    }

    public int getContractYear() {
        return contractYear;
    }

    public Product(String ticker, String exchange) {
        this.ticker = ticker;
        this.exchange = exchange;
    }

    public String getExchange(){
        return exchange;
    }

    public String getTicker() {
        return ticker;
    }

    public Product(String productID, double productValue) {
        this.id = productID;
        this.value = productValue;
    }

    public String getId() {
        return id;
    }

    public double getValue() {
        return value;
    }

    public void setValue(MontrealTradedProducts tradedProducts){
        if (tradedProducts.showTradedProducts().equals("Futures Products")){
            this.value=this.price(this.getExchange(),this.getContractCode(),this.getMonth(),this.getContractYear());
        }
    }

    @Override
    public double price(String exchange, String ticker) {
        return 0;
    }

    @Override
    public double price(String exchange, String contractCode, int month, int year) {
        return 0;
    }
}
