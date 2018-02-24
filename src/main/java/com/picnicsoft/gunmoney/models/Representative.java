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

    private String party;

    private String state;

    private String office;

    private String total_contributions;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getParty() {
        return party;
    }

    public String getState() {
        return state;
    }

    public String getOffice() {
        return office;
    }

    public String getTotal_contributions() {
        return total_contributions;
    }

    public Representative() {
    }

    public Representative(String name, String party, String state, String office, String total_contributions) {
        this.name = name;
        this.party = party;
        this.state = state;
        this.office = office;
        this.total_contributions = total_contributions;
    }
}
