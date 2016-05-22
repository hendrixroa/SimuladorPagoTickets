/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaz;
import Controladora.Controladora;
import javax.swing.JOptionPane;

public class I_Efectivo extends javax.swing.JFrame {

  
    private double montoActual=0;
    private double monto_final=0;
   private final Controladora Control;
    public I_Efectivo(Controladora ctrl,double monto_actual,double monto_final)
    {
        Control=ctrl;
        montoActual=monto_actual;
        this.monto_final = monto_final;
    }
    
   
    
    public void I_EfectivoMostrar(double monto){
        montoActual=monto;
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        String mon = Double.toString(montoActual);
        MontoAmostrar.setText(mon);
       
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotonesBilletes = new javax.swing.ButtonGroup();
        grupoBotonesMonedas = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        RadioButton2bs = new javax.swing.JRadioButton();
        RadioButton5bs = new javax.swing.JRadioButton();
        RadioButton10bs = new javax.swing.JRadioButton();
        RadioButton20bs = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        RadioButton1bs = new javax.swing.JRadioButton();
        RadioButton0_5bs = new javax.swing.JRadioButton();
        BotonCancelar = new javax.swing.JButton();
        BotonOk = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        MontoAmostrar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Ingrese Efectivo");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Billetes: ");

        grupoBotonesBilletes.add(RadioButton2bs);
        RadioButton2bs.setText("2 Bs.");
        RadioButton2bs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButton2bsActionPerformed(evt);
            }
        });

        grupoBotonesBilletes.add(RadioButton5bs);
        RadioButton5bs.setText("5 Bs.");

        grupoBotonesBilletes.add(RadioButton10bs);
        RadioButton10bs.setText("10 Bs.");
        RadioButton10bs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButton10bsActionPerformed(evt);
            }
        });

        grupoBotonesBilletes.add(RadioButton20bs);
        RadioButton20bs.setText("20 Bs.");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Monedas:");

        grupoBotonesMonedas.add(RadioButton1bs);
        RadioButton1bs.setText("1  Bs.");
        RadioButton1bs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButton1bsActionPerformed(evt);
            }
        });

        grupoBotonesMonedas.add(RadioButton0_5bs);
        RadioButton0_5bs.setText("0,5 Bs.");

        BotonCancelar.setText("Cancelar");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });

        BotonOk.setText("Aceptar");
        BotonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonOkActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Monto Actual:");

        MontoAmostrar.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(MontoAmostrar)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(BotonOk)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                        .addComponent(BotonCancelar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(RadioButton0_5bs)
                                            .addComponent(RadioButton5bs)
                                            .addComponent(RadioButton2bs)
                                            .addComponent(RadioButton10bs)
                                            .addComponent(RadioButton1bs)
                                            .addComponent(RadioButton20bs))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1)))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButton2bs)
                    .addComponent(MontoAmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RadioButton5bs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RadioButton10bs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RadioButton20bs)
                .addGap(7, 7, 7)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButton1bs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButton0_5bs)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonCancelar)
                    .addComponent(BotonOk))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RadioButton2bsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButton2bsActionPerformed
       
    }//GEN-LAST:event_RadioButton2bsActionPerformed

    private void RadioButton10bsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButton10bsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioButton10bsActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        
        if(montoActual==0.0){
        Control.SeleccionBotonesEfectivo(2,0.0,0.0);
        dispose();
        }
        if(montoActual > 0.0){
        Control.SeleccionBotonesEfectivo(3,montoActual,0.0);
        dispose();
        }
        
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void BotonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonOkActionPerformed
       //boton ok
      //   rolControl.SeleccionBotonesEfectivo(1);
     if(RadioButton0_5bs.isSelected()){
         montoActual = montoActual + 0.5;   
     }
     if(RadioButton1bs.isSelected()){
         montoActual = montoActual + 1.0; 
     }
     if(RadioButton2bs.isSelected()){
         montoActual = montoActual + 2.0; 
     }
     if(RadioButton5bs.isSelected()){
         montoActual = montoActual + 5.0; 
     }
     if(RadioButton10bs.isSelected()){
         montoActual = montoActual + 10.0; 
     }
     if(RadioButton20bs.isSelected()){
         montoActual = montoActual + 20.0; 
     }
     
    String mon = Double.toString(montoActual);
    MontoAmostrar.setText(mon);
     Control.SeleccionBotonesEfectivo(1,montoActual,monto_final);
        dispose();
    }//GEN-LAST:event_BotonOkActionPerformed

    private void RadioButton1bsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButton1bsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioButton1bsActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonOk;
    private javax.swing.JTextField MontoAmostrar;
    private javax.swing.JRadioButton RadioButton0_5bs;
    private javax.swing.JRadioButton RadioButton10bs;
    private javax.swing.JRadioButton RadioButton1bs;
    private javax.swing.JRadioButton RadioButton20bs;
    private javax.swing.JRadioButton RadioButton2bs;
    private javax.swing.JRadioButton RadioButton5bs;
    private javax.swing.ButtonGroup grupoBotonesBilletes;
    private javax.swing.ButtonGroup grupoBotonesMonedas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
