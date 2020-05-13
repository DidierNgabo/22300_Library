package models;
// Generated May 13, 2020 9:22:47 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Checkinout generated by hbm2java
 */
public class Checkinout  implements java.io.Serializable {


     private Integer id;
     private String bookTitle;
     private String clientName;
     private String status;
     private Date checkinDate;
     private Date checkoutDate;

    public Checkinout() {
    }

    public Checkinout(String bookTitle, String clientName, String status, Date checkinDate, Date checkoutDate) {
       this.bookTitle = bookTitle;
       this.clientName = clientName;
       this.status = status;
       this.checkinDate = checkinDate;
       this.checkoutDate = checkoutDate;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getBookTitle() {
        return this.bookTitle;
    }
    
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    public String getClientName() {
        return this.clientName;
    }
    
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public Date getCheckinDate() {
        return this.checkinDate;
    }
    
    public void setCheckinDate(Date checkinDate) {
        this.checkinDate = checkinDate;
    }
    public Date getCheckoutDate() {
        return this.checkoutDate;
    }
    
    public void setCheckoutDate(Date checkoutDate) {
        this.checkoutDate = checkoutDate;
    }




}

