
package com.mycompany.bank.models;
import static com.mycompany.bank.services.AccountsServices.accountsList;
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
public class Customers {
    private String name;
    private String adress;
    private String email;
    private int id;
    private List<Accounts> Accounts = new ArrayList<>();
    private List<Transactions> Transactions = new ArrayList<>();
    
    public Customers(){
        
    }
    
    public Customers(String name, String adress, String email,int id,List<Accounts> Accounts ){
        this.name=name;
        this.adress=adress;
        this.email=email;
        this.id=id;
        this.Accounts=Accounts;
        
    }
    
    public Transactions createTransaction(Transactions T){
        
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAccounts(List<Accounts> Accounts) {
        this.Accounts = Accounts;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public List<Accounts> getAccounts() {
        return Accounts;
    }
    
    public List<Accounts> newAccount(Accounts A){
        
       
        int id = Accounts.size();
        id++;
         A.setId(id);
        Accounts.add(A);
        return Accounts;
    }
    
        public List<Transactions> newTransaction(Transactions T){
        
        Transactions.add(T);
        return Transactions;
    }
        
        

   

    
}
