/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencevoyage.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import agencevoyage.model.User;

/**
 *
 * @author UTILISATEUR
 */
public class AgencyContactScreen extends javax.swing.JPanel {

    private JPanel contentPane;
    private JFrame currentframe;
    /**
     * Creates new form UserContact
     */
    public AgencyContactScreen(JPanel panel, JFrame frame) {
        contentPane = panel;
        currentframe = frame;
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

        email_lbl = new javax.swing.JLabel();
        phone_lbl = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        previous = new javax.swing.JButton();

        email_lbl.setText("Email");

        phone_lbl.setText("Téléphone");

        email.setText("voyage-de-ouf@gmail.com");

        phone.setText("008 50 23 200");

        jLabel1.setText("Contact");

        previous.setText("Retour");
        previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(previous)
                        .addGap(153, 153, 153))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(phone_lbl)
                            .addComponent(email_lbl))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email)
                            .addComponent(phone))
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(166, 166, 166))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_lbl)
                    .addComponent(email))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phone_lbl)
                    .addComponent(phone))
                .addGap(42, 42, 42)
                .addComponent(previous)
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousActionPerformed
        currentframe.getContentPane().removeAll();
        DisplayScreen displayer_screen = new DisplayScreen(
                contentPane, 
                currentframe
        );
        currentframe.getContentPane().add(displayer_screen);
        currentframe.getContentPane().validate();
    }//GEN-LAST:event_previousActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel email;
    private javax.swing.JLabel email_lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel phone;
    private javax.swing.JLabel phone_lbl;
    private javax.swing.JButton previous;
    // End of variables declaration//GEN-END:variables
}
