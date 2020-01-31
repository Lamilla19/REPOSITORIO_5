
package pis;


import static pis.Archivo.QuestCinNegro;

import static pis.Archivo.llenarLista;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ExamenIni extends javax.swing.JFrame {

String[] respuestas;
    public ExamenIni() {
        super("Exámen Cinturón Negro");
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        llenarLista();
        respuestas=new String[11];
         for(int i=0;i<11;i++){
        respuestas[i]="";
        }
        question.setText(QuestCinNegro.get(0).getQuestion());
      
        buttonGroup1.clearSelection(); // sirve para borrar las selecciones de los radio button
        
          String[] res=new String[4];
   res[0]=QuestCinNegro.get(0).getRespuesta();
   res[1]=QuestCinNegro.get(0).getAlternativa1();
   res[2]=QuestCinNegro.get(0).getAlternativa2();
   res[3]=QuestCinNegro.get(0).getAlternativa3();
   String[] orden=new String[4];
   orden[0]="";
   orden[1]="";
   orden[2]="";
   orden[3]="";
       for(int i=0;i<4;i++){
       int r; 
       do{
       r=(int)(Math.random()*4);
       }while(orden[r]!="");
       orden[r]=res[i];
       }
        opc1.setText(orden[0]);
        opc2.setText(orden[1]);
        opc3.setText(orden[2]);
        opc4.setText(orden[3]);
        opc1.requestFocus();
        regresar.setEnabled(false);
        terminarExamen.setEnabled(false);
    }


    int posicion = 0;
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        question = new javax.swing.JLabel();
        opc1 = new javax.swing.JRadioButton();
        opc2 = new javax.swing.JRadioButton();
        opc3 = new javax.swing.JRadioButton();
        opc4 = new javax.swing.JRadioButton();
        terminarExamen = new javax.swing.JButton();
        avanzar = new javax.swing.JButton();
        regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuestionario"));
        jPanel1.setName("Cuestionario 1er Nivel Dan"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Pregunta");

        question.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        question.setText("¿Pregunta 1?");

        buttonGroup1.add(opc1);
        opc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(opc2);
        opc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(opc3);
        opc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(opc4);
        opc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc4ActionPerformed(evt);
            }
        });

        terminarExamen.setText("Terminar Examen");
        terminarExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminarExamenActionPerformed(evt);
            }
        });

        avanzar.setText("Avanzar >>");
        avanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avanzarActionPerformed(evt);
            }
        });

        regresar.setText("<< Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(question)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(opc1)
                                    .addComponent(opc2)
                                    .addComponent(opc3)
                                    .addComponent(opc4))))
                        .addGap(0, 759, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(terminarExamen, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(regresar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(avanzar)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(question)
                .addGap(47, 47, 47)
                .addComponent(opc1)
                .addGap(18, 18, 18)
                .addComponent(opc2)
                .addGap(18, 18, 18)
                .addComponent(opc3)
                .addGap(18, 18, 18)
                .addComponent(opc4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avanzar)
                    .addComponent(regresar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(terminarExamen)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("Cuestionario 1er Nivel Dan");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void avanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avanzarActionPerformed

        if(posicion == 9){
            avanzar.setEnabled(false);
            terminarExamen.setEnabled(true);
        }
        
        if(posicion < 11){
            regresar.setEnabled(true);
            posicion++;
            question.setText(QuestCinNegro.get(posicion).getQuestion());
           
            buttonGroup1.clearSelection(); // sirve para borrar las selecciones de los radio button
                   String[] res=new String[4];
   res[0]=QuestCinNegro.get(posicion).getRespuesta();
   res[1]=QuestCinNegro.get(posicion).getAlternativa1();
   res[2]=QuestCinNegro.get(posicion).getAlternativa2();
   res[3]=QuestCinNegro.get(posicion).getAlternativa3();
   String[] orden=new String[4];
   orden[0]="";
   orden[1]="";
   orden[2]="";
   orden[3]="";
       for(int i=0;i<4;i++){
       int r; 
       do{
       r=(int)(Math.random()*4);
       }while(orden[r]!="");
       orden[r]=res[i];
       }
        opc1.setText(orden[0]);
        opc2.setText(orden[1]);
        opc3.setText(orden[2]);
        opc4.setText(orden[3]);
        opc1.requestFocus();
        }else{
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_avanzarActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
       
        if(posicion == 0){
            regresar.setEnabled(false);
        }
        
        if(posicion > 0){
            posicion--;
            avanzar.setEnabled(true);
                  question.setText(QuestCinNegro.get(posicion).getQuestion());
           
            buttonGroup1.clearSelection(); // sirve para borrar las selecciones de los radio button
                   String[] res=new String[4];
   res[0]=QuestCinNegro.get(posicion).getRespuesta();
   res[1]=QuestCinNegro.get(posicion).getAlternativa1();
   res[2]=QuestCinNegro.get(posicion).getAlternativa2();
   res[3]=QuestCinNegro.get(posicion).getAlternativa3();
   String[] orden=new String[4];
   orden[0]="";
   orden[1]="";
   orden[2]="";
   orden[3]="";
       for(int i=0;i<4;i++){
       int r; 
       do{
       r=(int)(Math.random()*4);
       }while(orden[r]!="");
       orden[r]=res[i];
       }
        opc1.setText(orden[0]);
        opc2.setText(orden[1]);
        opc3.setText(orden[2]);
        opc4.setText(orden[3]);
        opc1.requestFocus();
        }else{
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_regresarActionPerformed

    private void terminarExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminarExamenActionPerformed
        
        int calificacion = 0;
        
        for(int i = 0; i < 11; i++){
            if(respuestas[i].equals(QuestCinNegro.get(i).getRespuesta())){
                calificacion = calificacion + 1;
            }
        }
        
        calificacion = calificacion * 5/6;
        
        JOptionPane.showMessageDialog(null, "Tu calificacion es " +  calificacion);
        
        if(calificacion>7){
            try {
                JOptionPane.showMessageDialog(this, "Has Aprobado ","felicidades",
                        JOptionPane.INFORMATION_MESSAGE);
                Aspirante.crearAspirante(new Aspirante(RExamen.ced,"SI" ,RExamen.nivelAprobado));
                RExamen.nivelAprobado ++;
                try {
                    OperacionesDeArchivos.subirNivel(RExamen.ced, RExamen.nivelAprobado);
                } catch (IOException ex) {
                    Logger.getLogger(ExamenIni.class.getName()).log(Level.SEVERE, null, ex);
                }
                disposeX();} catch (IOException ex) {
                Logger.getLogger(ExamenIni.class.getName()).log(Level.SEVERE, null, ex);
            }
}
       else{try {
           JOptionPane.showMessageDialog(this,
                   "Aun no has aprobado todo","Lo sentimos",
                   JOptionPane.ERROR_MESSAGE);
           Aspirante.crearAspirante(new Aspirante(RExamen.ced,"NO" ,RExamen.nivelAprobado));
           disposeX();
            } catch (IOException ex) {
                Logger.getLogger(ExamenIni.class.getName()).log(Level.SEVERE, null, ex);
            }
}
        
    }//GEN-LAST:event_terminarExamenActionPerformed
void disposeX(){
  Menu Ventana = new Menu();
   Ventana.setBounds(0,0,800,600);
   Ventana.setVisible(true);
    Ventana.setResizable(false);
      Ventana.setLocationRelativeTo(null);
       this.setVisible(false);
    this.dispose();
    }
    private void opc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc1ActionPerformed
        respuestas[posicion] = opc1.getLabel();
    }//GEN-LAST:event_opc1ActionPerformed

    private void opc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc2ActionPerformed
        respuestas[posicion] = opc2.getLabel();
    }//GEN-LAST:event_opc2ActionPerformed

    private void opc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc3ActionPerformed
        respuestas[posicion] = opc3.getLabel();
    }//GEN-LAST:event_opc3ActionPerformed

    private void opc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc4ActionPerformed
        respuestas[posicion] = opc4.getLabel();
    }//GEN-LAST:event_opc4ActionPerformed
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
            java.util.logging.Logger.getLogger(ExamenIni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExamenIni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExamenIni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExamenIni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExamenIni().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avanzar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton opc1;
    private javax.swing.JRadioButton opc2;
    private javax.swing.JRadioButton opc3;
    private javax.swing.JRadioButton opc4;
    private javax.swing.JLabel question;
    private javax.swing.JButton regresar;
    private javax.swing.JButton terminarExamen;
    // End of variables declaration//GEN-END:variables
}
