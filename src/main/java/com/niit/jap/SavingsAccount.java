/*
 * Author Name: Revathi
 * Date: 25-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */

package com.niit.jap;

public class SavingsAccount {
    //some attributes that can be modelled in SavingsAccount class are
    private String accountName;
    private String accountNumber;
    private String accountOpeningDate;
    private String status;
    private double availableBalance;
    private double totalBalance;
    private String InternetBankingStatus;
    private String MobileBankingStatus;
    private double interestRate;
    private String modeOfOperation;

    public SavingsAccount() {

    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountOpeningDate() {
        return accountOpeningDate;
    }

    public void setAccountOpeningDate(String accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public String getInternetBanking() {
        return InternetBankingStatus;
    }

    public void setInternetBanking(String internetBankingStatus) {
        InternetBankingStatus = internetBankingStatus;
    }

    public String getMobileBanking() {
        return MobileBankingStatus;
    }

    public void setMobileBanking(String mobileBankingStatus) {
        MobileBankingStatus = mobileBankingStatus;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public String getModeOfOperation() {
        return modeOfOperation;
    }

    public void setModeOfOperation(String modeOfOperation) {
        this.modeOfOperation = modeOfOperation;
    }

    public double DebitCash(double cash) {
        return cash = this.availableBalance - cash;
    }

    public double CreditCash(double cash) {
        return cash = this.availableBalance + cash;
    }

    public double RetrieveCash(double cash) {
        return cash;
    }
}


