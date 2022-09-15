package com.web.web1.model;

import com.fasterxml.jackson.annotation.JsonAnySetter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="tbl_friend")

public class friends {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String moneyfriend;

    private String description;

    private BigDecimal amount;

    public long getId() {
        return id;
    }

    //generate getters and setters for the fields above

    public String getMoneyfriend() {
        return moneyfriend;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setMoneyfriend(String moneyfriend) {
        this.moneyfriend = moneyfriend;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
