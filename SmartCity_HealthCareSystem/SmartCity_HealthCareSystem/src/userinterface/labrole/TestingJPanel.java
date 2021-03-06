/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userinterface.labrole;

import Business.EcoSystem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.TableColumn;
import net.proteanit.sql.DbUtils;
import userinterface.dbConn;

/**
 *
 * @author Aaradhy
 */
public class TestingJPanel extends javax.swing.JPanel {
JPanel userProcessContainer;
EcoSystem system;
Connection conn = dbConn.getConn();
    ResultSet rs = null;
    PreparedStatement pst = null;
     String a=null;
    String b=null;
     String c=null;
    String d=null;
    String e=null;
    String f=null;
    String g=null;
    String h=null;
     String i=null;
    String j=null;
    String k=null;
    String l=null;
     String org=null;
         String location=null;
                 String username=null;
                         String net=null;
                                 String enter=null;
      

    TestingJPanel(JPanel userProcessContainer, String org,String  location,String username,String net,String enter) {
         initComponents();
       this.userProcessContainer = userProcessContainer;
        //this.system = system;
        this.org=org;
        this.location=location;
        this.username=username;
        this.net=net;
        this.enter=enter;
        populateTable();
        populateResultTable();
         }
    
     public void populateTable(){
       //connect from database -- query
         try{
        String sql ="select pat_id,pat_name,doctor_id,doctor_name,doctor_date,test_type from testing_status where reporting_date ='" +"NA"+ "'";
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        jTable2.setModel(DbUtils.resultSetToTableModel(rs));
        String[] stringlist = {"Patient ID","Patient Name","Doctor ID","Doctor Name","Date","Test type"};
        for(int i = 0; i < stringlist.length; i++) {
            TableColumn column1 = jTable2.getTableHeader().getColumnModel().getColumn(i);
            column1.setHeaderValue(stringlist[i]);
            }
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    }
    finally {
            
            try{
                rs.close();
                pst.close();
                
            }
            catch(Exception e){
                
            }
        }
   }
     public void populateResultTable(){
       //connect from database -- query
         try{
        String sql ="select * from testing_status where organisation ='" + org + "' AND (NOT reporting_date ='" +"NA"+ "')";
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        String[] stringlist = {"Patient ID","Patient Name","Doctor ID","Doctor Name","Date","Test type","Reporting Time","Result","Organisation","Location","Network","Enterprise"};
        for(int i = 0; i < stringlist.length; i++) {
            TableColumn column1 = jTable1.getTableHeader().getColumnModel().getColumn(i);
            column1.setHeaderValue(stringlist[i]);
            }
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    }
    finally {
            
            try{
                rs.close();
                pst.close();
                
            }
            catch(Exception e){
                
            }
        }
   }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnConfirm = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox();
        btnUpdateStatus = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Patient name ", "Test type ", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 990, 166));

        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Patient name ", "Test type ", "urgency "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 790, 166));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Positive", "Negative" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, 90, -1));

        btnUpdateStatus.setText("Update Status");
        btnUpdateStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStatusActionPerformed(evt);
            }
        });
        add(btnUpdateStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 560, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("TESTING DATABSE");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 490, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("TESTING REQUESTS");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 490, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        try{
             int selectedRow = jTable2.getSelectedRow();
            
            if(selectedRow < 0) {
                JOptionPane.showMessageDialog(this, "Please select row from the table");
                return;
            } 
            
            
//            String sql1 = " insert into testing_status values(?,?,?,?,?,?,?,?,?,?,?,?)";
            
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
            Date date = new Date();  
           String date_time= formatter.format(date);
            System.out.println("da"+date_time);
            
            String acc="Pending";
            
            String sql1 = "update testing_status set result ='" +acc+ "', reporting_date='" + date_time+
                    "', organisation = '"+ org +"', network ='"+net+"', enterprise = '"+enter+"', location ='"+location+"' where pat_id ='" +a+ 
                    "' AND doctor_id ='" + c + "' AND doctor_date = '" + e+ "' AND test_type ='" + f+ "'";
           
            pst = conn.prepareStatement(sql1);
//            System.out.println("Date " + date);
//            System.out.println("A"+a);
//            pst.setString(1,a );
//            pst.setString(2, b);
//            pst.setString(3,c );
//            pst.setString(4,d);
//            pst.setString(5, e);
//            pst.setString(6, f);
//            pst.setString(7, date_time);
//             pst.setString(8, acc);
//             pst.setString(9, org);
//            pst.setString(10, location);
//            pst.setString(11, net);
//            pst.setString(12, enter);
           
           

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Test Added in Queue successfuly");
            populateResultTable();
            populateTable();
           // populateWorkTable();

        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            try {
                pst.close();
                rs.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
                System.out.println("EEEEEEEEEE");
        int selectedRow = jTable2.getSelectedRow();
        System.out.println("FFFFFFFFFFFFFFF");
        if (selectedRow>=0){
            System.out.println("GGGGGGGGG");
            a= (String) jTable2.getValueAt(selectedRow,0);
            System.out.println("");
            b= (String) jTable2.getValueAt(selectedRow,1);
            c=(String) jTable2.getValueAt(selectedRow,2);
            d= (String) jTable2.getValueAt(selectedRow,3);
            e=(String) jTable2.getValueAt(selectedRow,4);
            f= (String) jTable2.getValueAt(selectedRow,5);
            
          //  k=(String) jTable1.getValueAt(selectedRow,10);
         //   l= (String) jTable1.getValueAt(selectedRow,11);
            System.out.println(selectedRow+"  "+a);
            System.out.println(selectedRow+"  "+f);
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void btnUpdateStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStatusActionPerformed
        // TODO add your handling code here:
        try{
//            int seat=Integer.parseInt(jTextField1.getText());
//            String model=jTextField2.getText();
//            String name=jComboBox1.getSelectedItem().toString();

            int selectedRow = jTable1.getSelectedRow();
            
            if(selectedRow < 0) {
                JOptionPane.showMessageDialog(this, "Please select row from the table");
                return;
            }
            
            String patID = (String) jTable1.getValueAt(selectedRow,0);
            String docID = (String) jTable1.getValueAt(selectedRow,2);
            String tempDate = (String) jTable1.getValueAt(selectedRow,4);
            String testType = (String)  jTable1.getValueAt(selectedRow,5);
            
            
            String result=jComboBox1.getSelectedItem().toString();
        String sql = "update testing_status set result='" + result + "' where pat_id='"+patID+"' AND doctor_id ='" + docID + "' AND doctor_date = '" + tempDate+ "' AND test_type ='" + testType + "'"; 
                pst = conn.prepareStatement(sql);
                
                pst.execute();
                JOptionPane.showMessageDialog(null, "Result Updated successfuly");
                populateResultTable();
                populateTable();
                
                String sql5 = "select email from user_data where username ='" + patID+ "'";
                pst = conn.prepareStatement(sql5);
                rs=pst.executeQuery();
                
                String emailID = null; 
                if(rs.next()) {
                    emailID = rs.getString("email");
                }
                
                
                
        
        
        String receiver = emailID;
        final String sender = "healthcaresystemaed@gmail.com";
        final String password = "healthcaresystem";
        String Subjects = "Result";
        String msg = "Hello \n\n" + "Your have been resulted " + result + " for '" + testType + "'\n\nThank you" ;
                
        Properties properties = new Properties();
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port","587");
        Session session = Session.getDefaultInstance(properties,new javax.mail.Authenticator() {
            protected javax.mail.PasswordAuthentication getPasswordAuthentication(){
                return new javax.mail.PasswordAuthentication(sender,password);
            }
        });
//        
        try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(sender));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(receiver));
            message.setSubject(Subjects);
            message.setText(msg);
            Transport.send(message);
        }catch(Exception ex){
            System.out.println(""+ex);
        }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } finally {
                       

                try {

                } catch (Exception e) {

                }
            }
        
        
    }//GEN-LAST:event_btnUpdateStatusActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         System.out.println("EEEEEEEEEE");
        int selectedRow = jTable1.getSelectedRow();
        System.out.println("FFFFFFFFFFFFFFF");
        if (selectedRow>=0){
            System.out.println("GGGGGGGGG");
            a= (String) jTable1.getValueAt(selectedRow,0);
        
            
          //  k=(String) jTable1.getValueAt(selectedRow,10);
         //   l= (String) jTable1.getValueAt(selectedRow,11);
            System.out.println(selectedRow+"  "+a);
           
        }
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnUpdateStatus;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
