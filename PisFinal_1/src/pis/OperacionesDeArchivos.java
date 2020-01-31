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
import static java.lang.String.format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



/**
 *
 * @author PC-01
 */
public class OperacionesDeArchivos {
 
private static List<Datos> estudiantes;
private static String[][] registro;
  @SuppressWarnings("ConvertToTryWithResources")
  public  static void agregarArchivo(Datos estudiante) throws IOException{
     File file=new File("Estudiante.txt");
        FileWriter fw=new FileWriter(file,true);
        BufferedWriter bfWriter;
        bfWriter = new BufferedWriter(fw);
            bfWriter.write(""); 
            bfWriter.write(estudiante.getCedula()+";"+estudiante.getNombre()+";"+estudiante.getApellido()+";"+estudiante.getDia()+";"+estudiante.getMes()+";"+estudiante.getAnio()+";"+estudiante.getEdad()+";"+estudiante.getTelefono()+";"+estudiante.getDireccion()+";"+estudiante.getNivel()+";"+"\r\n");
            bfWriter.close();
            fw.close();
    }
  
    public  static void crearArchivo() throws IOException{
       File file=new File("Estudiante.txt");
        FileWriter fw=new FileWriter(file);
    }
    
    public static void leerArchivo(){
    estudiantes=new ArrayList<>();
    File file=new File("Estudiante.txt");
     Scanner reader;
    String line;
    try{
    reader=new Scanner(file);
   
    while(reader.hasNextLine()){
    line= reader.nextLine();
    
    Scanner delimiter=new Scanner(line);
    delimiter.useDelimiter("\\s*;\\s*");
    estudiantes.add( new Datos(delimiter.next(),delimiter.next(),delimiter.next(),delimiter.next(),delimiter.next(),delimiter.next(),delimiter.next(),delimiter.next(),delimiter.next(),Integer.parseInt(delimiter.next())));
    }
    }catch(FileNotFoundException s){
    System.out.println("fdfd");
    }
    
    }
    
    public static Datos buscarCedula(String cedula){
    leerArchivo();
    Datos info=new Datos("","","","","","","","","",0);
    for(Datos i:estudiantes){
   if((i.getCedula().trim()).equals(cedula.trim())){
    info=i;
    }
    }
    return info;
    }
      public static Datos buscarNombre(String nombre){
    Datos info=new Datos("","","","","","","","","",0);
    for(Datos i:estudiantes){
    if((i.getNombre().trim()).equals(nombre.trim())){
    info=i;
    }
    }
    return info;
    }
    public static Datos buscarApellido(String apellido){
    Datos info=new Datos("","","","","","","","","",0);
    for(Datos i:estudiantes){
    if((i.getApellido().trim()).equals(apellido.trim())){
    info=i;
    }
    }
    return info;
    }
    public static void eliminarDatos(Datos estudiante) throws IOException{
    estudiantes.remove(estudiante);
    crearArchivo(); 
    for(Datos j:estudiantes){
        agregarArchivo(j);
    }
    }
    public static String[][] leerRegistro(){
    leerArchivo();
    registro=new String[estudiantes.size()][9];
    for(int i=0;i<estudiantes.size();i++){
    registro[i][0]=estudiantes.get(i).getNombre();
    registro[i][1]=estudiantes.get(i).getApellido();
    registro[i][2]=estudiantes.get(i).getCedula();
    registro[i][3]=estudiantes.get(i).getEdad();
    registro[i][4]=estudiantes.get(i).getDia();
    registro[i][5]=estudiantes.get(i).getMes();
    registro[i][6]=estudiantes.get(i).getAnio();
    registro[i][7]=estudiantes.get(i).getTelefono();
    registro[i][8]=estudiantes.get(i).getDireccion();
    }
    return registro;
    } 
    public static void subirNivel(String cedula,int nivel) throws IOException{
        leerArchivo();
        for(Datos d:estudiantes){
            if(d.getCedula().equals(cedula)){
                d.setNivel(nivel);
                modificarLista();
            }
        }
        
    }
    static void modificarLista() throws IOException{
    crearArchivo();
    for(Datos r:estudiantes){
      agregarArchivo(r);
    }
    }
}
