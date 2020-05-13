/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.Connection;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static String hashPassword(String s) {
        String passwordToHash = s;
        String generatedPassword = null;
        try {
            //create messageDigest instance for md5
            MessageDigest md = MessageDigest.getInstance("MD5");
            //add password bytes to digest
            md.update(passwordToHash.getBytes());
            //get bytes
            byte[] bytes = md.digest();
            //This bytes[] has bytes in decimal format;
            //Convert it to hexadecimal format
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            //Get complete hashed password in hex format
            generatedPassword = sb.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        System.out.println(generatedPassword);

        return generatedPassword;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Session s = Connection.getSessionFactory().openSession();
        Transaction tr = s.beginTransaction();
        String password = hashPassword("kevin");

        List<models.Users> user = s.createQuery("from Users s where"
                + " s.name='clement' AND s.password='" + password + "'").list();

        
       if( user == null){
         System.out.print("no user found");
       } else {
        for(models.Users us: user){
          System.out.print(us.getName());
        }
        tr.commit();

        s.close();
       }

    }

}
