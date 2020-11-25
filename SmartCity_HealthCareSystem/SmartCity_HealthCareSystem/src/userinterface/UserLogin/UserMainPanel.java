/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.UserLogin;

import java.awt.CardLayout;

/**
 *
 * @author jshar
 */
public class UserMainPanel extends javax.swing.JPanel {

    /**
     * Creates new form UserMainPanel
     */
    public UserMainPanel() {
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

        jSplitPane1 = new javax.swing.JSplitPane();
        LeftPanel = new javax.swing.JPanel();
        lblHospital = new javax.swing.JLabel();
        lblMedicalServices = new javax.swing.JLabel();
        lblEmergency = new javax.swing.JLabel();
        lblCommunityServices = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        jSplitPane1.setDividerLocation(200);
        jSplitPane1.setDividerSize(1);

        LeftPanel.setBackground(new java.awt.Color(204, 204, 255));

        lblHospital.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHospital.setText("Hospital ");
        lblHospital.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblHospitalKeyPressed(evt);
            }
        });

        lblMedicalServices.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMedicalServices.setText("Medical Services");
        lblMedicalServices.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblMedicalServicesKeyPressed(evt);
            }
        });

        lblEmergency.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmergency.setText("Emergency");
        lblEmergency.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblEmergencyKeyPressed(evt);
            }
        });

        lblCommunityServices.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCommunityServices.setText("Community Services");
        lblCommunityServices.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCommunityServicesMousePressed(evt);
            }
        });

        javax.swing.GroupLayout LeftPanelLayout = new javax.swing.GroupLayout(LeftPanel);
        LeftPanel.setLayout(LeftPanelLayout);
        LeftPanelLayout.setHorizontalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHospital, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblMedicalServices, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblEmergency, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblCommunityServices, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
        );
        LeftPanelLayout.setVerticalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(lblHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmergency, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMedicalServices, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCommunityServices, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(LeftPanel);

        rightPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(rightPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblHospitalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblHospitalKeyPressed
        // TODO add your handling code here:
        UserHospitalOptionsPanel userHospitalOptionsPanel = new UserHospitalOptionsPanel(rightPanel);
        rightPanel.add("userHospitalOptionsPanel",userHospitalOptionsPanel);
        CardLayout layout=(CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
        
    }//GEN-LAST:event_lblHospitalKeyPressed

    private void lblEmergencyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblEmergencyKeyPressed
        // TODO add your handling code here:
        EmergencyJPanel emergencyJPanel = new EmergencyJPanel(rightPanel);
        rightPanel.add("emergencyJPanel",emergencyJPanel);
        CardLayout layout=(CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_lblEmergencyKeyPressed

    private void lblMedicalServicesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblMedicalServicesKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lblMedicalServicesKeyPressed

    private void lblCommunityServicesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCommunityServicesMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lblCommunityServicesMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LeftPanel;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblCommunityServices;
    private javax.swing.JLabel lblEmergency;
    private javax.swing.JLabel lblHospital;
    private javax.swing.JLabel lblMedicalServices;
    private javax.swing.JPanel rightPanel;
    // End of variables declaration//GEN-END:variables
}
