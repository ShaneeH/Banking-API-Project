/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bank.resources;
import com.mycompany.bank.models.Transactions;
import com.mycompany.bank.services.TransactionsServices;
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
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime; 
/**
 *
 * @author jackd
 */  

@Path("/transactions")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TransactionsResources {
  TransactionsServices tranServices=new TransactionsServices();
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<Transactions> getAllJson(){
      
      return tranServices.getAllTransactions();
  }
  
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Transactions createTransactions(Transactions t){
        return tranServices.createTransactions(t);
    }
    
    @Path("/transactions/lodge")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Transactions updateBalannce(int bal){
        return null;
    }
    

    
    
}
