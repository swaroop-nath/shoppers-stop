package org.ecommerce.model;

import javax.persistence.*;

@Entity
@Table(name = "brand_master")
@SequenceGenerator(name = "brandseq",
        sequenceName = "brand_sequence",
        allocationSize = 1)
public class Brand {

    @Id
    @GeneratedValue(generator = "brandseq")
    @Column(name = "brand_id")
    private int brandID;

    private String brandName;

    public int getBrandID() {
        return brandID;
    }

    public void setBrandID(int brandID) {
        this.brandID = brandID;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
