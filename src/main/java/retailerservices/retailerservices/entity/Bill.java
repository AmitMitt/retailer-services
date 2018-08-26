package retailerservices.retailerservices.entity;

import javax.persistence.*;
import java.util.Date;

@Table
@Entity
public class Bill {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    @Column
    private long RetailerId;

    @Column
    private String Product;

    @Column
    private long Total;

    @Column
    private Date CreationDate;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public long getRetailerId() {
        return RetailerId;
    }

    public void setRetailerId(long retailerId) {
        RetailerId = retailerId;
    }

    public String getProduct() {
        return Product;
    }

    public void setProduct(String product) {
        Product = product;
    }

    public long getTotal() {
        return Total;
    }

    public void setTotal(long total) {
        Total = total;
    }

    public Date getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(Date creationDate) {
        CreationDate = creationDate;
    }
}
