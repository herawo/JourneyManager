/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencevoyage.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import agencevoyage.model.JourneyManager;
import agencevoyage.model.Journey;
import agencevoyage.model.UserManager;

/**
 *
 * @author UTILISATEUR
 */
public class AddJourneyScreen extends javax.swing.JPanel {
    
    private JPanel contentPane;
    private JFrame currentframe;
    /**
     * Creates new form AddCar
     */
    public AddJourneyScreen(JPanel panel, JFrame frame) {
        contentPane = panel;
        currentframe = frame;
        initComponents();
        incorrect_lbl.setVisible(false);
        missing_info_lbl.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        screen_title = new javax.swing.JLabel();
        brand_lbl = new javax.swing.JLabel();
        model_lbl = new javax.swing.JLabel();
        price_lbl = new javax.swing.JLabel();
        brand = new javax.swing.JTextField();
        model = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        Valider = new javax.swing.JButton();
        incorrect_lbl = new javax.swing.JLabel();
        missing_info_lbl = new javax.swing.JLabel();

        screen_title.setText("Ajouter un voyage");

        brand_lbl.setText("Pays");

        model_lbl.setText("Ville");

        price_lbl.setText("Prix");

        brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandActionPerformed(evt);
            }
        });

        Valider.setText("Valider");
        Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValiderActionPerformed(evt);
            }
        });

        incorrect_lbl.setForeground(new java.awt.Color(255, 0, 0));
        incorrect_lbl.setText("incorrect");

        missing_info_lbl.setForeground(new java.awt.Color(255, 0, 0));
        missing_info_lbl.setText("Information manquantes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(missing_info_lbl)
                        .addGap(18, 18, 18)
                        .addComponent(Valider))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(156, 156, 156)
                            .addComponent(screen_title))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(55, 55, 55)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(brand_lbl)
                                .addComponent(model_lbl)
                                .addComponent(price_lbl))
                            .addGap(80, 80, 80)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(price)
                                .addComponent(model)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addGap(18, 18, 18)
                .addComponent(incorrect_lbl)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(screen_title)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brand_lbl)
                    .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(model_lbl)
                    .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price_lbl)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(incorrect_lbl))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Valider)
                    .addComponent(missing_info_lbl))
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void brandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandActionPerformed

    private void ValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValiderActionPerformed
        JourneyManager displayer = JourneyManager.getInstance();

        if(
                model.getText().equals("") ||
                brand.getText().equals("") ||
                price.getText().equals("")
                ){
            missing_info_lbl.setVisible(true);
            return;
        }
        try{
            displayer.addNewCar(new Journey(
                            model.getText(),
                            brand.getText(),
                            Double.parseDouble(price.getText()),
                            10
                    )
                
            );
        }catch(NumberFormatException e){
            incorrect_lbl.setVisible(true);
            return;
        }
        currentframe.getContentPane().removeAll();
        DisplayScreen displayer_screen = new DisplayScreen(
                contentPane,
                currentframe
        );
        currentframe.getContentPane().add(displayer_screen);
        currentframe.getContentPane().validate();
    }//GEN-LAST:event_ValiderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Valider;
    private javax.swing.JTextField brand;
    private javax.swing.JLabel brand_lbl;
    private javax.swing.JLabel incorrect_lbl;
    private javax.swing.JLabel missing_info_lbl;
    private javax.swing.JTextField model;
    private javax.swing.JLabel model_lbl;
    private javax.swing.JTextField price;
    private javax.swing.JLabel price_lbl;
    private javax.swing.JLabel screen_title;
    // End of variables declaration//GEN-END:variables
}