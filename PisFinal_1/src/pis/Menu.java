
package pis;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends JFrame implements ActionListener {
private JMenuBar menubar;
  private JMenu menu1,ASPIRANTE,Licencias;
  private JMenuItem menuitem1, menuitem2, menuitem3,aspirante,Respuestas,Preguntas,licencias;
  private JLabel Fondo;
    Menu(){
    super("KARATE");
    setIconImage(new ImageIcon(getClass().getResource("09.jpg")).getImage());
    setLayout(null);
    Fondo = new JLabel();
    Fondo.setBounds(0,0,800,550);
    ImageIcon boton19 = new ImageIcon("75.jpg");
    Fondo.setIcon(new ImageIcon(boton19.getImage().getScaledInstance(Fondo.getWidth(),Fondo.getHeight(), Image.SCALE_SMOOTH)));
    add(Fondo);
    menubar = new JMenuBar();
    setJMenuBar(menubar);
    menu1 = new JMenu("REGISTRO");
    menu1.setFont(new java.awt.Font("Bookman Old Style", 2, 18));
    menubar.add(menu1);
    ASPIRANTE = new JMenu("ASPIRANTE");
    ASPIRANTE.setFont(new java.awt.Font("Bookman Old Style", 2, 18));
    menubar.add(ASPIRANTE);
    Licencias = new JMenu("LICENCIAS");
    Licencias.setFont(new java.awt.Font("Bookman Old Style", 2, 18));
    menubar.add(Licencias);
    licencias = new JMenuItem("REGISTRAR LICENCIA");
    licencias.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
    licencias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    licencias.setFont(new java.awt.Font("Bookman Old Style", 2, 12));
    ImageIcon boton6 = new ImageIcon("1566234313581.png");
    licencias.setIcon(new ImageIcon(boton6.getImage().getScaledInstance(30,30, Image.SCALE_SMOOTH)));
    licencias.addActionListener(this);
    licencias.setSelected(true);
    Licencias.add(licencias);
    aspirante = new JMenuItem("REGISTRO PARA EXAMEN");
    aspirante.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
    aspirante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    aspirante.setFont(new java.awt.Font("Bookman Old Style", 2, 12));
    ImageIcon boton89 = new ImageIcon("1566234213115.png");
    aspirante.setIcon(new ImageIcon(boton89.getImage().getScaledInstance(30,30, Image.SCALE_SMOOTH)));
    aspirante.addActionListener(this);
    aspirante.setSelected(true);
    ASPIRANTE.add(aspirante);
    Respuestas = new JMenuItem("EDITAR RESPUESTAS");
    Respuestas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
    Respuestas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    Respuestas.setFont(new java.awt.Font("Bookman Old Style", 2, 12));
    ImageIcon Respuestas9 = new ImageIcon("1566234313581.png");
    Respuestas.setIcon(new ImageIcon(Respuestas9.getImage().getScaledInstance(30,30, Image.SCALE_SMOOTH)));
    Respuestas.addActionListener(this);
    Respuestas.setSelected(true);
    ASPIRANTE.add(Respuestas);
     Preguntas = new JMenuItem("EDITAR PREGUNTAS");
    Preguntas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
    Preguntas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    Preguntas.setFont(new java.awt.Font("Bookman Old Style", 2, 12));
    ImageIcon Preguntas9 = new ImageIcon("Kar.png");
    Preguntas.setIcon(new ImageIcon(Preguntas9.getImage().getScaledInstance(30,30, Image.SCALE_SMOOTH)));
    Preguntas.addActionListener(this);
    Preguntas.setSelected(true);
    ASPIRANTE.add(Preguntas);
    menuitem1 = new JMenuItem("ESTUDIANTE");
    menuitem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
    menuitem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    menuitem1.setFont(new java.awt.Font("Bookman Old Style", 2, 12));
    ImageIcon boton3 = new ImageIcon("Kar.png");
    menuitem1.setIcon(new ImageIcon(boton3.getImage().getScaledInstance(30,30, Image.SCALE_SMOOTH)));
    menuitem1.addActionListener(this);
    menuitem1.setSelected(true);
    menu1.add(menuitem1);
    menuitem2 = new JMenuItem("INSTRUCTOR");
    menuitem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
    menuitem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    menuitem2.setFont(new java.awt.Font("Bookman Old Style", 2, 12));
    ImageIcon boton4 = new ImageIcon("1566234359469.png");
    menuitem2.setIcon(new ImageIcon(boton4.getImage().getScaledInstance(30,30, Image.SCALE_SMOOTH)));
    menuitem2.addActionListener(this);
    menuitem2.setSelected(true);
    menu1.add(menuitem2);
    menuitem3 = new JMenuItem("INSCRIPCION");
    menuitem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
    menuitem3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    menuitem3.setFont(new java.awt.Font("Bookman Old Style", 2, 12));
    ImageIcon boton5 = new ImageIcon("1566234342840.png");
    menuitem3.setIcon(new ImageIcon(boton5.getImage().getScaledInstance(30,30, Image.SCALE_SMOOTH)));
    menuitem3.addActionListener(this);
    menuitem3.setSelected(true);
    menu1.add(menuitem3);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
    public void actionPerformed(ActionEvent e){

    if(e.getSource() == licencias){
     licenciaRequerida Ventana  = new licenciaRequerida();
   Ventana.setBounds(0,0,1000,600);
   Ventana.setVisible(true);
    Ventana.setResizable(false);
      Ventana.setLocationRelativeTo(null); 
      this.setVisible(false);
    }
    
    if(e.getSource() == menuitem2){
    VentanaInstructor Ventana  = new VentanaInstructor();
  
   Ventana.setVisible(true);
    Ventana.setResizable(false);
      Ventana.setLocationRelativeTo(null); 
      this.setVisible(false);
    }
    if(e.getSource() == menuitem1){
    Estudiante Ventana  = new Estudiante();
   Ventana.setBounds(0,0,800,600);
   Ventana.setVisible(true);
    Ventana.setResizable(false);
      Ventana.setLocationRelativeTo(null); 
      this.setVisible(false);
    }
    if(e.getSource() == menuitem3){
       Inscribir Ventana  = new  Inscribir(); 
      Ventana.setBounds(0,0,700,600);
   Ventana.setVisible(true);
    Ventana.setResizable(false);
      Ventana.setLocationRelativeTo(null); 
      this.setVisible(false);
    }
    if(e.getSource() == aspirante){
     VentanaAspirante Ventana= new VentanaAspirante(); 
      Ventana.setBounds(0,0,700,600);
   Ventana.setVisible(true);
    Ventana.setResizable(false);
      Ventana.setLocationRelativeTo(null); 
      this.setVisible(false);
    }
     if(e.getSource() == Preguntas){
    PreguntasVentana Ventana; 
        try {
            Ventana = new PreguntasVentana ();             
   Ventana.setVisible(true); 
      this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
     if(e.getSource() == Respuestas){
        try {
            Respuestas Ventana = new Respuestas();
            Ventana.setVisible(true); 
      this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
  }
    public static void main(String[] args) {
      Menu Ventana = new Menu();
   Ventana.setBounds(0,0,800,600);
   Ventana.setVisible(true);
    Ventana.setResizable(false);
      Ventana.setLocationRelativeTo(null);
     
    }
    
}
