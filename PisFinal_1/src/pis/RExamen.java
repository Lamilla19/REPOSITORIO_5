
package pis;

import java.io.IOException;



public class RExamen {
  public  static int nivelAprobado;
  public static String ced;
     RExamen (int nivelAprobado,String ced) throws IOException{
      RExamen.nivelAprobado= nivelAprobado;
      RExamen.ced=ced;
        if(nivelAprobado==1 ){
          ExamenIni i = new ExamenIni();
        i.setVisible(true);
    
      }
      if(nivelAprobado==2 ){
          Examen e = new Examen();
        e.setVisible(true);
    
      }
        if(nivelAprobado==3){
        Examen2 a = new Examen2();
        a.setVisible(true);
       
        }
        if (nivelAprobado==4){
        Examen3 b = new Examen3();
        b.setVisible(true);
     
        }
        if (nivelAprobado>=5){
        Examen4 c = new Examen4();
        c.setVisible(true);
     
        }
      }
        
    
}
