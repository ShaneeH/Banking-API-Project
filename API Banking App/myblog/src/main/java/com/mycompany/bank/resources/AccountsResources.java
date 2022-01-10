/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bank.resources;

import com.mycompany.bank.models.Accounts;
import com.mycompany.bank.models.Customers;
import com.mycompany.bank.services.AccountsServices;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
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
 */
@Path("/accounts")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AccountsResources {

    AccountsServices accService = new AccountsServices();

   /* @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Accounts> getAllJson() {
        return accService.getAllAccounts();
    }*/

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Accounts createAccount(Accounts a) {

        return accService.createAccounts(a);

    }

    //Get Customers Accounts based on ID
    /*@GET
    @Path("/customers/{id}/accounts")
    @Produces(MediaType.APPLICATION_JSON)
    public Accounts getCustomerByID(@PathParam("id") int id) {
              
       return accService.getAccountsById(id, id);
       
    }*/
    
    

}
