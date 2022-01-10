
package com.mycompany.bank.services;
import com.mycompany.bank.models.Customers;
import com.mycompany.bank.models.Accounts;
import com.mycompany.bank.models.Transactions;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalDateTime; 
/**
 *
 * @author jackd
 */
public class AccountsServices {
    
     public static List<Customers> list = new ArrayList<>();
     public static List<Accounts> accountsList=new ArrayList<>();
     
     public AccountsServices(){}
     public List<Accounts> getAllAccountsByCustomer(int customerID){
         return list.get(customerID-1).getAccounts();
     }
     
     public Accounts getAccountsById(int customerID,int accountID){
         return list.get(customerID-1).getAccounts().get(accountID-1);
     }
     
      public List<Accounts>getAccountsById(int customerID){
         return list.get(customerID-1).getAccounts();
     }
     
     public List<Accounts> getAllAccounts() {
        return accountsList;
    }
         
      public Accounts createAccounts(Accounts a) {
	a.setId(accountsList.size() + 1);
	accountsList.add(a);
	System.out.println("201 - resource created with path: /customers/id/accounts" + String.valueOf(a.getId()));
	return a;
    }
      
      
      //Create Account for User Here
      public Accounts createAccount(Accounts a){
          
          
          return null;
      }
}

