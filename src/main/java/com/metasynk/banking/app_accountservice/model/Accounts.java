package com.metasynk.banking.app_accountservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Table
@Entity
@Builder
@Data
public class Accounts
{
    @Id
    private int accountId;
    private  String accountType;
    private int userId;
    private double accountBalance;

    public Accounts(int accountId, String accountType, int userId, double accountBalance) {
        this.accountId = accountId;
        this.accountType = accountType;
        this.userId = userId;
        this.accountBalance = accountBalance;
    }

    public Accounts() {

    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
