/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bank.services;

import com.mycompany.bank.models.Transactions;
import com.mycompany.bank.models.Accounts;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime; 

public class TransactionsServices {
    public static List<Accounts> list = new ArrayList<>();
     public static List<Transactions> TransactionsList=new ArrayList<>();
     
     public TransactionsServices(){}
     public List<Transactions> getAllTransactionsByAccounts(int accountsID){
       return list.get(accountsID-1).getTransactions();     
     }
    public Transactions getTransactionsById(int accountsID,int transactionsID){
        return list.get(accountsID-1).getTransactions().get(transactionsID-1);
    }
    
    public Transactions updateBalance(int accountsID){
        
        
        return null;
    }
    
    
    public List<Transactions> getAllTransactions(){
        return TransactionsList;
    }
    public Transactions createTransactions(Transactions t){
        return t;
    }
    
          
}
