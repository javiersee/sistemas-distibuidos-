/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteHabitacion.vistas;

import servidorAlertas.dto.nodo_indicadoresDTO;

/**
 *
 * @author Usuario
 */
public class gui_indicadoresGenerados extends javax.swing.JFrame {

    /**
     * Creates new form gui_indicadoresGenerados
     */
    public gui_indicadoresGenerados() {
        setLocation(450, 50);  
        setTitle("Indicadores Generados");
        initComponents();
    }
    
    public void  enviar_indicadores(nodo_indicadoresDTO nodo){
    
        jTextFrecuenciaCardiaca.setText(String.valueOf(nodo.getFrecuenciaCardiaca()));
        jTextFrecuenciaRespiratoria.setText(String.valueOf(nodo.getFrecuenciaRespiratoria()));
        jTextPresionArterial.setText(String.valueOf(nodo.getPresionArterialSistolica()));
        jTextSaturacion.setText(String.valueOf(nodo.getSaturacionOxigeno()));
        jTextTemperatura.setText(String.valueOf(nodo.temperatura));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFrecuenciaCardiaca = new javax.swing.JTextField();
        jTextPresionArterial = new javax.swing.JTextField();
        jTextFrecuenciaRespiratoria = new javax.swing.JTextField();
        jTextTemperatura = new javax.swing.JTextField();
        jTextSaturacion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enviando Indicadores...");
        jLabel1.setName("jlIndicadores"); // NOI18N

        jLabel2.setText("Frecuencia Cardiaca: ");
        jLabel2.setName("jlFreCard"); // NOI18N

        jLabel3.setText("Presion Arterial: ");
        jLabel3.setName("jlPresion"); // NOI18N

        jLabel4.setText("Frecuencia Respiratoria:");
        jLabel4.setName("jlFreRespi"); // NOI18N

        jLabel5.setText("Temperatura: ");
        jLabel5.setName("jlTempe"); // NOI18N

        jLabel6.setText("Saturacion de Oxigeno: ");
        jLabel6.setName("jlSatOxig"); // NOI18N

        jTextFrecuenciaCardiaca.setEditable(false);
        jTextFrecuenciaCardiaca.setBackground(new java.awt.Color(0, 204, 204));
        jTextFrecuenciaCardiaca.setName("tfFreCar"); // NOI18N
        jTextFrecuenciaCardiaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFrecuenciaCardiacaActionPerformed(evt);
            }
        });

        jTextPresionArterial.setEditable(false);
        jTextPresionArterial.setBackground(new java.awt.Color(0, 204, 204));
        jTextPresionArterial.setName("tfPreArt"); // NOI18N

        jTextFrecuenciaRespiratoria.setEditable(false);
        jTextFrecuenciaRespiratoria.setBackground(new java.awt.Color(0, 204, 204));
        jTextFrecuenciaRespiratoria.setName("tfFreRes"); // NOI18N

        jTextTemperatura.setEditable(false);
        jTextTemperatura.setBackground(new java.awt.Color(0, 204, 204));
        jTextTemperatura.setName("tfTem"); // NOI18N

        jTextSaturacion.setEditable(false);
        jTextSaturacion.setBackground(new java.awt.Color(0, 204, 204));
        jTextSaturacion.setName("tfSatOxi"); // NOI18N
        jTextSaturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSaturacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFrecuenciaCardiaca, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFrecuenciaRespiratoria, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextPresionArterial, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextSaturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFrecuenciaCardiaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPresionArterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFrecuenciaRespiratoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextSaturacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName("jlIndicadores");
        jLabel2.getAccessibleContext().setAccessibleName("jlFreCard");
        jLabel3.getAccessibleContext().setAccessibleName("jlPresion");
        jLabel4.getAccessibleContext().setAccessibleName("jlFreRespi");
        jLabel5.getAccessibleContext().setAccessibleName("jlTempe");
        jLabel6.getAccessibleContext().setAccessibleName("jlSatOxig");
        jTextFrecuenciaCardiaca.getAccessibleContext().setAccessibleName("tfFreCar");
        jTextPresionArterial.getAccessibleContext().setAccessibleName("tfPreArt");
        jTextFrecuenciaRespiratoria.getAccessibleContext().setAccessibleName("tfFreRes");
        jTextTemperatura.getAccessibleContext().setAccessibleName("tfTem");
        jTextSaturacion.getAccessibleContext().setAccessibleName("tfSatOxi");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextSaturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSaturacionActionPerformed
        
    }//GEN-LAST:event_jTextSaturacionActionPerformed

    private void jTextFrecuenciaCardiacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFrecuenciaCardiacaActionPerformed
    
    }//GEN-LAST:event_jTextFrecuenciaCardiacaActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextFrecuenciaCardiaca;
    private javax.swing.JTextField jTextFrecuenciaRespiratoria;
    private javax.swing.JTextField jTextPresionArterial;
    private javax.swing.JTextField jTextSaturacion;
    private javax.swing.JTextField jTextTemperatura;
    // End of variables declaration//GEN-END:variables

    
}
