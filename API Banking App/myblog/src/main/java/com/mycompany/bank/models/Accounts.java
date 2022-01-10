
package com.mycompany.bank.models;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalDateTime; 
/**
 *
 * @author jackd
 */
public class Accounts {
    private int id;
    private String accType;
    private String sortNum;
    private int balance;
    private List<Transactions> Transactions = new ArrayList<>();
    
    public Accounts(){
        
    }
    
    public Accounts(int id,String accType,String sortNum, int balance,List<Transactions> Transactions ){
        this.id=id;
        this.accType=accType;
        this.sortNum=sortNum;
        this.balance=0;
        this.Transactions=Transactions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public void setSortNum(String sortNum) {
        this.sortNum = sortNum;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setTransactions(List<Transactions> Transactions) {
        this.Transactions = Transactions;
    }

    public String getAccType() {
        return accType;
    }

    public String getSortNum() {
        return sortNum;
    }

    public int getBalance() {
        return balance;
    }

    public List<Transactions> getTransactions() {
        return Transactions;
    }

}
