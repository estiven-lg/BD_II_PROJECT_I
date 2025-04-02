package model;

import java.sql.Timestamp;

public class Transaction {

    private int id;
    private int sourceAccount;
    private int destinationAccount;
    private int atmId;
    private int cardId;
    private double amount;
    private String transactionType;
    private Timestamp dateTransaction;
    private String currency;
    private String description;

    public Transaction(int id, int sourceAccount, int destinationAccount, int atmId,
            int cardId, double amount, String transactionType,
            Timestamp dateTransaction, String currency, String description) {
        this.id = id;
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.atmId = atmId;
        this.cardId = cardId;
        this.amount = amount;
        this.transactionType = transactionType;
        this.dateTransaction = dateTransaction;
        this.currency = currency;
        this.description = description;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSourceAccount() {
        return sourceAccount;
    }

    public void setSourceAccount(int sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    public int getDestinationAccount() {
        return destinationAccount;
    }

    public void setDestinationAccount(int destinationAccount) {
        this.destinationAccount = destinationAccount;
    }

    public int getAtmId() {
        return atmId;
    }

    public void setAtmId(int atmId) {
        this.atmId = atmId;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Timestamp getDateTransaction() {
        return dateTransaction;
    }

    public void setDateTransaction(Timestamp dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
