/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import services.SignupService;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import services.BookCategoryService;
import services.BookService;
import services.ClientService;

/**
 *
 * @author HP
 */
public class Server {

    public static void main(String[] args) throws RemoteException {
        try {

            Registry reg = LocateRegistry.createRegistry(2000);
            reg.rebind("SignupService", new SignupService());
            reg.rebind("BookService", new BookService());
            reg.rebind("BookCategoryService", new BookCategoryService());
            reg.rebind("ClientService", new ClientService());
            System.out.println("server is running now......");
        } catch (Exception ex) {
            System.out.println("server failed ......");
        }
    }

}
