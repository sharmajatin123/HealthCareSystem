/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import net.proteanit.sql.DbUtils;
import userinterface.dbConn;
/**
 *
 * @author Seemin
 */
public class DoctorJPanel extends javax.swing.JPanel {

   private JPanel userProcessContainer;
    private EcoSystem ecosystem;
     Connection conn = dbConn.getConn();
    ResultSet rs = null;
    PreparedStatement pst = null;

    /**
     *
     * Creates new form ManageNetworkJPanel
     */
    String doc_name=null;
    String special=null;
    String location=null;
    String doc_net=null;
    String doc_enter=null;
    String name=null;
    String a=null;
    String b=null;
    String date=null;
    String patName = null;
    String patResult = null;
    String patEmail = null;
    String patDate = null;
    
    public DoctorJPanel(JPanel userProcessContainer,String doc_name,String special,String location,String doc_net,String doc_enter,String name) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
       this.doc_name=doc_name;
       this.special=special;
       this.location=location;
       this.doc_net=doc_net;
       this.doc_enter=doc_enter;
       this.name=name;
       jXDatePicker1.setVisible(false);
        jLabel2.setVisible(false);
       populateTable();
       populateWorkTable();
    }
    public void populateTable(){
       //connect from database -- query
       try{
        String sql ="select p_name,p_id,p_age,p_sym from appointment where d_id='"+name+"'";
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        tblPatientProfile.setModel(DbUtils.resultSetToTableModel(rs));
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
        System.out.println("77777777777");
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
    
    public void populateWorkTable(){
       //connect from database -- query
       try{
        String sql ="select pat_name, appointment, date from appoint_status where doctor_id='"+name+"'";
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        tblWorkArea.setModel(DbUtils.resultSetToTableModel(rs));
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
        System.out.println("77777777777");
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

        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatientProfile = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        VaccinejComboBox = new javax.swing.JComboBox<>();
        testingjComboBox = new javax.swing.JComboBox<>();
        btnGenerate = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Testingtxt = new javax.swing.JLabel();
        vaccinetxt = new javax.swing.JLabel();
        btnDeny = new javax.swing.JButton();
        btnAccept = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblWorkArea = new javax.swing.JTable();
        btnEmail = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1400, 700));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MANAGE DOCTOR ROLE");

        tblPatientProfile.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Patient Name", "Age", "Symptoms"
            }
        ));
        tblPatientProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPatientProfileMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPatientProfile);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("DIAGNOSIS DETAILS"));

        jCheckBox1.setText("Give Appointment");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jXDatePicker1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXDatePicker1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Date:");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jCheckBox3.setText("Pharmacy");

        jCheckBox5.setText("Vaccine");

        jCheckBox2.setText("Testing");

        VaccinejComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Meningocacal", "Flu Shot", "MMR", "TDC", "Rubella", "Hepatatis" }));

        testingjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ECG", "CBC", "CitiScan", "X-Ray", "Endoscopy", "Sonography" }));

        btnGenerate.setText("Generate Prescriptions");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        jButton3.setText("Confirm Request");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Confirm Request");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Testingtxt.setBackground(new java.awt.Color(255, 255, 255));
        Testingtxt.setText("Tests");
        Testingtxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        vaccinetxt.setBackground(new java.awt.Color(255, 255, 255));
        vaccinetxt.setText("Vaccines");
        vaccinetxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jCheckBox1)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCheckBox3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jCheckBox2)
                        .addComponent(jCheckBox5)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(VaccinejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(testingjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Testingtxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vaccinetxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jButton2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGenerate))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Testingtxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox2)
                        .addComponent(testingjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox5)
                    .addComponent(VaccinejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(vaccinetxt))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox3)
                    .addComponent(btnGenerate))
                .addContainerGap())
        );

        btnDeny.setText("Deny Appointment");
        btnDeny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDenyActionPerformed(evt);
            }
        });

        btnAccept.setText("Accept Appointment");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        tblWorkArea.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Patient Name", "Accepted/Denied", "Status", "Next Steps"
            }
        ));
        tblWorkArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblWorkAreaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblWorkArea);

        btnEmail.setText("Send Email");
        btnEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnDeny, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95)
                                .addComponent(btnAccept)
                                .addGap(188, 188, 188))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(36, 36, 36)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(btnEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAccept)
                    .addComponent(btnDeny))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnEmail)
                .addGap(375, 375, 375))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblPatientProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientProfileMouseClicked
        // TODO add your handling code here:
        try {
            int selectedRow = tblPatientProfile.getSelectedRow();
            if (selectedRow>=0){
                a= (String) tblPatientProfile.getValueAt(selectedRow,0);
                b= (String) tblPatientProfile.getValueAt(selectedRow,1);
                System.out.println(selectedRow+"  "+a);
                System.out.println(selectedRow+"  "+b);

                String sql = "select * from manage_doc where doc_name ='" + a + "' AND special='" + b + "'";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                System.out.println("55555555555");
                if (rs.next()) {

                }

            }
            else
            {
                JOptionPane.showMessageDialog(null, "Please Select a Row!!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            try {
                pst.close();
                rs.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_tblPatientProfileMouseClicked

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
        try{

            String sql1 = " insert into appoint_status values(?,?,?,?,?)";

            pst = conn.prepareStatement(sql1);

            String acc="Accepted";
            pst.setString(5,date );

            System.out.println("Date " + date);

            pst.setString(1, b);
            pst.setString(2, a);
            pst.setString(3,name );
            pst.setString(4,acc);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Appointment Status Updated successfuly");
            populateWorkTable();

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

    }//GEN-LAST:event_btnAcceptActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        jXDatePicker1.setVisible(true);
        jLabel2.setVisible(true);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void btnDenyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDenyActionPerformed
        // TODO add your handling code here:
        try{

            String sql1 = " insert into appoint_status values(?,?,?,?,?)";

            pst = conn.prepareStatement(sql1);

            String acc="Denied";
            date="NA";
            pst.setString(5,date );

            pst.setString(1, b);
            pst.setString(2, a);
            pst.setString(3,name );
            pst.setString(4,acc);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Appointment Status Updated successfuly");
            populateWorkTable();

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
    }//GEN-LAST:event_btnDenyActionPerformed

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
        // TODO add your handling code here:
        if(jCheckBox3.isSelected())
        {
        PresciptionJpanel pj=new PresciptionJpanel(userProcessContainer,doc_name,doc_net,doc_enter,name,b,a);
        userProcessContainer.add("pj",pj);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        else{
            JOptionPane.showMessageDialog(null, "Tick Pharmacy BOX to continue");
        }
    }//GEN-LAST:event_btnGenerateActionPerformed

    private void jXDatePicker1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDatePicker1ActionPerformed
        // TODO add your handling code here:
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        jXDatePicker1.setFormats(dateFormat);

        date = dateFormat.format(jXDatePicker1.getDate()).toString();
        JFormattedTextField editor = jXDatePicker1.getEditor();
        Date dateInDatePicker = (Date) editor.getValue();
        System.out.println(date);
    }//GEN-LAST:event_jXDatePicker1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         if(jCheckBox2.isSelected())
            {
                
            String test=testingjComboBox.getSelectedItem().toString();
        try{
           
            String sql1 = " insert into testing values(?,?,?,?,?,?)";

            pst = conn.prepareStatement(sql1);

            String acc="Accepted";
            pst.setString(5,date );
             pst.setString(6, test);

            System.out.println("Date " + date);

            pst.setString(1, b);
            pst.setString(2, a);
            pst.setString(3,name );
            pst.setString(4,doc_name);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Testing Request Generated successfuly");
            populateWorkTable();
            

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
            }
         else{
              JOptionPane.showMessageDialog(null, "Tick Testing BOX to continue");
         }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox5.isSelected())
            {
                
            String vaccine=VaccinejComboBox.getSelectedItem().toString();
        try{
           
            String sql1 = " insert into vaccine values(?,?,?,?,?,?)";

            pst = conn.prepareStatement(sql1);

           // String acc="Accepted";
            pst.setString(5,date );
             pst.setString(6, vaccine);

            System.out.println("Date " + date);

            pst.setString(1, b);
            pst.setString(2, a);
            pst.setString(3,name );
            pst.setString(4,doc_name);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Vaccine Request Generated successfuly");
            populateWorkTable();
            

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
            }
         else{
              JOptionPane.showMessageDialog(null, "Tick Vaccine BOX to continue");
         }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmailActionPerformed
        // TODO add your handling code here:
//        String receiver = p;
//        final String sender = "healthcaresystemaed@gmail.com";
//        final String password = "healthcaresystem";
//        String Subjects = "Result";
//        String msg = "Hello " + patName + "\n\n" + "Your covid result from Covid Center " + coviCenter + " is " + patResult + 
//                "\n\nThank you" ;
//                
//        Properties properties = new Properties();
//        properties.put("mail.smtp.auth","true");
//        properties.put("mail.smtp.starttls.enable","true");
//        properties.put("mail.smtp.host","smtp.gmail.com");
//        properties.put("mail.smtp.port","587");
//        Session session = Session.getDefaultInstance(properties,new javax.mail.Authenticator() {
//            protected javax.mail.PasswordAuthentication getPasswordAuthentication(){
//                return new javax.mail.PasswordAuthentication(sender,password);
//            }
//        });
////        
//        try{
//            MimeMessage message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(sender));
//            message.addRecipient(Message.RecipientType.TO, new InternetAddress(receiver));
//            message.setSubject(Subjects);
//            message.setText(msg);
//            Transport.send(message);
//        }catch(Exception ex){
//            System.out.println(""+ex);
//        }
    }//GEN-LAST:event_btnEmailActionPerformed

    private void tblWorkAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblWorkAreaMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblWorkArea.getSelectedRow();
        if (selectedRow>=0){
            patEmail = (String) tblWorkArea.getValueAt(selectedRow,0);
            patName =  (String) tblWorkArea.getValueAt(selectedRow,0);
            patResult = (String) tblWorkArea.getValueAt(selectedRow,1);
            patDate = (String) tblWorkArea.getValueAt(selectedRow,2);
        }  
    }//GEN-LAST:event_tblWorkAreaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Testingtxt;
    private javax.swing.JComboBox<String> VaccinejComboBox;
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnDeny;
    private javax.swing.JButton btnEmail;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private javax.swing.JTable tblPatientProfile;
    private javax.swing.JTable tblWorkArea;
    private javax.swing.JComboBox<String> testingjComboBox;
    private javax.swing.JLabel vaccinetxt;
    // End of variables declaration//GEN-END:variables
}
