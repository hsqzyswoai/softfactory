package com.softfactory.pojo;

import java.io.Serializable;

public class CardNo implements Serializable{
    private int id;
    private int firstNo;
    private int middleNo;
    private int endNo;
    private Joiner joiner;
    private Seller seller;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFirstNo() {
        return firstNo;
    }

    public void setFirstNo(int firstNo) {
        this.firstNo = firstNo;
    }

    public int getMiddleNo() {
        return middleNo;
    }

    public void setMiddleNo(int middleNo) {
        this.middleNo = middleNo;
    }

    public int getEndNo() {
        return endNo;
    }

    public void setEndNo(int endNo) {
        this.endNo = endNo;
    }

    public Joiner getJoiner() {
        return joiner;
    }

    public void setJoiner(Joiner joiner) {
        this.joiner = joiner;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }
}
