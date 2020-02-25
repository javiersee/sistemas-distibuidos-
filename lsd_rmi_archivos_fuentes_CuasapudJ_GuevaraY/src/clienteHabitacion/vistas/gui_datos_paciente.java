/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteHabitacion.vistas;

import clienteHabitacion.ClienteDeObjetos;
import clienteHabitacion.PacienteCllbckImpl;
import com.sun.glass.events.KeyEvent;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import servidorAlertas.dto.ClsUsuarioDTO;
import servidorAlertas.sop_rmi.GestionUsuariosInt;
import servidorAlertas.utilidades.UtilidadesRegistroC;

/**
 *
 * @author elcua
 */
public class gui_datos_paciente extends javax.swing.JFrame {

    /**
     * Creates new form gui_datos_paciente
     */
   
    private  static GestionUsuariosInt objRemoto;
   private static ClsUsuarioDTO objusuario =new ClsUsuarioDTO();
    public gui_datos_paciente( GestionUsuariosInt objRemoto) {
        setLocation(50, 50);
        setTitle("Registrar Paciente");
        this.objRemoto=objRemoto;
        initComponents();
        jLabNomObli.setVisible(false);
        jLabEdadObli.setVisible(false);
        jLabHabiObli.setVisible(false);
        jBEnviarIndicadores.setVisible(false);
        jLabMayorEdad.setVisible(false);
        jLaValHab.setVisible(false);
    }
    int cont=0;
    public void validar(){
        
        if(nombre.getText().equals("")){
            jLabNomObli.setVisible(true);
            cont++;
        }else{
            jLabNomObli.setVisible(false);            
        }
        if(edad.getText().equals("")){
            jLabEdadObli.setVisible(true);
            cont++;
        }else{
            jLabEdadObli.setVisible(false);
        }
        if(numeroHabitacion.getText().equals("")){
            jLabHabiObli.setVisible(true);
            cont++;
        }else{
            jLabHabiObli.setVisible(false);
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        enviar_paciente = new javax.swing.JButton();
        nombre = new javax.swing.JTextField();
        edad = new javax.swing.JTextField();
        numeroHabitacion = new javax.swing.JTextField();
        jLabNomObli = new javax.swing.JLabel();
        jLabEdadObli = new javax.swing.JLabel();
        jLabHabiObli = new javax.swing.JLabel();
        jBEnviarIndicadores = new javax.swing.JButton();
        jTextNotificarPaciente = new javax.swing.JTextField();
        jLMensaje = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabMayorEdad = new javax.swing.JLabel();
        jLaValHab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Informacion de Paciente ");

        jLabel2.setText("* Nombre");

        jLabel3.setText("* Edad");

        jLabel4.setText("* Número de Habitacion ");

        enviar_paciente.setText("Enviar Paciente");
        enviar_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviar_pacienteActionPerformed(evt);
            }
        });

        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });

        edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadActionPerformed(evt);
            }
        });
        edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edadKeyTyped(evt);
            }
        });

        numeroHabitacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numeroHabitacionKeyTyped(evt);
            }
        });

        jLabNomObli.setForeground(new java.awt.Color(255, 0, 0));
        jLabNomObli.setText("* Obligatorio");

        jLabEdadObli.setForeground(new java.awt.Color(255, 0, 0));
        jLabEdadObli.setText("* Obligatorio");

        jLabHabiObli.setForeground(new java.awt.Color(255, 0, 0));
        jLabHabiObli.setText("* Obligatorio");

        jBEnviarIndicadores.setText("Enviar Indicadores");
        jBEnviarIndicadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEnviarIndicadoresActionPerformed(evt);
            }
        });

        jTextNotificarPaciente.setEditable(false);

        jLMensaje.setText("Mensaje");

        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("* Campos Obligatorios");

        jLabMayorEdad.setText("debe ser mayor a 0");

        jLaValHab.setText("valor entre 100 y 999");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLMensaje)
                            .addComponent(enviar_paciente))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabNomObli)
                                    .addComponent(jLabEdadObli))
                                .addContainerGap(46, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBEnviarIndicadores, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabMayorEdad)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(numeroHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabHabiObli))
                                        .addComponent(jLaValHab)))
                                .addGap(0, 46, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jTextNotificarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabNomObli))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabEdadObli))
                .addGap(1, 1, 1)
                .addComponent(jLabMayorEdad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(numeroHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabHabiObli))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLaValHab)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enviar_paciente)
                    .addComponent(jBEnviarIndicadores))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLMensaje)
                .addGap(18, 18, 18)
                .addComponent(jTextNotificarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enviar_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviar_pacienteActionPerformed
        cont=0;
        validar();        
        //TextPrompt placeholder = new TextPrompt("Mayor a 0", edad);
        if(cont==0){        
        float v_edad =Float.parseFloat(edad.getText());            
        String v_nombre= nombre.getText();
        int  v_numeroHabitacion =Integer.parseInt(numeroHabitacion.getText()); 
            if((v_edad > 0)&&(v_numeroHabitacion > 99 || v_numeroHabitacion < 1000)){
               
                    jLabMayorEdad.setVisible(false);
                    jLaValHab.setVisible(false);
                    objusuario.setEdad(v_edad);                
                    objusuario.setNumHabitacion(v_numeroHabitacion);
                    objusuario.setNombres(v_nombre);
                    jBEnviarIndicadores.setVisible(true);        
               
            }else{
                if(v_edad > 0){
                    jLabMayorEdad.setVisible(false);
                }else{
                    jLabMayorEdad.setVisible(true);
                } 
                if(v_numeroHabitacion<100 || v_numeroHabitacion>999){
                        jLaValHab.setVisible(true);
                    }else{
                        jLaValHab.setVisible(false);
                    }
            
            }
                
        }
        objRemoto = (GestionUsuariosInt) UtilidadesRegistroC.obtenerObjRemoto("localhost",2020, "ObjetoAlmacenarUsuario");
        boolean valor;
        try {
            valor = objRemoto.registrarUsuario(objusuario);
             PacienteCllbckImpl pacientecll=new PacienteCllbckImpl(this);
           // objusuario=paciente.retornar_usuario();
            objRemoto.registrarReferenciaCallBack(pacientecll, objusuario.getNumHabitacion());
            
           
        } catch (RemoteException ex) {
            Logger.getLogger(gui_datos_paciente.class.getName()).log(Level.SEVERE, null, ex);
        }
	//this.setVisible(false);
    }//GEN-LAST:event_enviar_pacienteActionPerformed

    private void jBEnviarIndicadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEnviarIndicadoresActionPerformed
        enviar_paciente.setVisible(false);
        ClienteDeObjetos cli=new ClienteDeObjetos();
        
            cli.start();
            
    }//GEN-LAST:event_jBEnviarIndicadoresActionPerformed

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped

    }//GEN-LAST:event_nombreKeyTyped

    private void edadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edadKeyTyped
        // TODO add your handling code here:          
    }//GEN-LAST:event_edadKeyTyped

    private void numeroHabitacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroHabitacionKeyTyped
        // TODO add your handling code here:
        char e=evt.getKeyChar();        
        if(e<'0' || e>'9')evt.consume();
    }//GEN-LAST:event_numeroHabitacionKeyTyped

    private void edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadActionPerformed

    /**
     * @param args the command line arguments
     */
    public ClsUsuarioDTO retornar_usuario(){
    return objusuario;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField edad;
    private javax.swing.JButton enviar_paciente;
    private javax.swing.JButton jBEnviarIndicadores;
    private javax.swing.JLabel jLMensaje;
    private javax.swing.JLabel jLaValHab;
    private javax.swing.JLabel jLabEdadObli;
    private javax.swing.JLabel jLabHabiObli;
    private javax.swing.JLabel jLabMayorEdad;
    private javax.swing.JLabel jLabNomObli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JTextField jTextNotificarPaciente;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField numeroHabitacion;
    // End of variables declaration//GEN-END:variables
}
