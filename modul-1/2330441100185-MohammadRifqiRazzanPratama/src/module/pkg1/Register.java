/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package module.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
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

        Gender = new javax.swing.ButtonGroup();
        Addiction = new javax.swing.ButtonGroup();
        TOPLEFT = new javax.swing.JPanel();
        UCorp = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        FORM = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Birth = new javax.swing.JTextField();
        Address = new javax.swing.JTextField();
        Male = new javax.swing.JRadioButton();
        Fem = new javax.swing.JRadioButton();
        Email = new javax.swing.JTextField();
        Branch = new javax.swing.JComboBox<>();
        Roles = new javax.swing.JComboBox<>();
        Religion = new javax.swing.JComboBox<>();
        Yes = new javax.swing.JRadioButton();
        No = new javax.swing.JRadioButton();
        Check = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Addict = new javax.swing.JTextField();
        BUTTONS = new javax.swing.JPanel();
        SavDat = new javax.swing.JButton();
        ResDat = new javax.swing.JButton();
        Quit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TOPLEFT.setBackground(new java.awt.Color(0, 0, 0));
        TOPLEFT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 6));
        TOPLEFT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UCorp.setIcon(new javax.swing.ImageIcon("A:\\.MINE\\CHAPTER 3\\Visual Programming\\img\\UCorp3.png")); // NOI18N
        TOPLEFT.add(UCorp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon("A:\\.MINE\\CHAPTER 3\\Visual Programming\\img\\UCorp2.jpeg")); // NOI18N
        TOPLEFT.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 80));

        jLabel22.setFont(new java.awt.Font("The Texterius", 3, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("NO ADDRES/NUMBER");
        TOPLEFT.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 200, -1));

        jLabel24.setFont(new java.awt.Font("The Texterius", 3, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("We will inform you");
        TOPLEFT.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 180, 20));

        getContentPane().add(TOPLEFT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 290));

        FORM.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("The Texterius", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMISSION APPLICATION FORM");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("The Texterius", 0, 14)); // NOI18N
        jLabel2.setText("NAME");

        jLabel4.setFont(new java.awt.Font("The Texterius", 0, 14)); // NOI18N
        jLabel4.setText("DATE OF BIRTH");

        jLabel5.setFont(new java.awt.Font("The Texterius", 0, 14)); // NOI18N
        jLabel5.setText("ADDRESS");

        jLabel6.setFont(new java.awt.Font("The Texterius", 0, 14)); // NOI18N
        jLabel6.setText("GENDER");

        jLabel3.setFont(new java.awt.Font("The Texterius", 0, 14)); // NOI18N
        jLabel3.setText("E-MAIL");

        jLabel7.setFont(new java.awt.Font("The Texterius", 0, 14)); // NOI18N
        jLabel7.setText("BRANCH");

        jLabel8.setFont(new java.awt.Font("The Texterius", 0, 14)); // NOI18N
        jLabel8.setText("OCCUPATION/ROLES");

        jLabel9.setFont(new java.awt.Font("The Texterius", 0, 14)); // NOI18N
        jLabel9.setText("RELIGIOUS AFFILIATION");

        jLabel10.setFont(new java.awt.Font("The Texterius", 0, 14)); // NOI18N
        jLabel10.setText("ANY ADDICTIONS ?");

        jLabel11.setFont(new java.awt.Font("The Texterius", 0, 14)); // NOI18N
        jLabel11.setText("=");

        jLabel12.setText("=");

        jLabel13.setFont(new java.awt.Font("The Texterius", 0, 14)); // NOI18N
        jLabel13.setText("=");

        jLabel14.setFont(new java.awt.Font("The Texterius", 0, 14)); // NOI18N
        jLabel14.setText("=");

        jLabel15.setFont(new java.awt.Font("The Texterius", 0, 14)); // NOI18N
        jLabel15.setText("=");

        jLabel16.setFont(new java.awt.Font("The Texterius", 0, 14)); // NOI18N
        jLabel16.setText("=");

        jLabel17.setFont(new java.awt.Font("The Texterius", 0, 14)); // NOI18N
        jLabel17.setText("=");

        jLabel18.setFont(new java.awt.Font("The Texterius", 0, 14)); // NOI18N
        jLabel18.setText("=");

        jLabel19.setFont(new java.awt.Font("The Texterius", 0, 14)); // NOI18N
        jLabel19.setText("=");

        Gender.add(Male);
        Male.setText("MALE");

        Gender.add(Fem);
        Fem.setText("FEMALE");

        Branch.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Branch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "~CHOOSE ONE~", "Army Corps", "Marine Corps", "Navy", "Air Force" }));

        Roles.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Roles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "~CHOOSE ONE~", "Infantery", "Cyber Intelligence Specialist", "Field Artilerry Specialist", "Unit Supply Specialist", "Special Forces" }));

        Religion.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Religion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "~CHOOSE ONE~", "Islam", "Christian", "Buddhaism", "Hinduism", "Sikhism", "Atheist" }));

        Addiction.add(Yes);
        Yes.setText("YES");

        Addiction.add(No);
        No.setText("NO");

        Check.setFont(new java.awt.Font("The Texterius", 1, 12)); // NOI18N
        Check.setText("I'M SURE THAT I HAVE FILLED THIS FORM CORRECTLY AND READY TO FACE ANY RISK");
        Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("The Texterius", 0, 12)); // NOI18N
        jLabel20.setText("If yes, type in what addiction");

        jLabel21.setFont(new java.awt.Font("The Texterius", 0, 14)); // NOI18N
        jLabel21.setText("=");

        javax.swing.GroupLayout FORMLayout = new javax.swing.GroupLayout(FORM);
        FORM.setLayout(FORMLayout);
        FORMLayout.setHorizontalGroup(
            FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FORMLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(FORMLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(jLabel19)
                .addGap(6, 6, 6)
                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(FORMLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addGap(73, 73, 73)
                .addComponent(jLabel18)
                .addGap(6, 6, 6)
                .addComponent(Birth, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(FORMLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(jLabel17)
                .addGap(6, 6, 6)
                .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(FORMLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel6)
                .addGap(121, 121, 121)
                .addComponent(jLabel16)
                .addGap(41, 41, 41)
                .addComponent(Male, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(Fem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(FORMLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addGap(130, 130, 130)
                .addComponent(jLabel15)
                .addGap(6, 6, 6)
                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(FORMLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel7)
                .addGap(119, 119, 119)
                .addComponent(jLabel14)
                .addGap(6, 6, 6)
                .addComponent(Branch, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(FORMLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel8)
                .addGap(40, 40, 40)
                .addComponent(jLabel13)
                .addGap(6, 6, 6)
                .addComponent(Roles, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(FORMLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(6, 6, 6)
                .addComponent(Religion, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(FORMLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel10)
                .addGap(51, 51, 51)
                .addComponent(jLabel12)
                .addGap(41, 41, 41)
                .addComponent(Yes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(No, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(FORMLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Addict, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(FORMLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Check))
        );
        FORMLayout.setVerticalGroup(
            FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FORMLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FORMLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel19))))
                .addGap(18, 18, 18)
                .addGroup(FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Birth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FORMLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel18))))
                .addGap(18, 18, 18)
                .addGroup(FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FORMLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel17))))
                .addGap(18, 18, 18)
                .addGroup(FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Male)
                    .addComponent(Fem)
                    .addGroup(FORMLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel16))))
                .addGap(18, 18, 18)
                .addGroup(FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FORMLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel15))))
                .addGap(18, 18, 18)
                .addGroup(FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Branch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FORMLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel14))))
                .addGap(18, 18, 18)
                .addGroup(FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Roles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FORMLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel13))))
                .addGap(18, 18, 18)
                .addGroup(FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Religion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FORMLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))))
                .addGap(18, 18, 18)
                .addGroup(FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FORMLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel10))
                    .addGroup(FORMLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel12))
                    .addComponent(Yes)
                    .addComponent(No))
                .addGap(7, 7, 7)
                .addGroup(FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FORMLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel20))
                    .addGroup(FORMLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel21))
                    .addComponent(Addict, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(Check))
        );

        getContentPane().add(FORM, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, -10, 560, 550));

        BUTTONS.setBackground(new java.awt.Color(222, 10, 28));
        BUTTONS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 5));

        SavDat.setFont(new java.awt.Font("The Texterius", 0, 18)); // NOI18N
        SavDat.setText("SAVE DATA");
        SavDat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavDatActionPerformed(evt);
            }
        });

        ResDat.setFont(new java.awt.Font("The Texterius", 0, 18)); // NOI18N
        ResDat.setText("RESET DATA");
        ResDat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResDatActionPerformed(evt);
            }
        });

        Quit.setFont(new java.awt.Font("The Texterius", 0, 18)); // NOI18N
        Quit.setText("EXIT ");
        Quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BUTTONSLayout = new javax.swing.GroupLayout(BUTTONS);
        BUTTONS.setLayout(BUTTONSLayout);
        BUTTONSLayout.setHorizontalGroup(
            BUTTONSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BUTTONSLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(BUTTONSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ResDat, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(SavDat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Quit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        BUTTONSLayout.setVerticalGroup(
            BUTTONSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BUTTONSLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SavDat, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(ResDat, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Quit, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        getContentPane().add(BUTTONS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 270, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SavDatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavDatActionPerformed
        String tfname=Name.getText();
        if(tfname.length()==0){
            System.out.println("You need to fill this JTextField");
        } 
        SavDat.setEnabled(false);
         Form form =new Form ();
         Form.name.setText(Register.Name.getText());
         Form.birth.setText(Register.Birth.getText());
         Form.address.setText(Register.Address.getText());
         Form.email.setText(Register.Email.getText());
         Form.branch.setText(Register.Branch.getSelectedItem().toString());
         Form.roles.setText(Register.Roles.getSelectedItem().toString());
         Form.religion.setText(Register.Religion.getSelectedItem().toString());   
         
         if(Register.Addict.getText().isEmpty()){
             Form.desc.setText("NO ADDICTIONS");
         }else{
             Form.desc.setText(Register.Addict.getText());
         }
         
         if (Male.isSelected()==true){
             Form.gender.setText("Male");
         }else if(Fem.isSelected()==true){
             Form.gender.setText("Female");
         }
         
         if (Yes.isSelected()==true){
             Form.addiction.setText("Yes");
         }else if(No.isSelected()==true){
             Form.addiction.setText("No");
         }       
         
          if (!Check.isSelected()) {
            JOptionPane.showMessageDialog(this, "Please Check the Checkbox first before forwarding...", "WARNING !!!", JOptionPane.WARNING_MESSAGE);
        } else { 
            form.setVisible(true);
        }
    }//GEN-LAST:event_SavDatActionPerformed
    private void ClearAll(){
        Name.setText(null);
        Birth.setText(null);
        Address.setText(null);
        Gender.clearSelection();
        Email.setText(null);
        Branch.setSelectedIndex(0);
        Roles.setSelectedIndex(0);
        Religion.setSelectedIndex(0);
        Addiction.clearSelection();
        Addict.setText(null);
        Check.setSelected(false);
    }
    private void ResDatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResDatActionPerformed
        ClearAll();
    }//GEN-LAST:event_ResDatActionPerformed

    private void QuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_QuitActionPerformed

    private void CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckActionPerformed
         if (Check.isSelected()==false){
            SavDat.setEnabled(false);
        } else if (Check.isSelected()==true){
            SavDat.setEnabled(true);
        }
    }//GEN-LAST:event_CheckActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField Addict;
    public javax.swing.ButtonGroup Addiction;
    public static javax.swing.JTextField Address;
    private javax.swing.JPanel BUTTONS;
    public static javax.swing.JTextField Birth;
    public static javax.swing.JComboBox<String> Branch;
    private javax.swing.JCheckBox Check;
    public static javax.swing.JTextField Email;
    private javax.swing.JPanel FORM;
    public static javax.swing.JRadioButton Fem;
    public javax.swing.ButtonGroup Gender;
    public static javax.swing.JRadioButton Male;
    public static javax.swing.JTextField Name;
    private javax.swing.JRadioButton No;
    private javax.swing.JButton Quit;
    public static javax.swing.JComboBox<String> Religion;
    private javax.swing.JButton ResDat;
    public static javax.swing.JComboBox<String> Roles;
    private javax.swing.JButton SavDat;
    private javax.swing.JPanel TOPLEFT;
    private javax.swing.JLabel UCorp;
    public static javax.swing.JRadioButton Yes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
