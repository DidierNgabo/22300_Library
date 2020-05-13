/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author HP
 */
public class BookView extends javax.swing.JInternalFrame {

    /**
     * Creates new form BookView
     */
    public BookView() {
        initComponents();
        table();
        loadCombo();
        bookTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtBkTitle = new javax.swing.JTextField();
        txtBkAuthor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtBkPub = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        bkDate = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        txtBkpages = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        bkcombo = new javax.swing.JComboBox();
        SaveBkBtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        bkTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCatName = new javax.swing.JTextField();
        catSaveBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        catTable = new javax.swing.JTable();
        catUpdateBtn = new javax.swing.JButton();
        delCatBtn = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Add a book");

        jLabel4.setText("Title");

        jLabel5.setText("Author");

        jLabel6.setText("Publishing house");

        jLabel7.setText("Date of publication");

        jLabel8.setText("pages");

        txtBkpages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBkpagesActionPerformed(evt);
            }
        });

        jLabel9.setText("Category");

        SaveBkBtn.setText("Save");
        SaveBkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBkBtnActionPerformed(evt);
            }
        });

        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        bkTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "book_id", "Title", "Author", "Publishing_house", "Date_of_pub", "pages", "book_category"
            }
        ));
        bkTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bkTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(bkTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(txtBkpages, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(SaveBkBtn)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(updatebtn))
                                            .addComponent(bkcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(67, 67, 67)
                                        .addComponent(deletebtn))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtBkPub, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4))
                                    .addGap(64, 64, 64)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtBkTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                        .addComponent(txtBkAuthor))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bkDate, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBkTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBkAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBkPub, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(bkDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtBkpages, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bkcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveBkBtn)
                    .addComponent(updatebtn)
                    .addComponent(deletebtn))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Book", jPanel1);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Add  a new book category");

        jLabel1.setText("Name");

        catSaveBtn.setText("Save");
        catSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catSaveBtnActionPerformed(evt);
            }
        });

        catTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category_id", "Category_name"
            }
        ));
        catTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(catTable);

        catUpdateBtn.setText("Update");
        catUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catUpdateBtnActionPerformed(evt);
            }
        });

        delCatBtn.setText("Delete");
        delCatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delCatBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtCatName, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(catSaveBtn)
                        .addGap(31, 31, 31)
                        .addComponent(catUpdateBtn)
                        .addGap(27, 27, 27)
                        .addComponent(delCatBtn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(415, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCatName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(catSaveBtn)
                    .addComponent(catUpdateBtn)
                    .addComponent(delCatBtn))
                .addGap(69, 69, 69)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(410, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Book Category", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void table() {
        controllers.BookCategoryDao bc = new controllers.BookCategoryDao();
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel) catTable.getModel();
        model.getDataVector().removeAllElements();

        Object[] obj = new Object[2];

        for (models.Bookcategory cat : bc.display()) {
            obj[0] = cat.getId();
            obj[1] = cat.getName();

            model.addRow(obj);
            System.out.println("row is displayed");

        }

    }

    public void bookTable() {
        controllers.BooksDao bookdao = new controllers.BooksDao();
        
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel) bkTable.getModel();
        model.getDataVector().removeAllElements();

        Object[] obj = new Object[8];

        for (models.Books bk : bookdao.display()) {
            obj[0] = bk.getBookId();
            obj[1] = bk.getTitle();
            obj[2] = bk.getAuthor();
            obj[3] = bk.getPublisher();
            obj[4] = bk.getDateOfPub();
            obj[5] = bk.getPages();
            obj[6] = bk.getBookCategory();

            model.addRow(obj);
            System.out.println("row is displayed");

        }
    }
    int bookCatId;

    public void loadCombo() {
        Session s = util.Connection.getSessionFactory().openSession();
        Transaction tr = s.beginTransaction();
        List<models.Bookcategory> bc = s.createQuery(" from Bookcategory ").list();

        for (models.Bookcategory ls : bc) {
            System.out.println(ls.getName());
            String name = ls.getName();
            bkcombo.addItem(name);
        }

    }
    private void catSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catSaveBtnActionPerformed
        // TODO add your handling code here:
        models.Bookcategory category = new models.Bookcategory();
        category.setName(txtCatName.getText());
        controllers.BookCategoryDao bcdao = new controllers.BookCategoryDao();
        bcdao.save(category);
        table();

    }//GEN-LAST:event_catSaveBtnActionPerformed

    private void catUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catUpdateBtnActionPerformed
        // TODO add your handling code here:
        
        models.Bookcategory category = new models.Bookcategory();
        category.setId(catId);
        category.setName(txtCatName.getText());
        controllers.BookCategoryDao bc = new controllers.BookCategoryDao();
        bc.update(category);
        table();
        

    }//GEN-LAST:event_catUpdateBtnActionPerformed
    int catId;
    private void catTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) catTable.getModel();
        int selectedRow = catTable.getSelectedRow();
        catId = (int) model.getValueAt(selectedRow, 0);
        txtCatName.setText(model.getValueAt(selectedRow, 1).toString());
    }//GEN-LAST:event_catTableMouseClicked

    private void delCatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delCatBtnActionPerformed
        // TODO add your handling code here:
        controllers.BookCategoryDao bc = new controllers.BookCategoryDao();
        bc.delete(catId);
        table();
    }//GEN-LAST:event_delCatBtnActionPerformed

    private void SaveBkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBkBtnActionPerformed
        // TODO add your handling code here:
        models.Books book = new models.Books();

        book.setTitle(txtBkTitle.getText());
        book.setAuthor(txtBkAuthor.getText());
        book.setPublisher(txtBkPub.getText());
        book.setDateOfPub(bkDate.getDate());
        book.setBookCategory(bkcombo.getSelectedItem().toString());
        book.setPages(Integer.valueOf(txtBkpages.getText()));
        
        controllers.BooksDao bookd = new controllers.BooksDao();
         bookd.save(book);
         bookTable();

    }//GEN-LAST:event_SaveBkBtnActionPerformed

    private void txtBkpagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBkpagesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBkpagesActionPerformed
    int bookId;
    private void bkTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bkTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) bkTable.getModel();
        int selectedRow = bkTable.getSelectedRow();
        bookId = (int) model.getValueAt(selectedRow, 0);
        txtBkTitle.setText(model.getValueAt(selectedRow, 1).toString());
        txtBkAuthor.setText(model.getValueAt(selectedRow, 2).toString());
        txtBkPub.setText(model.getValueAt(selectedRow, 3).toString());
        bkDate.setDate((Date) model.getValueAt(selectedRow, 4));
        txtBkpages.setText(model.getValueAt(selectedRow, 5).toString());
        bkcombo.setSelectedItem(model.getValueAt(selectedRow, 6));
    }//GEN-LAST:event_bkTableMouseClicked

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
        models.Books book=new models.Books();
        book.setBookId(bookId);
        book.setTitle(txtBkTitle.getText());
        book.setAuthor(txtBkAuthor.getText());
        book.setPublisher(txtBkPub.getText());
        book.setDateOfPub(bkDate.getDate());
        book.setBookCategory(bkcombo.getSelectedItem().toString());
        book.setPages(Integer.valueOf(txtBkpages.getText()));
        
         controllers.BooksDao bookdao = new  controllers.BooksDao();
        bookdao.update(book);
        bookTable();

    }//GEN-LAST:event_updatebtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
        controllers.BooksDao bookdao = new controllers.BooksDao();
        bookdao.delete(bookId);
        bookTable();
        
        
    }//GEN-LAST:event_deletebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SaveBkBtn;
    private com.toedter.calendar.JDateChooser bkDate;
    private javax.swing.JTable bkTable;
    private javax.swing.JComboBox bkcombo;
    private javax.swing.JButton catSaveBtn;
    private javax.swing.JTable catTable;
    private javax.swing.JButton catUpdateBtn;
    private javax.swing.JButton delCatBtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtBkAuthor;
    private javax.swing.JTextField txtBkPub;
    private javax.swing.JTextField txtBkTitle;
    private javax.swing.JTextField txtBkpages;
    private javax.swing.JTextField txtCatName;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
