/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorNotificaciones.presentacion;

/**
 *
 * @author Usuario
 */
public class generacionAlerta extends javax.swing.JFrame {

    /**
     * Creates new form generacionAlerta
     */
    public generacionAlerta() {
        setLocation(750, 50);
        setTitle("Alerta Generada");
        initComponents();
    }
    
    public void imprimirNotificacion( int habitacion,String nombre,float edad,String hora,String fecha,String mensajealerta,
            int puntuacion,String mensaje,String mensaje5alertas){
    
    jTextNumHabitacion.setText(String.valueOf(habitacion));
    jTextNombreyApellido.setText(nombre);
    jTextEdad.setText(String.valueOf(edad));
    jTextHora.setText(hora);
    jTextFecha.setText(fecha);
    jTextobservacion.setText(mensajealerta);
    jTextMensaje.setText(mensaje);
    jTextUltimas5.setText(mensaje5alertas);
    
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextNumHabitacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextNombreyApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextEdad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextHora = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFecha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextobservacion = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextMensaje = new javax.swing.JTextPane();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextUltimas5 = new javax.swing.JTextPane();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frameNotificaciones"); // NOI18N

        jlTitulo.setForeground(new java.awt.Color(255, 0, 0));
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("Alerta Generada");
        jlTitulo.setName("jltitulo"); // NOI18N

        jLabel2.setText("No Habitacion: ");
        jLabel2.setName("jlNumHabita"); // NOI18N

        jTextNumHabitacion.setEditable(false);
        jTextNumHabitacion.setBackground(new java.awt.Color(51, 255, 204));
        jTextNumHabitacion.setName("TfNumHabita"); // NOI18N

        jLabel3.setText("nombres y apellios: ");
        jLabel3.setName("jlNombre"); // NOI18N

        jTextNombreyApellido.setEditable(false);
        jTextNombreyApellido.setBackground(new java.awt.Color(0, 255, 204));
        jTextNombreyApellido.setName("tfNombre"); // NOI18N
        jTextNombreyApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreyApellidoActionPerformed(evt);
            }
        });

        jLabel4.setText("Edad");
        jLabel4.setName("jlEdad"); // NOI18N

        jTextEdad.setEditable(false);
        jTextEdad.setBackground(new java.awt.Color(0, 255, 204));
        jTextEdad.setName("tfEdad"); // NOI18N

        jLabel5.setText("Hora de la Alerta: ");
        jLabel5.setName("jlHoraAler"); // NOI18N

        jTextHora.setEditable(false);
        jTextHora.setBackground(new java.awt.Color(0, 255, 204));
        jTextHora.setName("tfHoraAler"); // NOI18N

        jLabel6.setText("Fecha de la Alerta: ");
        jLabel6.setName("jlFechaAlert"); // NOI18N

        jTextFecha.setEditable(false);
        jTextFecha.setBackground(new java.awt.Color(0, 255, 204));
        jTextFecha.setName("tfFechaAlert"); // NOI18N

        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Indicadores que Generaron la Alerta");
        jLabel7.setName("jlIndicadores"); // NOI18N

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Nombre del Indicador");
        jLabel8.setName("jlNomIndicador"); // NOI18N

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Valor");
        jLabel9.setName("jlValor"); // NOI18N

        jTextobservacion.setEditable(false);
        jTextobservacion.setBackground(new java.awt.Color(0, 255, 204));
        jTextobservacion.setColumns(20);
        jTextobservacion.setRows(5);
        jTextobservacion.setName("taNomIndicador"); // NOI18N
        jScrollPane1.setViewportView(jTextobservacion);
        jTextobservacion.getAccessibleContext().setAccessibleName("taNomIndicador");

        jScrollPane3.setBackground(new java.awt.Color(0, 255, 204));

        jTextMensaje.setEditable(false);
        jTextMensaje.setBackground(new java.awt.Color(0, 255, 204));
        jTextMensaje.setName("taMensaje"); // NOI18N
        jScrollPane3.setViewportView(jTextMensaje);
        jTextMensaje.getAccessibleContext().setAccessibleName("taMensaje");

        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Ultimas 5 Alertas");
        jLabel10.setName("jlTituloUltAlert"); // NOI18N

        jLabel11.setText("Fecha de la Alerta");
        jLabel11.setName("jlFechaUltAlert"); // NOI18N

        jLabel12.setText("Hora de la Alerta");
        jLabel12.setName("jlHoraUltAlert"); // NOI18N

        jLabel13.setText("Puntuación");
        jLabel13.setName("jlPuntuacion"); // NOI18N

        jTextUltimas5.setEditable(false);
        jTextUltimas5.setBackground(new java.awt.Color(0, 255, 204));
        jTextUltimas5.setName("tpFecUltAlert"); // NOI18N
        jScrollPane4.setViewportView(jTextUltimas5);
        jTextUltimas5.getAccessibleContext().setAccessibleName("tpFecUltAlert");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(211, 211, 211))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextHora, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                            .addComponent(jTextEdad, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFecha))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextNumHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTextNombreyApellido)))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                                .addComponent(jScrollPane1)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addComponent(jLabel11)
                                    .addGap(41, 41, 41)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addGap(50, 50, 50)
                                            .addComponent(jLabel13))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(67, 67, 67)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(71, 71, 71)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(73, 73, 73))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNumHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextNombreyApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextHora, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.getAccessibleContext().setAccessibleName("jlabtitulo");
        jLabel3.getAccessibleContext().setAccessibleName("jlNombre");
        jTextNombreyApellido.getAccessibleContext().setAccessibleName("tfNombre");
        jLabel4.getAccessibleContext().setAccessibleName("jlEdad");
        jTextEdad.getAccessibleContext().setAccessibleName("tfEdad");
        jLabel5.getAccessibleContext().setAccessibleName("jlHoraAler");
        jTextHora.getAccessibleContext().setAccessibleName("tfHoraAler");
        jLabel6.getAccessibleContext().setAccessibleName("jlFechaAlert");
        jTextFecha.getAccessibleContext().setAccessibleName("tfFechaAlert");
        jLabel7.getAccessibleContext().setAccessibleName("jlIndicadores");
        jLabel8.getAccessibleContext().setAccessibleName("jlNomIndicador");
        jLabel9.getAccessibleContext().setAccessibleName("jlValor");
        jLabel10.getAccessibleContext().setAccessibleName("jlTituloUltAlert");
        jLabel11.getAccessibleContext().setAccessibleName("jlFechaUltAlert");
        jLabel12.getAccessibleContext().setAccessibleName("jlHoraUltAlert");
        jLabel13.getAccessibleContext().setAccessibleName("jlPuntuacion");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNombreyApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreyApellidoActionPerformed
        // TODO add your handling code here:       
    }//GEN-LAST:event_jTextNombreyApellidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextEdad;
    private javax.swing.JTextField jTextFecha;
    private javax.swing.JTextField jTextHora;
    private javax.swing.JTextPane jTextMensaje;
    private javax.swing.JTextField jTextNombreyApellido;
    private javax.swing.JTextField jTextNumHabitacion;
    private javax.swing.JTextPane jTextUltimas5;
    private javax.swing.JTextArea jTextobservacion;
    private javax.swing.JLabel jlTitulo;
    // End of variables declaration//GEN-END:variables
}
