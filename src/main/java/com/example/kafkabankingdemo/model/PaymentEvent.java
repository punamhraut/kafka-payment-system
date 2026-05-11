package com.example.kafkabankingdemo.model;

public class PaymentEvent {

    private String transactionId;
    private String customerName;
    private Double amount;

    public PaymentEvent() {
    }

    public PaymentEvent(String transactionId, String customerName, Double amount) {
        this.transactionId = transactionId;
        this.customerName = customerName;
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "PaymentEvent{" +
                "transactionId='" + transactionId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", amount=" + amount +
                '}';
    }
}
