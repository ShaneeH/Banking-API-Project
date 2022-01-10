package com.mycompany.bank.services;

import com.mycompany.bank.models.Customers;
import com.mycompany.bank.models.Accounts;
import com.mycompany.bank.models.Transactions;
import static com.mycompany.bank.services.AccountsServices.accountsList;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime; 

/**
 *
 * @author jackd
 * @author ShaneH
 */
public class CustomersServices {

    public static List<Customers> list = new ArrayList<>();
    public static List<Accounts> accountList = new ArrayList<>();
    public static List<Accounts> accountList2 = new ArrayList<>();
    public static List<Transactions> transactionList = new ArrayList<>();
    public static boolean init = true;

    public CustomersServices() {
        int idIndex = 0;
        if (init) {

            Transactions t1 = new Transactions(true, false, "lad", 100, "i sent this to you" , false,0,0);
            transactionList.add(t1);
            
            Accounts a1 = new Accounts(1, "debit", "bo2", 100, transactionList);
            accountList.add(a1);
            Customers c1 = new Customers("shane", "123 brickfield park d12", "shaneBoi@gmail.com", 1, accountList);

            Accounts a2 = new Accounts(1, "credit", "bo2", 100, transactionList);
            accountList2.add(a2);
            Customers c2 = new Customers("jack", "321 Darndale Drive d55", "Dunner2k@gmail.com", 2, accountList2);

            list.add(c1);
            list.add(c2);
            init = false;

        }
    }

    public Accounts getAccountsById(int customerID, int accountID) {
        return list.get(customerID - 1).getAccounts().get(accountID - 1);
    }

    public List<Transactions> getTransactionsById(int customerID, int accountID) {
        return list.get(customerID - 1).getAccounts().get(accountID - 1).getTransactions();
    }

    public List<Customers> getAllCustomers() {
        return list;
    }

    public Customers getCustomers(int id) {
        return list.get(id - 1);
    }

    //This is the Method that get there Account
    public List<Accounts> getCustomersAccount(int id) {
        return list.get(id - 1).getAccounts();
    }

    public Accounts createAccount(int id, Accounts A) {

        A.setId(accountsList.size() + 1);
        list.get(id - 1).newAccount(A);
        return null;
    }

    public Transactions createTransaction(int id, int aid, Transactions T) {
        int custSendID=T.getPAYEcustomerID();
        int custAccID=T.getPAYEaccountID();
        if(T.getTransfer()==true){
           int  balance2=list.get(custSendID- 1).getAccounts().get(custAccID - 1).getBalance();
            list.get(custSendID-1).getAccounts().get(custAccID-1).setBalance(balance2+T.getAmmount());
           
        }
        int balance = list.get(id - 1).getAccounts().get(aid - 1).getBalance();
        T.setPostBalance(balance - T.getAmmount());
         list.get(id - 1).getAccounts().get(aid - 1).getTransactions().add(T);
        list.get(id-1).getAccounts().get(aid-1).setBalance(balance-T.getAmmount());
        list.get(custSendID-1).getAccounts().get(custAccID-1).getTransactions().remove(list.get(custSendID-1).getAccounts().get(custAccID-1).getTransactions().size()-1);
        return null; 
        
    }

    //Testing Method 
    public List<Accounts> getAccount() {
        return null;
    }

    public Customers createCustomers(Customers c) {
        c.setId(list.size() + 1);
        list.add(c);
        System.out.println("201 - resource created with path: /messages/" + String.valueOf(c.getId()));
        return c;
    }

    public List<Customers> getSearchCustomers(String name, int id) {
        List<Customers> matcheslist = new ArrayList<>();

        for (Customers q : getAllCustomers()) {
            if ((name == null || q.getName().equals(name))
                    && (id == 0 || q.getId() == id)) {
                matcheslist.add(q);
            }
        }
        return matcheslist;
    }
}
