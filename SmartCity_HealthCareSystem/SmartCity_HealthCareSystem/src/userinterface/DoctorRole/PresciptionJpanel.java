/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userinterface.DoctorRole;

import Business.EcoSystem;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.CardLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import net.proteanit.sql.DbUtils;
import userinterface.dbConn;

/**
 *
 * @author Aaradhy
 */
public class PresciptionJpanel extends javax.swing.JPanel {

    /**
     * Creates new form PresciptionJpanel
     */
     private JPanel userProcessContainer;
    private EcoSystem ecosystem;
     Connection conn = dbConn.getConn();
    ResultSet rs = null;
    PreparedStatement pst = null;
    
     String doc_name=null;
    String special=null;
    String location=null;
    String doc_net=null;
    String doc_enter=null;
    String name=null;
    String a=null;
    String b=null;
    
    String p=null;
    String q=null;
    String r=null;
    String s=null;
    String t=null;
    String u=null;
    String v=null;
    String w=null;
    String x=null;
    String y=null;
    
    String date=null;
    public PresciptionJpanel(JPanel userProcessContainer,String doc_name,String doc_net,String doc_enter,String name,String b,String a) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
       this.doc_name=doc_name;
       this.special=special;
       this.location=location;
       this.doc_net=doc_net;
       this.doc_enter=doc_enter;
       this.name=name;
       this.b=b;
       this.a=a;
       jTextField6.setText(doc_name);
       jTextField5.setText(a);
        System.out.println("   "+a);
        populateTable();
    }
    public void populateTable(){
       //connect from database -- query
       try{
        String sql ="select b_id,b_name,do_id,do_name,do_enter,drug,quantity,dose,duration,instruction from pharmacy_status where do_id='"+name+"' ";//AND b_id='"+b+"'
        //b_name,do_name,do_enter,drug,quantity,dose,duration,instruction
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
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

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSubmit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Drug Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel4.setText("Drug Quantity");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 97, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 100, -1));

        jLabel5.setText("MG");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 86, -1));

        jLabel6.setText("Dose per day");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, -1, -1));

        jLabel7.setText("Duration Of Medication");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, -1));
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 86, -1));

        jLabel8.setText("Patient Name");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 64, -1));

        jLabel9.setText("Doctor Name");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));
        add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 89, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "Drug name", "Drug Type", "Drug Quantity", "Dose ", "Duration"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 750, 159));

        btnSubmit.setText("Submit Prescription");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 150, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, -1, 66));

        jLabel11.setText("Instructions:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        jButton2.setText("<<Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 640, -1, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("PRESCRIPTION DATABASE");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 560, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("MANAGE PRESCRIPTIONS");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 560, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icon/pharmacy.gif"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 210, -1, -1));

        jButton3.setText("Print Prescription");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here: prescription
        System.out.println("1");
        
        
        boolean flag = false;
        String drug=jTextField1.getText();
        String quantity=jTextField2.getText();
        String dose=jTextField3.getText();
        String duration=jTextField4.getText();
        String ins=jTextArea1.getText();
        
        if(drug.isEmpty() || quantity.isEmpty() || dose.isEmpty() || duration.isEmpty() || ins.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Fields caanot be empty");
            return;
        }
        
        flag = quantity.matches("^[0-9]+$");
        if(!flag) {
            JOptionPane.showMessageDialog(null, "Quantity must have digits only");
            return;
        }
        
        flag = duration.matches("^[0-9]+$");
        if(!flag) {
            JOptionPane.showMessageDialog(null, "Duration must have digits only");
            return;
        }
        
        System.out.println("Drug" + drug);
        try{
            
        String sql1 = " insert into pharmacy_status values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            pst = conn.prepareStatement(sql1);

          String acc="Accepted";
            pst.setString(5,date );
         
          
            pst.setString(1, b);
            pst.setString(2, a);
            pst.setString(3,name );
            pst.setString(4,doc_name);
            pst.setString(5,doc_enter);
            pst.setString(6,drug);
            pst.setString(7,quantity);
            pst.setString(8,dose);
            pst.setString(9,duration);
            pst.setString(10,ins);
            pst.setString(11,"NA");
            pst.setString(12,"NA");
            pst.setString(13,"NA");
            pst.setString(14,"NA");

         

            pst.executeUpdate();
            System.out.println("Drug1111" + drug);
            JOptionPane.showMessageDialog(null, "Prescription Added successfuly");
            populateTable();
           
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
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DoctorJPanel dp=new DoctorJPanel(userProcessContainer,doc_name,special,location,doc_net,doc_enter,name);
              userProcessContainer.add("dp",dp);
                CardLayout layout=(CardLayout)userProcessContainer.getLayout();
                layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       
        if(jTable1.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null,"Please select a row");
            return;
        }
        
        try {
             
        
        String deductReason="";
        JFileChooser chooser = new JFileChooser();
        chooser.setSelectedFile(new File(q + "-Prescription" + ".pdf"));
        int dialogResult = chooser.showSaveDialog(null);
        if (dialogResult == JFileChooser.APPROVE_OPTION) {

            String filepath = chooser.getSelectedFile().getPath();
            try {
                
                
              
                
                Document myDocumen = new Document();
                PdfWriter mywriter = PdfWriter.getInstance(myDocumen, new FileOutputStream(filepath));

                myDocumen.open();
                myDocumen.add(new Paragraph("SmartCity Health Care System", FontFactory.getFont(FontFactory.HELVETICA, 20, Font.BOLD)));
                myDocumen.add(new Paragraph("PRESCRIPTION", FontFactory.getFont(FontFactory.TIMES_BOLD, 20, Font.BOLD)));
                myDocumen.add(new Paragraph(new Date().toString()));
                myDocumen.add(new Paragraph("----------------------------------------------------------------------------"));
                myDocumen.add(new Paragraph("DOCTOR Details", FontFactory.getFont(FontFactory.TIMES_BOLD, 15, Font.BOLD)));
                myDocumen.add(new Paragraph("DOCTOR Name: " + s , FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.NORMAL)));
                myDocumen.add(new Paragraph("ID: " + r, FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.NORMAL)));
                myDocumen.add(new Paragraph("HOSPITAL: " + t, FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.NORMAL)));
                myDocumen.add(new Paragraph("----------------------------------------------------------------------------"));
                myDocumen.add(new Paragraph("PATIENT ", FontFactory.getFont(FontFactory.TIMES_BOLD, 15, Font.BOLD)));
                myDocumen.add(new Paragraph("NAME: " + q, FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.NORMAL)));

                myDocumen.add(new Paragraph("PATIENT ID " + p, FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.NORMAL)));
//                
                myDocumen.add(new Paragraph("----------------------------------------------------------------------------"));
                myDocumen.add(new Paragraph("MEDICATION", FontFactory.getFont(FontFactory.TIMES_BOLD, 15, Font.BOLD)));
                myDocumen.add(new Paragraph("DRUG NAME: " + u, FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.NORMAL)));
                myDocumen.add(new Paragraph("QUANTITY OF DRUG :" + v, FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.NORMAL)));
                 myDocumen.add(new Paragraph("DOSE: " + w, FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.NORMAL)));
                myDocumen.add(new Paragraph("DURATON :" + x, FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.NORMAL)));
                 myDocumen.add(new Paragraph("INSTRUCTION :" + y, FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.NORMAL)));
                
//                
                myDocumen.newPage();
                myDocumen.close();
                JOptionPane.showMessageDialog(null, "report successfuly generated");
            } catch (NumberFormatException | FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, e);
                e.printStackTrace();
            } finally {
                try {
                    if (rs != null | pst != null) {
                        rs.close();
                        pst.close();
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }

        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid salary!!!","Not Numeric", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow>=0){
            p= (String) jTable1.getValueAt(selectedRow,0);
            q= (String) jTable1.getValueAt(selectedRow,1);
            r= (String) jTable1.getValueAt(selectedRow,2);
            s= (String) jTable1.getValueAt(selectedRow,3);
            t= (String) jTable1.getValueAt(selectedRow,4);
            u= (String) jTable1.getValueAt(selectedRow,5);
            v= (String) jTable1.getValueAt(selectedRow,6);
            w= (String) jTable1.getValueAt(selectedRow,7);
            x= (String) jTable1.getValueAt(selectedRow,8);
            y= (String) jTable1.getValueAt(selectedRow,9);
        }
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
