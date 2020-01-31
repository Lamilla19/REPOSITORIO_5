
package pis;

import static pis.Archivo.QuestCinNegro2Dan;
import static pis.Archivo.llenarLista;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 * @author Bryan Alava
 */
public class Examen2 extends javax.swing.JFrame {
    String[] respuestas;
    int pos = 0;
    public Examen2() {
        super("Exámen Cinturón Negro Segundo Dan");
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        llenarLista();
        respuestas=new String[32];
        for(int i=0;i<32;i++){
        respuestas[i]="";
        }
        question.setText(QuestCinNegro2Dan.get(pos).getQuestion());
        buttonGroup1.clearSelection(); // sirve para borrar las selecciones de los radio button
         String[] res=new String[4];
   res[0]=QuestCinNegro2Dan.get(0).getRespuesta();
   res[1]=QuestCinNegro2Dan.get(0).getAlternativa1();
   res[2]=QuestCinNegro2Dan.get(0).getAlternativa2();
   res[3]=QuestCinNegro2Dan.get(0).getAlternativa3();
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
        opc21.setText(orden[0]);
        opc22.setText(orden[1]);
        opc23.setText(orden[2]);
        opc24.setText(orden[3]);
        opc21.requestFocus();
        regresar.setEnabled(false);
        terminarExamen.setEnabled(false);}
    
   
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        question = new javax.swing.JLabel();
        opc21 = new javax.swing.JRadioButton();
        opc22 = new javax.swing.JRadioButton();
        opc23 = new javax.swing.JRadioButton();
        opc24 = new javax.swing.JRadioButton();
        terminarExamen = new javax.swing.JButton();
        avanzar = new javax.swing.JButton();
        regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(" Cuestionario 2do Nivel Dan"));
        jPanel1.setName("Cuestionario 1er Nivel Dan"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Pregunta");

        question.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        question.setText("¿Pregunta 1?");

        buttonGroup1.add(opc21);
        opc21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc21ActionPerformed(evt);
            }
        });

        buttonGroup1.add(opc22);
        opc22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc22ActionPerformed(evt);
            }
        });

        buttonGroup1.add(opc23);
        opc23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc23ActionPerformed(evt);
            }
        });

        buttonGroup1.add(opc24);
        opc24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc24ActionPerformed(evt);
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
                                    .addComponent(opc21)
                                    .addComponent(opc22)
                                    .addComponent(opc23)
                                    .addComponent(opc24))))
                        .addGap(0, 794, Short.MAX_VALUE))
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
                .addComponent(opc21)
                .addGap(18, 18, 18)
                .addComponent(opc22)
                .addGap(18, 18, 18)
                .addComponent(opc23)
                .addGap(18, 18, 18)
                .addComponent(opc24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opc21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc21ActionPerformed
        respuestas[pos] = opc21.getLabel();
    }//GEN-LAST:event_opc21ActionPerformed

    private void opc22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc22ActionPerformed
        respuestas[pos] = opc22.getLabel();
    }//GEN-LAST:event_opc22ActionPerformed

    private void opc23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc23ActionPerformed
        respuestas[pos] = opc23.getLabel();
    }//GEN-LAST:event_opc23ActionPerformed

    private void opc24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc24ActionPerformed
       respuestas[pos] = opc24.getLabel();
    }//GEN-LAST:event_opc24ActionPerformed

    private void terminarExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminarExamenActionPerformed

        int calificacion = 0;

        for(int i = 0; i < 32; i++){
            if(respuestas[i].equals(QuestCinNegro2Dan.get(i).getRespuesta())){
                calificacion = calificacion + 1;
            }
        }

        calificacion = calificacion * 5/16;
    JOptionPane.showMessageDialog(null, "Tu calificacion es " +  calificacion);
        
        if(calificacion>7){
                JOptionPane.showMessageDialog(this, "Has Aprobado ","felicidades",
                            JOptionPane.INFORMATION_MESSAGE);
            try {
                Aspirante.crearAspirante(new Aspirante(RExamen.ced,"SI" ,RExamen.nivelAprobado));
            } catch (IOException ex) {
                Logger.getLogger(Examen2.class.getName()).log(Level.SEVERE, null, ex);
            }
        RExamen.nivelAprobado ++;
           try {
                OperacionesDeArchivos.subirNivel(RExamen.ced, RExamen.nivelAprobado);
            } catch (IOException ex) {
                Logger.getLogger(Examen.class.getName()).log(Level.SEVERE, null, ex);
            }
        disposeX();}
       else{JOptionPane.showMessageDialog(this,
                             "Aun no has aprobado todo","Lo sentimos",
                            JOptionPane.ERROR_MESSAGE);
            try {
                Aspirante.crearAspirante(new Aspirante(RExamen.ced,"NO" ,RExamen.nivelAprobado));
            } catch (IOException ex) {
                Logger.getLogger(Examen2.class.getName()).log(Level.SEVERE, null, ex);
            }
        disposeX();
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
    private void avanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avanzarActionPerformed

        if(pos == 30){
            avanzar.setEnabled(false);
            terminarExamen.setEnabled(true);
        }

        if(pos < 32){
            regresar.setEnabled(true);
            pos++;
            question.setText(QuestCinNegro2Dan.get(pos).getQuestion());
        
            buttonGroup1.clearSelection(); // sirve para borrar las selecciones de los radio button
                     String[] res=new String[4];
   res[0]=QuestCinNegro2Dan.get(pos).getRespuesta();
   res[1]=QuestCinNegro2Dan.get(pos).getAlternativa1();
   res[2]=QuestCinNegro2Dan.get(pos).getAlternativa2();
   res[3]=QuestCinNegro2Dan.get(pos).getAlternativa3();
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
            opc21.setText(orden[0]);
            opc22.setText(orden[1]);
            opc23.setText(orden[2]);
            opc24.setText(orden[3]);
            opc21.requestFocus();
        }else{
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_avanzarActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed

        if(pos == 0){
            regresar.setEnabled(false);
        }

        if(pos > 0){
            pos--;
            avanzar.setEnabled(true);
               question.setText(QuestCinNegro2Dan.get(pos).getQuestion());
        
            buttonGroup1.clearSelection(); // sirve para borrar las selecciones de los radio button
                     String[] res=new String[4];
   res[0]=QuestCinNegro2Dan.get(pos).getRespuesta();
   res[1]=QuestCinNegro2Dan.get(pos).getAlternativa1();
   res[2]=QuestCinNegro2Dan.get(pos).getAlternativa2();
   res[3]=QuestCinNegro2Dan.get(pos).getAlternativa3();
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
            opc21.setText(orden[0]);
            opc22.setText(orden[1]);
            opc23.setText(orden[2]);
            opc24.setText(orden[3]);
            opc21.requestFocus();
        }else{
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_regresarActionPerformed

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
            java.util.logging.Logger.getLogger(Examen2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Examen2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Examen2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Examen2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Examen2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avanzar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton opc21;
    private javax.swing.JRadioButton opc22;
    private javax.swing.JRadioButton opc23;
    private javax.swing.JRadioButton opc24;
    private javax.swing.JLabel question;
    private javax.swing.JButton regresar;
    private javax.swing.JButton terminarExamen;
    // End of variables declaration//GEN-END:variables
}
