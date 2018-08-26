package retailerservices.retailerservices.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Table
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long Id;

    @NotNull
    @Column
    private String ProductName;

    @NotNull
    @Column
    private long Price;

    @Column
    private long RetailerId;

    @Column
    private Date UpdateDate;

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
