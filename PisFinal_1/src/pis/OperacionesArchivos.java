/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pis;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Green Studio
 */
public class OperacionesArchivos {
  public static List<Instructor> maestros;
  public static List<Instructor> mastercintos;   
    Instructor ins; 
     private static String[][] tabla;
       @SuppressWarnings("CallToThreadDumpStack")
   public static void crearArchivo(Instructor ins) {
       FileWriter flwriter = null;
                try {//además de la ruta del archivo recibe un parámetro de tipo boolean, que le indican que se va añadir más registros 
	          flwriter = new FileWriter("Instructor1.txt",true);
                 try (BufferedWriter bfwriter = new BufferedWriter(flwriter)) {
                      bfwriter.write(ins.getCedula() + ";" + ins.getNombre() + ";" + ins.getApellido()+";"+ins.getEdad()+";"+ins.getCinturon()+";" + ins.getTelefono() +  "\r\n");
                 }
		} catch (IOException e) {
		} finally {
		if (flwriter!= null) {
		try {
		flwriter.close();
		} 
                catch (IOException e) 
                {
                e.printStackTrace();}     
    
     }}}
        public static Instructor buscarCedula(String cedula){
    leerArchivoI();
    Instructor info=new Instructor("","","","","","");
    for(Instructor i:maestros){
   if((i.getCedula().trim()).equals(cedula.trim())){
    info =i;
    }
    }
    return info;
    }
 @SuppressWarnings("CallToThreadDumpStack")
    	public static void  leerArchivoI() {
                 maestros=new ArrayList<Instructor>();
		// crea el flujo para leer desde el archivo
		File file = new File("Instructor1.txt");
		            Instructor inst = new Instructor();
                           
			    Scanner reader;
                                 String line;
                     try{
                         reader=new Scanner(file);
   
                      while(reader.hasNextLine()){
                 line= reader.nextLine();
                           inst=new Instructor();
                          Scanner delimitar=new Scanner(line);
                         delimitar.useDelimiter("\\s*;\\s*");
				
				inst.setCedula(delimitar.next());
				inst.setNombre(delimitar.next());
				inst.setApellido(delimitar.next());
                                inst.setEdad(delimitar.next());
                                inst.setCinturon(delimitar.next());
                                inst.setTelefono(delimitar.next());
                                maestros.add(inst);
			}
			//se cierra el ojeto scanner
			
                        reader.close();
                       
		} catch (FileNotFoundException e) {
                    e.printStackTrace();
		}
              		
	}
        
        
       public static void buscarIns(String cinto){
       leerArchivoI();
       mastercintos=new ArrayList<>();
       for(Instructor i:maestros){
       if(i.getCinturon().equals(cinto)){
           mastercintos.add(i);
       }
       }
       } 
       
        public static Instructor buscarProf(String nombre){
       Instructor profe=new Instructor();
       for(Instructor i:maestros){
       if(i.getNombre().equals(nombre)){
        profe=i;   
       }
       }
       return profe;
       }
     public static String[][] leerRegistro(){
    leerArchivoI();
    tabla=new String[maestros.size()][9];
    for(int i=0;i<maestros.size();i++){
    tabla[i][0]=maestros.get(i).getCedula();
    tabla[i][1]=maestros.get(i).getNombre();
    tabla[i][2]=maestros.get(i).getApellido();
    tabla[i][3]=maestros.get(i).getEdad();
    tabla[i][4]=maestros.get(i).getCinturon();
    tabla[i][5]=maestros.get(i).getTelefono();
   
    }
    return tabla;
    }



}
