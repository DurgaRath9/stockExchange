package com.assignment.exc.model;

import java.io.Serializable;
import java.util.StringJoiner;

public class Share implements Serializable {

    private static final long serialVersionUID = -8978404484203295316L;

    private String shareId;
    private String shareStatus;
    private String high;
    private String low;
    private String closedHours;
    private String openHours;
    private ShareDetails shareDetails;

    public Share() { }

    public Share(String shareId, String shareStatus, String high, String low, String closedHours, String openHours, ShareDetails shareDetails) {
        this.shareId = shareId;
        this.shareStatus = shareStatus;
        this.high = high;
        this.low = low;
        this.closedHours = closedHours;
        this.openHours = openHours;
        this.shareDetails = shareDetails;
    }

    public String getShareId() {
        return shareId;
    }

    public void setShareId(String shareId) {
        this.shareId = shareId;
    }

    public String getShareStatus() {
        return shareStatus;
    }

    public void setShareStatus(String shareStatus) {
        this.shareStatus = shareStatus;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getClosedHours() {
        return closedHours;
    }

    public void setClosedHours(String closedHours) {
        this.closedHours = closedHours;
    }

    public String getOpenHours() {
        return openHours;
    }

    public void setOpenHours(String openHours) {
        this.openHours = openHours;
    }

    public ShareDetails getShareDetails() {
        return shareDetails;
    }

    public void setShareDetails(ShareDetails shareDetails) {
        this.shareDetails = shareDetails;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Share.class.getSimpleName() + "[", "]")
                .add("shareId='" + shareId + "'")
                .add("shareStatus='" + shareStatus + "'")
                .add("high='" + high + "'")
                .add("low='" + low + "'")
                .add("closedHours='" + closedHours + "'")
                .add("openHours='" + openHours + "'")
                .add("shareDetails=" + shareDetails)
                .toString();
    }
}
