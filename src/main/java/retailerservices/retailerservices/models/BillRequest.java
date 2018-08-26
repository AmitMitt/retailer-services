package retailerservices.retailerservices.models;

import java.util.List;

public class BillRequest {
    private List<Product> Product;

    public List<BillRequest.Product> getProduct() {
        return Product;
    }

    public void setProduct(List<BillRequest.Product> product) {
        Product = product;
    }

    public static class Product{
        private String ProductId;
        private long ProductQuantity;
        private long ProductRate;

        public String getProductName() {
            return ProductId;
        }

        public void setProductName(String productId) {
            ProductId = productId;
        }

        public long getProductQuantity() {
            return ProductQuantity;
        }

        public void setProductQuantity(long productQuantity) {
            ProductQuantity = productQuantity;
        }

        public long getProductRate() {
            return ProductRate;
        }

        public void setProductRate(long productRate) {
            ProductRate = productRate;
        }
    }
}
