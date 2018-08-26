package retailerservices.retailerservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import retailerservices.retailerservices.entity.Retailer;

@Repository
public interface RetailerRepository extends JpaRepository<Retailer, Long> {

    @Query("select r from Retailer r where r.mdn = :mdn")
    public Retailer findBymdn(@Param("mdn") String mdn);

}
