package retailerservices.retailerservices.entity;


import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Table
@Entity
public class Retailer {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    @NotNull
    @Column
    private String Name;

    @NotNull
    @Column
    private String Type;

    @Column
    private String mdn;

    @NotNull
    @Column
    private String GstIn;

    @NotNull
    @Column
    private String Password;

    @Column
    @CreationTimestamp
    private Date CreationDate;

    @Column
    private Date UpdatedDate;

    public String getMdn() {
        return mdn;
    }

    public void setMdn(String mdn) {
        this.mdn = mdn;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Date getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(Date creationDate) {
        CreationDate = creationDate;
    }

    public Date getUpdatedDate() {
        return UpdatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        UpdatedDate = updatedDate;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getGstIn() {
        return GstIn;
    }

    public void setGstIn(String gstIn) {
        GstIn = gstIn;
    }
}
