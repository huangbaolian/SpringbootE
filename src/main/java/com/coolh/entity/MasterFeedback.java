package com.coolh.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
public class MasterFeedback {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer userId;
    private Integer sellerId;
    private String contentU;
    private Boolean isDeal;
    private String contentS;

    public MasterFeedback() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getContentU() {
        return contentU;
    }

    public void setContentU(String contentU) {
        this.contentU = contentU;
    }

    public Boolean getDeal() {
        return isDeal;
    }

    public void setDeal(Boolean deal) {
        isDeal = deal;
    }

    public String getContentS() {
        return contentS;
    }

    public void setContentS(String contentS) {
        this.contentS = contentS;
    }
}
