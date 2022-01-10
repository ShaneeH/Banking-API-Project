/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bank.resources;

import com.mycompany.bank.models.Accounts;
import com.mycompany.bank.models.Customers;
import com.mycompany.bank.models.Transactions;
import com.mycompany.bank.services.CustomersServices;
import com.mycompany.bank.services.AccountsServices;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.QueryParam;
import java.time.LocalDate;
import java.time.LocalDateTime; 

/**
 *
 * @author jackd
 * @author ShaneH
 */

@Path("/customers")
public class CustomersResources {

    CustomersServices custService = new CustomersServices();
    AccountsServices accService = new AccountsServices();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Customers> getAllJSON() {
        return custService.getAllCustomers();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Customers createCustomer(Customers c) {

        return custService.createCustomers(c);

    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Customers getCustomerByID(@PathParam("id") int id) {

        return custService.getCustomers(id);

    }

    //Get Customers Accounts 
    @GET
    @Path("/{id}/accounts")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Accounts> getCustomerAccounts(@PathParam("id") int id) {

        System.out.println("Bank 2 Project Runnin....");
        return custService.getCustomersAccount(id);

    }

    @GET
    @Path("/{id}/accounts/{aid}")
    @Produces(MediaType.APPLICATION_JSON)
    public Accounts getCustomerAccounts(@PathParam("id") int id, @PathParam("aid") int aid) {

        return custService.getAccountsById(id, aid);

    }

    @GET
    @Path("/{id}/accounts/{aid}/transactions")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Transactions> getTransactionsByaccountId(@PathParam("id") int id, @PathParam("aid") int aid) {
        return custService.getTransactionsById(id, aid);
    }

    @POST
    @Path("/{id}/accounts/{aid}/transactions")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Transactions makeTransaction(@PathParam("id") int id, @PathParam("aid") int aid, Transactions T) {

        return custService.createTransaction(id, aid, T);

    }

    //Create Customers Accounts
    @POST
    @Path("/{id}/accounts")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Accounts addCustomerAccounts(@PathParam("id") int id, Accounts A) {

        return custService.createAccount(id, A);

    }

}
