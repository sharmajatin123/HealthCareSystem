/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.labrole;

import Business.EcoSystem;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Seemin
 */
public class LabRoleWorkArea extends javax.swing.JPanel {
 JPanel userProcessContainer;
 EcoSystem system;
 String org=null;
         String location=null;
                 String username=null;
                         String net=null;
                                 String enter=null; 
    
    /**
     * Creates new form LabRoleWorkArea
     */
    public LabRoleWorkArea(JPanel userProcessContainer,String org,String  location,String username,String net,String enter) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.org=org;
        this.location=location;
        this.username=username;
        this.net=net;
        this.enter=enter;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        ManageTestingBtn = new javax.swing.JButton();
        ManageVaccineBtn = new javax.swing.JButton();
        rightPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jSplitPane1.setDividerLocation(250);
        jSplitPane1.setDividerSize(1);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        ManageTestingBtn.setBackground(new java.awt.Color(255, 255, 255));
        ManageTestingBtn.setText("Manage Testing Requests");
        ManageTestingBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        ManageTestingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageTestingBtnActionPerformed(evt);
            }
        });

        ManageVaccineBtn.setBackground(new java.awt.Color(255, 255, 255));
        ManageVaccineBtn.setText("Manage Vaccine Requests");
        ManageVaccineBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        ManageVaccineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageVaccineBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ManageTestingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ManageVaccineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(ManageTestingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ManageVaccineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(504, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        rightPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightPanel.setPreferredSize(new java.awt.Dimension(1200, 700));
        rightPanel.setLayout(new java.awt.CardLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icon/Laboratory.gif"))); // NOI18N
        rightPanel.add(jLabel1, "card2");

        jSplitPane1.setRightComponent(rightPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1456, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSplitPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 728, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSplitPane1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ManageTestingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageTestingBtnActionPerformed
        // TODO add your handling code here:

        TestingJPanel TestingJPanel = new TestingJPanel(rightPanel,org,location,username,net,enter);
        rightPanel.add("TestingJPanel",TestingJPanel);
        CardLayout layout=(CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_ManageTestingBtnActionPerformed

    private void ManageVaccineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageVaccineBtnActionPerformed
        // TODO add your handling code here:
        
        VaccineJPanel VaccineJPanel = new VaccineJPanel(rightPanel, org,location,username,net,enter);
        rightPanel.add("VaccineJPanel",VaccineJPanel);
        CardLayout layout=(CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_ManageVaccineBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManageTestingBtn;
    private javax.swing.JButton ManageVaccineBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel rightPanel;
    // End of variables declaration//GEN-END:variables
}
