/*
 * Author Name: Revathi
 * Date: 25-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */

package com.niit.jap;

public class SavingsAccountImpl {
    public static void main(String args) {
        // object declaration and initialization
        SavingsAccount savingsAccount = new SavingsAccount();
        // calling methods
        savingsAccount.setAccountName("Revathi");
        System.out.println("Account name = " + savingsAccount.getAccountName());
        savingsAccount.setAccountNumber("987564324");
        System.out.println("AccountNumber = " + savingsAccount.getAccountNumber());
        savingsAccount.setAccountOpeningDate("16th April, 1996");
        System.out.println("AccountOpeningDate = " + savingsAccount.getAccountOpeningDate());
        savingsAccount.setStatus("Active");
        System.out.println("Status of the account = " + savingsAccount.getStatus());
        savingsAccount.setInterestRate(0.005);
        System.out.println("Interest rate = " + savingsAccount.getInterestRate());
        savingsAccount.setAvailableBalance(3000);
        System.out.println("AvailableBalance = " + savingsAccount.getAvailableBalance());
        savingsAccount.setTotalBalance(40000);
        System.out.println("TotalBalance = " + savingsAccount.getTotalBalance());
        savingsAccount.setMobileBanking("Enabled");
        System.out.println("Mobile banking status = " + "Enabled");
        savingsAccount.setInternetBanking("Enabled");
        System.out.println("Internet banking status = " + savingsAccount.getInternetBanking());
        savingsAccount.setModeOfOperation("Self-Operated");
        System.out.println("Mode of operation = " + savingsAccount.getModeOfOperation());
        System.out.println("Debit cash = " + savingsAccount.DebitCash(1700.0));
        System.out.println("Credit cash = " + savingsAccount.CreditCash(3000.0));
        System.out.println("Retrieved cash = " + savingsAccount.RetrieveCash(563.0));
    }
}
