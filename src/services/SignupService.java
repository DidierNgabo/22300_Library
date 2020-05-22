/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import services.ISignupService;
import java.rmi.AccessException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Users;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author HP
 */
public class SignupService extends UnicastRemoteObject implements ISignupService  {
    
    public SignupService() throws RemoteException{
      super();
    }
    @Override
    public boolean insert(models.Users user) throws RemoteException {
      try{
          Session s= util.Connection.getSessionFactory().openSession();
          Transaction tr = s.beginTransaction();
          s.save(user);
          tr.commit();
          s.close();
          return true;
          
      } catch(Exception ex){
          return false;
      }
    }
    
}
