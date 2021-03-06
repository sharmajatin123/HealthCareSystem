/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CovidRole;

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
 * @author jshar
 */
public class CovidWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise enterprise;
    Network network;
    OrganizationDirectory directory;
    EcoSystem system;
    UserAccount account;
    Organization organization;
    String name=null;
    String pass=null;
    String covid_net=null;
    String covid_enter=null;
    /**
     * Creates new form CovidWorkAreaJPanel
     */
    public CovidWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem system, OrganizationDirectory organizationDirectory,String name,String pass,String covid_net,String covid_enter) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.directory = directory;
        this.enterprise = enterprise;
        this.network = network;
        this.system = system;
        this.organization = organization;
        this.name=name;
        this.pass=pass;
        this.covid_net=covid_net;
        this.covid_enter=covid_enter;
        
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
        btnManageCovid = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        rightPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jSplitPane1.setDividerLocation(200);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        btnManageCovid.setBackground(new java.awt.Color(255, 255, 255));
        btnManageCovid.setText("Manage Covid Center");
        btnManageCovid.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        btnManageCovid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCovidActionPerformed(evt);
            }
        });

        btnCreate.setBackground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create Test Result");
        btnCreate.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCreate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageCovid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(btnManageCovid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(528, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        rightPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightPanel.setLayout(new java.awt.CardLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icon/emerging_testing_technologies_offer_potentially_s.jpeg"))); // NOI18N
        rightPanel.add(jLabel1, "card2");

        jSplitPane1.setRightComponent(rightPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageCovidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCovidActionPerformed
      
        CovidManageJPanel covidManageJPanel = new CovidManageJPanel(rightPanel,name,pass,covid_net,covid_enter);
        rightPanel.add("covidManageJPanel",covidManageJPanel);
        CardLayout layout=(CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);

    }//GEN-LAST:event_btnManageCovidActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        CovidCreateResultJPanel covidCreateResultJPanel = new CovidCreateResultJPanel(rightPanel,name,pass,covid_net,covid_enter);
        rightPanel.add("covidCreateResultJPanel",covidCreateResultJPanel);
        CardLayout layout=(CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_btnCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnManageCovid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel rightPanel;
    // End of variables declaration//GEN-END:variables
}
