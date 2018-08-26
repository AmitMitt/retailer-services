package retailerservices.retailerservices.models;

public class ProductRequest {

    private long Id;
    private String ProductName;
    private long Price;
    private long RetailerId;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public long getPrice() {
        return Price;
    }

    public void setPrice(long price) {
        Price = price;
    }

    public long getRetailerId() {
        return RetailerId;
    }

    public void setRetailerId(long retailerId) {
        RetailerId = retailerId;
    }
}
