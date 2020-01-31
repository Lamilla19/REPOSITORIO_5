/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pis;

import pis.Instructor;
import pis.OperacionesArchivos;
import static pis.OperacionesArchivos.buscarIns;
import static pis.OperacionesArchivos.mastercintos;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.ListDataListener;
import static pis.Matricula.inscritos;
import static pis.Matricula.leerMatriculas;
import static pis.OperacionesDeArchivos.leerArchivo;

public class Inscribir extends javax.swing.JFrame {
ArrayList[] nivelesCursos;
String[][] horarios;
String apela;
Datos estud;
String[] comboPro;
public static Inscribir insc;
private String[] niveles;
Matricula inscripcion;
    public Inscribir() {
        super("Inscripción");
        setIconImage(new ImageIcon(getClass().getResource("09.jpg")).getImage());
        initComponents();
        setLocationRelativeTo(null);
        niveles=new String[12];
        niveles[0]="Ninguno";
        niveles[1]="Cinto negro";
        niveles[2]="1er Dan";
        niveles[3]="2do Dan";
        niveles[4]="3er Dan";
        niveles[5]="4to Dan";
        niveles[6]="5to Dan";
        niveles[7]="6to Dan";
        niveles[8]="7mo Dan";
        niveles[9]="8vo Dan";
        niveles[10]="9no Dan";
        niveles[11]="10mo Dan";
        //nivelesCursos[0]= new ArrayList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        buscarBTN = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nivelDes = new javax.swing.JLabel();
        nombreInc = new javax.swing.JLabel();
        apellidoInc = new javax.swing.JLabel();
        edadInc = new javax.swing.JLabel();
        currentL = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tfnivDes = new javax.swing.JTextField();
        comboProfes = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        insBTN = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("Inscripción");

        jLabel2.setText("Cédula : ");

        buscarBTN.setText("Buscar");
        buscarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBTNActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Nombre :");

        jLabel4.setText("Apellido :");

        jLabel5.setText("Edad :");

        jLabel6.setText("Último nivel aprobado :");

        jLabel7.setText("Nivel disponoble para inscripción:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreInc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(apellidoInc, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(edadInc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(currentL, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nivelDes, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombreInc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(apellidoInc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(edadInc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(currentL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nivelDes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel13.setText("Nivel a inscribirse :");

        tfnivDes.setEditable(false);

        jLabel14.setText("Seleccione un instrúctor");

        insBTN.setText("Inscribirse");
        insBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insBTNActionPerformed(evt);
            }
        });

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pis/logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(202, 202, 202)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscarBTN))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(89, 89, 89)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(187, 187, 187)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(25, 25, 25)
                                            .addComponent(jLabel13))
                                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(comboProfes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfnivDes, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(insBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(buscarBTN))
                .addGap(7, 7, 7)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(tfnivDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboProfes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBTNActionPerformed
    estud=OperacionesDeArchivos.buscarCedula(tfID.getText());
    boolean incrito=false;
    leerMatriculas();
    for(Matricula m:inscritos){
    if(m.getCedulaEstudiante().equals(estud.getCedula())&&m.getNivelIns()==(estud.getNivel()+1)){
    incrito=true;
    }
    }
    if(estud.getNombre().equals("")){
     JOptionPane.showMessageDialog(this,
        "No se encontró ningun alumno con esa cédula.", "Error",
        JOptionPane.ERROR_MESSAGE);
    }
    else if(incrito){
         JOptionPane.showMessageDialog(this,
        "Ustéd ya está registrado para el exámen.", "Error",
        JOptionPane.ERROR_MESSAGE);
    }
    else{
    nombreInc.setText(estud.getNombre());
    apellidoInc.setText(estud.getApellido());
    edadInc.setText(estud.getEdad());
    currentL.setText(niveles[estud.getNivel()]);
    nivelDes.setText(niveles[estud.getNivel()+1]);
    tfnivDes.setText(niveles[estud.getNivel()+1]);
    setApela();
    llenarCombo();
    }
    }//GEN-LAST:event_buscarBTNActionPerformed

    private void insBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insBTNActionPerformed
    switch((estud.getNivel()+1)){
        case 1:
            if(Integer.parseInt(estud.getEdad())>=12){
        creaComprobante();
        }else{
           JOptionPane.showMessageDialog(this,
        "Debe tener una edad mínima de 12 años para inscribirse", "Error",
        JOptionPane.ERROR_MESSAGE);   
        } break;
         case 2:
            if(Integer.parseInt(estud.getEdad())>=14){
        creaComprobante();
        }else{
           JOptionPane.showMessageDialog(this,
        "Debe tener una edad mínima de 14 años para inscribirse", "Error",
        JOptionPane.ERROR_MESSAGE);   
        } break;
        case 3:
            if(Integer.parseInt(estud.getEdad())>=18){
        creaComprobante();
        }else{
           JOptionPane.showMessageDialog(this,
        "Debe tener una edad mínima de 18 años para inscribirse", "Error",
        JOptionPane.ERROR_MESSAGE);   
        } break;
        case 4:
            if(Integer.parseInt(estud.getEdad())>=21){
        creaComprobante();
        }else{
           JOptionPane.showMessageDialog(this,
        "Debe tener una edad mínima de 21 años para inscribirse", "Error",
        JOptionPane.ERROR_MESSAGE);   
        } break;
        case 5:
            if(Integer.parseInt(estud.getEdad())>=25){
        creaComprobante();
        }else{
           JOptionPane.showMessageDialog(this,
        "Debe tener una edad mínima de 25 años para inscribirse", "Error",
        JOptionPane.ERROR_MESSAGE);   
        } break;
        case 6:
            if(Integer.parseInt(estud.getEdad())>=30){
        creaComprobante();
        }else{
           JOptionPane.showMessageDialog(this,
        "Debe tener una edad mínima de 30 años para inscribirse", "Error",
        JOptionPane.ERROR_MESSAGE);   
        } break;
        case 7:
            if(Integer.parseInt(estud.getEdad())>=36){
        creaComprobante();
        }else{
           JOptionPane.showMessageDialog(this,
        "Debe tener una edad mínima de 36 años para inscribirse", "Error",
        JOptionPane.ERROR_MESSAGE);   
        } break;
             case 8:
            if(Integer.parseInt(estud.getEdad())>=43){
        creaComprobante();
        }else{
           JOptionPane.showMessageDialog(this,
        "Debe tener una edad mínima de 43 años para inscribirse", "Error",
        JOptionPane.ERROR_MESSAGE);   
        } break;
        case 9:
            if(Integer.parseInt(estud.getEdad())>=51){
        creaComprobante();
        }else{
           JOptionPane.showMessageDialog(this,
        "Debe tener una edad mínima de 51 años para inscribirse", "Error",
        JOptionPane.ERROR_MESSAGE);   
        } break;
        case 10:
            if(Integer.parseInt(estud.getEdad())>=60){
        creaComprobante();
        }else{
           JOptionPane.showMessageDialog(this,
        "Debe tener una edad mínima de 60 años para inscribirse", "Error",
        JOptionPane.ERROR_MESSAGE);   
        } break;
        case 11:
            if(Integer.parseInt(estud.getEdad())>=70){
        creaComprobante();
        }else{
           JOptionPane.showMessageDialog(this,
        "Debe tener una edad mínima de 70 años para inscribirse", "Error",
        JOptionPane.ERROR_MESSAGE);   
        } break;
    }
    }//GEN-LAST:event_insBTNActionPerformed
    private void creaComprobante(){
       Instructor profesor=OperacionesArchivos.buscarProf(comboProfes.getSelectedItem().toString());
    
    inscripcion=new Matricula(estud.getNombre(),estud.getApellido(),estud.getCedula(),profesor.getNombre(),profesor.getApellido(),(estud.getNivel()+1));
    new Confirmar(inscripcion).setVisible(true);
    this.setVisible(false);
    
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Menu Ventana = new Menu();
   Ventana.setBounds(0,0,800,600);
   Ventana.setVisible(true);
    Ventana.setResizable(false);
      Ventana.setLocationRelativeTo(null);
       this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    public void llenarCombo(){
    buscarIns(apela);
    comboProfes.removeAll();
    comboPro=new String[mastercintos.size()];
    for(Instructor i:mastercintos){
    comboPro[mastercintos.indexOf(i)]=i.getNombre();
    comboProfes.addItem(comboPro[mastercintos.indexOf(i)]);
    }
   
    }
    public void setApela(){
  if((estud.getNivel()+1)==1){
    apela="Cinturon Negro";
    }
    if((estud.getNivel()+1)==2){
    apela="Cinturon Negro Primer Dan";
    }
    if((estud.getNivel()+1)==3){
    apela= "Cinturon Negro Segundo Dan";
    }
    if((estud.getNivel()+1)==4){
    apela="Cinturon Negro Tercer Dan";
    }
    if((estud.getNivel()+1)==5){
    apela="Cinturon Negro Cuarto Dan";
    }
    if((estud.getNivel()+1)==6){
    apela="Cinturon Negro Quinto Dan";
    }
    if((estud.getNivel()+1)>6){
    apela="Altos Grados sexto Dan y Sucecivos";
    }
}
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
            java.util.logging.Logger.getLogger(Inscribir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inscribir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inscribir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inscribir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 insc=new Inscribir();
                insc.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidoInc;
    private javax.swing.JButton buscarBTN;
    private javax.swing.JComboBox<String> comboProfes;
    private javax.swing.JLabel currentL;
    private javax.swing.JLabel edadInc;
    private javax.swing.JButton insBTN;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nivelDes;
    private javax.swing.JLabel nombreInc;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfnivDes;
    // End of variables declaration//GEN-END:variables
}
