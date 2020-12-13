/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.UserEnterprise;

import java.awt.CardLayout;
import javax.swing.JPanel;
import Business.EcoSystem;

/**
 *
 * @author jshar
 */
public class UserRoleWorkAreaJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    String f_name=null;
            String l_name=null;
            String gender=null;
            String address=null;
            String email=null;
            String phone=null;
            String blood=null;
            String weight=null;
            String height=null;
            String username=null;
            String age=null;
            byte[] finalfile = null;
    /**
     * Creates new form UserMainPanel
     */
    public UserRoleWorkAreaJPanel(JPanel userProcessContainer,String f_name,String l_name,String gender,String address,String email,String phone,String blood,String weight,String height,String username,String age,byte[] finalfile) {
        initComponents();

        this.ecosystem = ecosystem;
        this.f_name=f_name;
        this.l_name=l_name;
        this.gender=gender;
        this.address=address;
        this.email=email;
        this.phone=phone;
        this.blood=blood;
        this.weight=weight;
        this.height=height;
        this.username=username;
        this.age=age;
        this.finalfile = finalfile;
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
        EmergencyServicesBtn = new javax.swing.JButton();
        HospitalServicesBtn = new javax.swing.JButton();
        MedicalServicesBtn = new javax.swing.JButton();
        UpdateUserProfileBtn = new javax.swing.JButton();
        rightPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jSplitPane1.setDividerLocation(200);
        jSplitPane1.setDividerSize(1);

        LeftPanel.setBackground(new java.awt.Color(0, 153, 153));

        EmergencyServicesBtn.setBackground(new java.awt.Color(255, 255, 255));
        EmergencyServicesBtn.setText("Emergency Services");
        EmergencyServicesBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        EmergencyServicesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmergencyServicesBtnActionPerformed(evt);
            }
        });

        HospitalServicesBtn.setBackground(new java.awt.Color(255, 255, 255));
        HospitalServicesBtn.setText("Hospital Services");
        HospitalServicesBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        HospitalServicesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HospitalServicesBtnActionPerformed(evt);
            }
        });

        MedicalServicesBtn.setBackground(new java.awt.Color(255, 255, 255));
        MedicalServicesBtn.setText("Medical Services");
        MedicalServicesBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        MedicalServicesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicalServicesBtnActionPerformed(evt);
            }
        });

        UpdateUserProfileBtn.setBackground(new java.awt.Color(255, 255, 255));
        UpdateUserProfileBtn.setText("Update User Profile");
        UpdateUserProfileBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        UpdateUserProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateUserProfileBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftPanelLayout = new javax.swing.GroupLayout(LeftPanel);
        LeftPanel.setLayout(LeftPanelLayout);
        LeftPanelLayout.setHorizontalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmergencyServicesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HospitalServicesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MedicalServicesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateUserProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LeftPanelLayout.setVerticalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(HospitalServicesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EmergencyServicesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MedicalServicesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UpdateUserProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(406, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(LeftPanel);

        rightPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightPanel.setLayout(new java.awt.CardLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icon/User login.gif"))); // NOI18N
        rightPanel.add(jLabel2, "card2");

        jSplitPane1.setRightComponent(rightPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1345, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void EmergencyServicesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmergencyServicesBtnActionPerformed
        // TODO add your handling code here:
        System.out.println("AAAAAAAAAAAAAA");
        EmergencyJPanel EmergencyJPanel=new EmergencyJPanel(rightPanel,f_name,l_name,gender,address,email,phone,blood,weight,height,username,age);
        System.out.println("BBBBBBBBB");
        rightPanel.add("EmergencyJPanel",EmergencyJPanel);
        System.out.println("CCCCCCCCCCC");
        CardLayout layout=(CardLayout)rightPanel.getLayout();
        System.out.println("DDDDDDDDDDDDDD");
        layout.next(rightPanel);
        System.out.println("EEEEEEEEEEEEE");
    }//GEN-LAST:event_EmergencyServicesBtnActionPerformed

    private void HospitalServicesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HospitalServicesBtnActionPerformed
        // TODO add your handling code here:
        HospitalServicesJPanel UserHospitalOptionsPanel=new HospitalServicesJPanel(rightPanel,f_name,l_name,gender,address,email,phone,blood,weight,height,username,age);
        rightPanel.add("UserHospitalOptionsPanel",UserHospitalOptionsPanel);
        CardLayout layout=(CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_HospitalServicesBtnActionPerformed

    private void MedicalServicesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicalServicesBtnActionPerformed
        // TODO add your handling code here:
        MedicalServicesJPanel medicalServicesJPanel=new MedicalServicesJPanel(rightPanel,f_name,l_name,gender,address,email,phone,blood,weight,height,username,age);
        rightPanel.add("EmergencyJPanel",medicalServicesJPanel);
        CardLayout layout=(CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_MedicalServicesBtnActionPerformed

    private void UpdateUserProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateUserProfileBtnActionPerformed
        // TODO add your handling code here:
        UpdateProfileJPanel UpdateProfileJPanel=new UpdateProfileJPanel(rightPanel,f_name,l_name,gender,address,email,phone,blood,weight,height,username,age,finalfile);
        rightPanel.add("UpdateProfileJPanel",UpdateProfileJPanel);
        CardLayout layout=(CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_UpdateUserProfileBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EmergencyServicesBtn;
    private javax.swing.JButton HospitalServicesBtn;
    private javax.swing.JPanel LeftPanel;
    private javax.swing.JButton MedicalServicesBtn;
    private javax.swing.JButton UpdateUserProfileBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel rightPanel;
    // End of variables declaration//GEN-END:variables
}
