package com.mycompany.bank.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author jackd
 */
public class Transactions {

    private Boolean debit;
    private Boolean credit;
    private String PAYE;
    private int ammount;
    private int postBalance;
    private String description;
    private LocalDateTime Date;
    private Boolean transfer;
    private int PAYEcustomerID;
    private int PAYEaccountID;
    public Transactions() {

    }

    ;
    
    public Transactions(Boolean debit, Boolean credit, String PAYE, int ammount, String description, boolean transfer,int PAYEcustomerID, int PAYEaccountID ) {
        this.debit = debit;
        this.credit = credit;
        this.PAYE = PAYE;
        this.ammount = ammount;
        this.description = description;
    //    this.Date = d;
        this.transfer = transfer;
        this.Date = LocalDateTime.now();
        this.PAYEaccountID=PAYEaccountID;
        this.PAYEcustomerID=PAYEcustomerID;
       
    }

    public Boolean getTransfer() {
        return transfer;
    }

    public void setTransfer(Boolean transfer) {
        this.transfer = transfer;
    }

    public LocalDateTime getDate() {
        return Date;
    }

    public void setDate(LocalDateTime Date) {
        this.Date = Date;
    }

    public Boolean getDebit() {
        return debit;
    }

    public Boolean getCredit() {
        return credit;
    }

    public String getPAYE() {
        return PAYE;
    }

    public int getPostBalance() {
        return postBalance;
    }

    public String getDescription() {
        return description;
    }

    public void setDebit(Boolean debit) {
        this.debit = debit;
    }

    public void setCredit(Boolean credit) {
        this.credit = credit;
    }

    public void setPAYE(String PAYE) {
        this.PAYE = PAYE;
    }

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }

    public void setPostBalance(int postBalance) {
        this.postBalance = postBalance;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPAYEcustomerID() {
        return PAYEcustomerID;
    }

    public void setPAYEcustomerID(int PAYEcustomerID) {
        this.PAYEcustomerID = PAYEcustomerID;
    }

    public int getPAYEaccountID() {
        return PAYEaccountID;
    }

    public void setPAYEaccountID(int PAYEaccountID) {
        this.PAYEaccountID = PAYEaccountID;
    }

}
