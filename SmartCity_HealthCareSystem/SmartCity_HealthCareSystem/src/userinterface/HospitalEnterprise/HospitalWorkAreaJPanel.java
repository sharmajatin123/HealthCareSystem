/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HospitalEnterprise;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author seemin
 */
public class HospitalWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Enterprise enterprise;
    Network network;
    OrganizationDirectory directory;
    EcoSystem system;
    UserAccount account;
    Organization organization;
    
//    public HospitalWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
//        initComponents();
//        this.account = account;
//        this.organization = organization;
//        this.enterprise = enterprise;
//        this.network = network;
//        this.system = system;
//        
//        }
    public HospitalWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;

       // valueLabel.setText(enterprise.getName());
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
        jPanel1 = new javax.swing.JPanel();
        ManageOrganizationBtn = new javax.swing.JButton();
        ManageDoctorsBtn = new javax.swing.JButton();
        ManageCovidCareBtn = new javax.swing.JButton();
        rightPanel = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1400, 700));

        jSplitPane1.setDividerLocation(250);
        jSplitPane1.setDividerSize(1);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        ManageOrganizationBtn.setBackground(new java.awt.Color(255, 255, 255));
        ManageOrganizationBtn.setText("Manage All Organizations");
        ManageOrganizationBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        ManageOrganizationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageOrganizationBtnActionPerformed(evt);
            }
        });

        ManageDoctorsBtn.setBackground(new java.awt.Color(255, 255, 255));
        ManageDoctorsBtn.setText("Manage Doctors");
        ManageDoctorsBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        ManageDoctorsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageDoctorsBtnActionPerformed(evt);
            }
        });

        ManageCovidCareBtn.setBackground(new java.awt.Color(255, 255, 255));
        ManageCovidCareBtn.setText("Manage Covid Care");
        ManageCovidCareBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        ManageCovidCareBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageCovidCareBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ManageDoctorsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ManageCovidCareBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ManageOrganizationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(ManageOrganizationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ManageDoctorsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ManageCovidCareBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        rightPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightPanel.setPreferredSize(new java.awt.Dimension(1200, 700));
        rightPanel.setLayout(new java.awt.CardLayout());
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

    private void ManageOrganizationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageOrganizationBtnActionPerformed
        // TODO add your handling code here:
        

        ManageOrganizationJPanel ManageOrganizationJPanel=new ManageOrganizationJPanel(rightPanel);

       /// ManageOrganizationJPanel ManageOrganizationJPanel=new ManageOrganizationJPanel(rightPanel,system, organization,  network, enterprise, account, directory);

        rightPanel.add("ManageOrganizationJPanel",ManageOrganizationJPanel);
        CardLayout layout=(CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
        
    }//GEN-LAST:event_ManageOrganizationBtnActionPerformed

    private void ManageDoctorsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageDoctorsBtnActionPerformed
        // TODO add your handling code here:
  
       // CreateDoctorJPanel = new CreateDoctorJPanel(rightPanel,system, organization,  network, enterprise, account);
       
        CreateDoctorJPanel createDoctorJPanel = new CreateDoctorJPanel(rightPanel);
        rightPanel.add("CreateDoctorJPanel",createDoctorJPanel);
        CardLayout layout=(CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_ManageDoctorsBtnActionPerformed

    private void ManageCovidCareBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageCovidCareBtnActionPerformed
        // TODO add your handling code here:
       // CreateCovidJPanel CreateCovidJPanel=new CreateCovidJPanel(rightPanel,system, organization,  network, enterprise, account);
       
        CreateCovidJPanel createCovidJPanel = new CreateCovidJPanel(rightPanel);
        rightPanel.add("CreateCovidJPanel", createCovidJPanel);
        CardLayout layout=(CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_ManageCovidCareBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManageCovidCareBtn;
    private javax.swing.JButton ManageDoctorsBtn;
    private javax.swing.JButton ManageOrganizationBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel rightPanel;
    // End of variables declaration//GEN-END:variables
}
