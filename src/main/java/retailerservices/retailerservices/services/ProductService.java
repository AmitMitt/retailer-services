package retailerservices.retailerservices.services;

import retailerservices.retailerservices.entity.Product;
import retailerservices.retailerservices.models.*;

public interface ProductService {

    public Product add(ProductRequest productRequest);
    public ProductResponse update(ProductRequest productRequest) throws Exception;
    public ProductResponse remove(long Id) throws Exception;
    public Product getInfo(long Id);

}
