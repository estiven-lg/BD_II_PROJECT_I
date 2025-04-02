package model;

import java.sql.Timestamp;

public class Log {

    private int logId;
    private int idTransaction;
    private int idAtm;
    private String action;
    private Timestamp timestamp;
    private String details;

    public Log(int logId, int idTransaction, int idAtm, String action,
            Timestamp timestamp, String details) {
        this.logId = logId;
        this.idTransaction = idTransaction;
        this.idAtm = idAtm;
        this.action = action;
        this.timestamp = timestamp;
        this.details = details;
    }

    // Getters and Setters
    public int getLogId() {
        return logId;
    }

    public void setLogId(int logId) {
        this.logId = logId;
    }

    public int getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(int idTransaction) {
        this.idTransaction = idTransaction;
    }

    public int getIdAtm() {
        return idAtm;
    }

    public void setIdAtm(int idAtm) {
        this.idAtm = idAtm;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
