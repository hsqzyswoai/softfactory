package com.softfactory.pojo;

import java.io.Serializable;
import java.util.Date;

public class Seller implements Serializable {

    private Integer sellerId;//营业员Id
    private String sellerPhone;
    private String sellerName;
    private Integer joinerId;
    private Integer userId;
    private String sellerSex;
    private String sellerCard;
    private String sellerCardnum;
    private String sellerRemark;
    private Date sellerDate;
    private String sellerLoc;

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerPhone() {
        return sellerPhone;
    }

    public void setSellerPhone(String sellerPhone) {
        this.sellerPhone = sellerPhone;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Integer getJoinerId() {
        return joinerId;
    }

    public void setJoinerId(Integer joinerId) {
        this.joinerId = joinerId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSellerSex() {
        return sellerSex;
    }

    public void setSellerSex(String sellerSex) {
        this.sellerSex = sellerSex;
    }

    public String getSellerCard() {
        return sellerCard;
    }

    public void setSellerCard(String sellerCard) {
        this.sellerCard = sellerCard;
    }

    public String getSellerCardnum() {
        return sellerCardnum;
    }

    public void setSellerCardnum(String sellerCardnum) {
        this.sellerCardnum = sellerCardnum;
    }

    public String getSellerRemark() {
        return sellerRemark;
    }

    public void setSellerRemark(String sellerRemark) {
        this.sellerRemark = sellerRemark;
    }

    public Date getSellerDate() {
        return sellerDate;
    }

    public void setSellerDate(Date sellerDate) {
        this.sellerDate = sellerDate;
    }

    public String getSellerLoc() {
        return sellerLoc;
    }

    public void setSellerLoc(String sellerLoc) {
        this.sellerLoc = sellerLoc;
    }
}
