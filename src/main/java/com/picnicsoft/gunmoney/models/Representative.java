package com.picnicsoft.gunmoney.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Representative {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String office;

    private String total_contributions;

    public String getName() {
        return name;
    }

    public String getOffice() {
        return office;
    }

    public String getTotal_contributions() {
        return total_contributions;
    }

    public Representative() {
    }

    public Representative(String name, String office, String total_contributions) {
        this.name = name;
        this.office = office;
        this.total_contributions = total_contributions;
    }
}
