/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.UserEnterprise;

import javax.swing.JOptionPane;

/**
 *
 * @author jshar
 */
public class UpdateProfileJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateProfileJPanel
     */
    public UpdateProfileJPanel() {
        initComponents();
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
        txtAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        txtFirstName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rBtnMale = new javax.swing.JRadioButton();
        rBtnFemale = new javax.swing.JRadioButton();
        rBtnOthers = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtAddress1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Address:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 170, -1));

        jLabel5.setText("Email Address:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 170, -1));

        jLabel7.setText("Phone Number:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, -1, -1));
        add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 170, -1));
        add(txtWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 60, -1));
        add(txtHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, 60, -1));

        jLabel12.setText("cms");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 520, -1, -1));

        jLabel11.setBackground(new java.awt.Color(204, 204, 255));
        jLabel11.setText("lbs");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, -1, -1));

        jLabel8.setText("Weight:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, -1, -1));

        jLabel10.setText("Height:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, -1, -1));

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 570, -1, -1));

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });
        add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 171, -1));

        jLabel3.setText("First Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        jLabel2.setText("Last Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 82, -1));
        add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 171, -1));

        jLabel4.setText("Gender:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        rBtnMale.setText("Male");
        rBtnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnMaleActionPerformed(evt);
            }
        });
        add(rBtnMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));

        rBtnFemale.setText("Female");
        rBtnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnFemaleActionPerformed(evt);
            }
        });
        add(rBtnFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, -1, -1));

        rBtnOthers.setText("Others");
        rBtnOthers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnOthersActionPerformed(evt);
            }
        });
        add(rBtnOthers, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("UPDATE PROFILE");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 350, -1));

        jLabel13.setText("Age:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));
        add(txtAddress1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 170, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        //All fields will be necessary

        boolean flag = false;
        String email = txtEmail.getText();

        flag = email.matches("^[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");

        if(!flag) {
            JOptionPane.showMessageDialog(null, "Email Address must be in format of X@Y.Z");
            return;
        }

        //        Validation for Unique EmailID

        String phoneNumber = txtPhoneNumber.getText();

        if(phoneNumber.length() != 10) {
            JOptionPane.showMessageDialog(null, "PhoneNumber must be of 10 digits");
            return;
        }
        flag = phoneNumber.matches("^[0-9]+$");
        if(!flag) {
            JOptionPane.showMessageDialog(null, "Phone Number must have digits only");
            return;
        }

        //        Validation for Unique Phone Number

        String weight = txtWeight.getText();

        flag = weight.matches("^[0-9]+$");
        if(!flag) {
            JOptionPane.showMessageDialog(null, "Weight must have digits only");
            return;
        }

        String height = txtHeight.getText();

        flag = weight.matches("^[0-9]+$");
        if(!flag) {
            JOptionPane.showMessageDialog(null, "Height must have digits only");
            return;
        }

        //Now here we will save the values in DB

    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void rBtnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnMaleActionPerformed
        // TODO add your handling code here:
        if(rBtnMale.isSelected()) {
            rBtnFemale.setSelected(false);
            rBtnOthers.setSelected(false);
        }
    }//GEN-LAST:event_rBtnMaleActionPerformed

    private void rBtnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnFemaleActionPerformed
        // TODO add your handling code here:
        if(rBtnFemale.isSelected()) {
            rBtnMale.setSelected(false);
            rBtnOthers.setSelected(false);
        }

    }//GEN-LAST:event_rBtnFemaleActionPerformed

    private void rBtnOthersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnOthersActionPerformed
        // TODO add your handling code here:
        if(rBtnOthers.isSelected()) {
            rBtnMale.setSelected(false);
            rBtnFemale.setSelected(false);
        }
    }//GEN-LAST:event_rBtnOthersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rBtnFemale;
    private javax.swing.JRadioButton rBtnMale;
    private javax.swing.JRadioButton rBtnOthers;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAddress1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
