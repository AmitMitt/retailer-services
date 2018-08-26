package retailerservices.retailerservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import retailerservices.retailerservices.entity.Product;
import retailerservices.retailerservices.models.ProductRequest;
import retailerservices.retailerservices.models.ProductResponse;
import retailerservices.retailerservices.repository.ProductRepository;
import retailerservices.retailerservices.services.ProductService;

@RestController
@RequestMapping("Product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/add")
    public ResponseEntity<ProductResponse> add(@RequestBody ProductRequest productRequest){

        Product product = productService.add(productRequest);
        ProductResponse productResponse = new ProductResponse();
        productResponse.setId(product.getId());
        productResponse.setMessage("Product Successfully Added.");
        return ResponseEntity.ok(productResponse);
    }

    @GetMapping("/get/{Id}")
    public ResponseEntity<ProductResponse> get(@PathVariable (value = "Id") long Id) throws Exception {

        Product product = productService.getInfo(Id);
        ProductResponse productResponse = new ProductResponse();
        productResponse.setProductName(product.getProductName());
        productResponse.setPrice(product.getPrice());
        return ResponseEntity.ok(productResponse);
    }

    @PostMapping("/remove")
    public ResponseEntity<ProductResponse> remove(@RequestBody ProductRequest productRequest) throws Exception {

        productService.remove(productRequest.getId());
        ProductResponse productResponse = new ProductResponse();
        productResponse.setMessage("Product is Successfully Deleted.");
        return ResponseEntity.ok(productResponse);
    }

    @PostMapping("/update")
    public ResponseEntity<ProductResponse> update (@RequestBody ProductRequest productRequest) throws Exception {

        productService.update(productRequest);
        ProductResponse productResponse = new ProductResponse();
        productResponse.setMessage("Product is Successfully Updated.");
        return ResponseEntity.ok(productResponse);
    }
}
