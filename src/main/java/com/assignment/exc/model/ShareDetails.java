package com.assignment.exc.model;

import java.io.Serializable;
import java.util.StringJoiner;

public class ShareDetails implements Serializable {

    private static final long serialVersionUID = 1169538530844858513L;

    private String shareId;
    private String displayName;
    private String name;
    private String type;
    private String price;
    private String lastPrice;
    private String currentPrice;
    private String availableCount;
    private String upDownFlag;
    private String sellingLimit;

    public ShareDetails() {
    }

    public ShareDetails(String shareId, String displayName, String name, String type, String price, String lastPrice, String currentPrice, String availableCount, String upDownFlag, String sellingLimit) {
        this.shareId = shareId;
        this.displayName = displayName;
        this.name = name;
        this.type = type;
        this.price = price;
        this.lastPrice = lastPrice;
        this.currentPrice = currentPrice;
        this.availableCount = availableCount;
        this.upDownFlag = upDownFlag;
        this.sellingLimit = sellingLimit;
    }

    public String getShareId() {
        return shareId;
    }

    public void setShareId(String shareId) {
        this.shareId = shareId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(String lastPrice) {
        this.lastPrice = lastPrice;
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getAvailableCount() {
        return availableCount;
    }

    public void setAvailableCount(String availableCount) {
        this.availableCount = availableCount;
    }

    public String getUpDownFlag() {
        return upDownFlag;
    }

    public void setUpDownFlag(String upDownFlag) {
        this.upDownFlag = upDownFlag;
    }

    public String getSellingLimit() {
        return sellingLimit;
    }

    public void setSellingLimit(String sellingLimit) {
        this.sellingLimit = sellingLimit;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ShareDetails.class.getSimpleName() + "[", "]")
                .add("shareId='" + shareId + "'")
                .add("displayName='" + displayName + "'")
                .add("name='" + name + "'")
                .add("type='" + type + "'")
                .add("price='" + price + "'")
                .add("lastPrice='" + lastPrice + "'")
                .add("currentPrice='" + currentPrice + "'")
                .add("availableCount='" + availableCount + "'")
                .add("upDownFlag='" + upDownFlag + "'")
                .add("sellingLimit='" + sellingLimit + "'")
                .toString();
    }
}
