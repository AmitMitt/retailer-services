package retailerservices.retailerservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import retailerservices.retailerservices.entity.Bill;

@Repository
public interface BillRepository extends JpaRepository<Bill, Long> {
}
