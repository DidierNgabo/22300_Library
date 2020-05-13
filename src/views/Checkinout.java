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
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author HP
 */
public class Checkinout extends javax.swing.JInternalFrame {

    /**
     * Creates new form Checkinout
     */
    public Checkinout() {
        initComponents();
        bookCombo();
        clientCombo();
        table();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        clientcombo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        bookcombo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        checkinbtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        jLabel1.setText("Client name");

        jLabel2.setText("Book title");

        jLabel3.setText("Date");

        checkinbtn.setText("Check in");
        checkinbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkinbtnActionPerformed(evt);
            }
        });

        jButton2.setText("Check out");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Client Name", "Book Title", "status", "date"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(checkinbtn)
                .addGap(51, 51, 51)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clientcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(clientcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(bookcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkinbtn)
                    .addComponent(jButton2))
                .addContainerGap(161, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void bookCombo() {
        Session s = util.Connection.getSessionFactory().openSession();
        Transaction tr = s.beginTransaction();
        List<models.Books> bc = s.createQuery(" from Books ").list();

        for (models.Books ls : bc) {
            System.out.println(ls.getTitle());
            String name = ls.getTitle();
            bookcombo.addItem(name);
        }

    }
     public void clientCombo() {
        Session s = util.Connection.getSessionFactory().openSession();
        Transaction tr = s.beginTransaction();
        List<models.Clients> bc = s.createQuery(" from Clients ").list();

        for (models.Clients ls : bc) {
            System.out.println(ls.getFirstname() + " "+ ls.getLastname());
            String name = ls.getFirstname() + " " + ls.getLastname();
            clientcombo.addItem(name);
        }

    }
    public void table() {
        Session s = util.Connection.getSessionFactory().openSession();
        Transaction tr = s.beginTransaction();
        List<models.Checkinout> list = s.createQuery("from Checkinout").list();
        tr.commit();
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel) table.getModel();
        model.getDataVector().removeAllElements();

        Object[] obj = new Object[5];

        for (models.Checkinout op : list) {
            obj[0] = op.getId();
            obj[1] = op.getBookTitle();
            obj[2] = op.getClientName();
            obj[3] = op.getStatus();
            obj[4] = op.getCheckinDate();

            model.addRow(obj);
            System.out.println("row is displayed");

        }
        s.close();

    }
    private void checkinbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkinbtnActionPerformed
        // TODO add your handling code here:
        Session s= util.Connection.getSessionFactory().openSession();
        Transaction tr=s.beginTransaction();
        models.Checkinout operation=new models.Checkinout();
        operation.setBookTitle(bookcombo.getSelectedItem().toString());
        operation.setClientName(clientcombo.getSelectedItem().toString());
        operation.setStatus("Check in");
        operation.setCheckinDate(date.getDate());
        operation.setCheckoutDate(date.getDate());
        
        s.save(operation);
        tr.commit();
        table();
        JOptionPane.showMessageDialog(null, "operation saved");
        s.close();
    }//GEN-LAST:event_checkinbtnActionPerformed
    int  opId;
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int selectedRow = table.getSelectedRow();
      
        opId= (int) model.getValueAt(selectedRow, 0);
        clientcombo.setSelectedItem(model.getValueAt(selectedRow, 2));
        bookcombo.setSelectedItem(model.getValueAt(selectedRow, 3));
        date.setDate((Date) model.getValueAt(selectedRow, 4));
    }//GEN-LAST:event_tableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Session s = util.Connection.getSessionFactory().openSession();
        Transaction tr = s.beginTransaction();
        models.Checkinout operation = (models.Checkinout) s.get(models.Checkinout.class, opId);

        operation.setCheckinDate(date.getDate());
        operation.setCheckoutDate(date.getDate());
        operation.setStatus("check out");
        s.update(operation);
        tr.commit();
        JOptionPane.showMessageDialog(null, "book returned successfully");
        table();
        s.close();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox bookcombo;
    private javax.swing.JButton checkinbtn;
    private javax.swing.JComboBox clientcombo;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
