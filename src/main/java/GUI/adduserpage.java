/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JOptionPane;

import sakanat.user;

/**
 *
 * @author h-fat
 */
public class adduserpage extends javax.swing.JFrame {

    /**
     * Creates new form adduserpage
     */
    public adduserpage() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        addresstext = new javax.swing.JTextField();
        phonetext = new javax.swing.JTextField();
        emailtext = new javax.swing.JTextField();
        nametext = new javax.swing.JTextField();
        passwordtext = new javax.swing.JTextField();
        mounthcombobox = new javax.swing.JComboBox<>();
        yearcombobox = new javax.swing.JComboBox<>();
        typecombobox = new javax.swing.JComboBox<>();
        daycombobox = new javax.swing.JComboBox<>();
        gendercombobox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(530, 545));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add User");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(168, 40, 165, 52);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User name :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 110, 110, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Birth date : ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 300, 130, 40);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 150, 110, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Phone number :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 190, 160, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email address :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 230, 140, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 270, 130, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Gender :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 340, 100, 40);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Registion type :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 380, 170, 40);

        addresstext.setText("");
        jPanel1.add(addresstext);
        addresstext.setBounds(210, 150, 283, 32);

        phonetext.setText("");
        jPanel1.add(phonetext);
        phonetext.setBounds(210, 190, 283, 32);

        emailtext.setText("");
        jPanel1.add(emailtext);
        emailtext.setBounds(210, 230, 283, 32);

        nametext.setText("");
        jPanel1.add(nametext);
        nametext.setBounds(210, 110, 283, 32);

        passwordtext.setText("");
        jPanel1.add(passwordtext);
        passwordtext.setBounds(210, 270, 283, 32);

        mounthcombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mounth" }));
        jPanel1.add(mounthcombobox);
        mounthcombobox.setBounds(310, 310, 80, 32);
        for(Integer i=1;i<=12;i++){
        	mounthcombobox.addItem(i.toString());
        }

        yearcombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year" }));
        jPanel1.add(yearcombobox);
        yearcombobox.setBounds(400, 310, 94, 31);
        for(Integer i=2010 ; i>= 1950 ; i--){
            yearcombobox.addItem(i.toString());
        }

        typecombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tanent", "Owner", "Administrator" }));
        jPanel1.add(typecombobox);
        typecombobox.setBounds(210, 390, 150, 32);

        daycombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day" }));
        jPanel1.add(daycombobox);
        daycombobox.setBounds(210, 310, 80, 32);
        for(Integer i=1 ; i<=31 ; i++){
            daycombobox.addItem(i.toString());
        }

        gendercombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel1.add(gendercombobox);
        gendercombobox.setBounds(210, 350, 80, 32);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 450, 130, 50);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(350, 450, 150, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Back button
        // TODO add your handling code here:
    	
    	userspage u = new userspage();
    	this.setVisible(false);
    	u.setVisible(true);
    	
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Add button
        // TODO add your handling code here:
    	
    	try {
    	user u = new user(this.nametext.getText(),
    			          this.typecombobox.getSelectedItem().toString(),
    			          this.addresstext.getText(),
    			          this.phonetext.getText(),
    			          this.gendercombobox.getSelectedItem().toString(),
    			          this.emailtext.getText(),
    			          this.yearcombobox.getSelectedItem()+"-"+this.mounthcombobox.getSelectedItem()+"-"+this.daycombobox.getSelectedItem()
    			          );
    	user.adduser(u, this.passwordtext.getText());
    	}catch(Exception e) {
    		JOptionPane.showMessageDialog(addresstext, e);
    	}
    	JOptionPane.showMessageDialog(null, "User Added");
    	adduserpage a = new adduserpage();
    	this.setVisible(false);
    	a.setVisible(true);
    	
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(adduserpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adduserpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adduserpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adduserpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adduserpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> mounthcombobox;
    private javax.swing.JComboBox<String> typecombobox;
    private javax.swing.JComboBox<String> yearcombobox;
    private javax.swing.JComboBox<String> daycombobox;
    private javax.swing.JComboBox<String> gendercombobox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField addresstext;
    private javax.swing.JTextField phonetext;
    private javax.swing.JTextField emailtext;
    private javax.swing.JTextField nametext;
    private javax.swing.JTextField passwordtext;
    // End of variables declaration//GEN-END:variables
}
