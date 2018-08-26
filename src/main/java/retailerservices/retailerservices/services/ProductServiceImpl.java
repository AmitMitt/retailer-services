package retailerservices.retailerservices.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retailerservices.retailerservices.entity.Product;
import retailerservices.retailerservices.models.ProductRequest;
import retailerservices.retailerservices.models.ProductResponse;
import retailerservices.retailerservices.repository.ProductRepository;

import javax.persistence.Id;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product add(ProductRequest productRequest) {
        Product product = new Product();
        product.setProductName(productRequest.getProductName());
        product.setPrice(productRequest.getPrice());
        product.setRetailerId(productRequest.getRetailerId());

        productRepository.saveAndFlush(product);
        return product;
    }

    @Override
    public ProductResponse update(ProductRequest productRequest) throws Exception {
        Product product = productRepository.findone(productRequest.getId());
        if(product==null){
            throw new Exception("Retailer is not found.");
        }
        product.setProductName(productRequest.getProductName());
        product.setPrice(productRequest.getPrice());
        product.setRetailerId(productRequest.getRetailerId());

        productRepository.saveAndFlush(product);
        return null;
    }

    @Override
    public ProductResponse remove(long Id) throws Exception {
        Product product = productRepository.findone(Id);
        if(product==null){
            throw new Exception("Retailer is not found.");
        }
        productRepository.delete(product);
        return null;
    }

    @Override
    public Product getInfo(long Id) {
        Product product = productRepository.findone(Id);
        return product ;
    }
}
