package retailerservices.retailerservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import retailerservices.retailerservices.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

    @Query("select p from Product p where p.Id = :Id")
    public Product findone(@Param("Id") Long Id);

}
