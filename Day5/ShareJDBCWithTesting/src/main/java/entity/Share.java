package entity;

import java.time.LocalDate;

public class Share {
    private int shareId;
    private String shareName;
    private int marketPrice;
    private LocalDate issueDate;

    public Share(){

    }

    public Share(int shareId, String shareName, int marketPrice, LocalDate issueDate) {
        this.shareId = shareId;
        this.shareName = shareName;
        this.marketPrice = marketPrice;
        this.issueDate = issueDate;
    }

    public int getShareId() {
        return shareId;
    }

    public void setShareId(int shareId) {
        this.shareId = shareId;
    }

    public String getShareName() {
        return shareName;
    }

    public void setShareName(String shareName) {
        this.shareName = shareName;
    }

    public int getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(int marketPrice) {
        this.marketPrice = marketPrice;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    @Override
    public String toString() {
        return "Share{" +
                "shareId=" + shareId +
                ", shareName='" + shareName + '\'' +
                ", marketPrice=" + marketPrice +
                ", issueDate=" + issueDate +
                '}';
    }
}
