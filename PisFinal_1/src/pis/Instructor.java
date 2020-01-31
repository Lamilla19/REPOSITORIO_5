/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pis;

import java.util.Scanner;

/**
 *
 * @author Green Studio
 */
public class Instructor {
    private String cedula;
    private String nombre;
    private String apellido;
    private String edad;
    private String cinturon;
    private String telefono;
    
    
    public Instructor(String cedula, String nombre, String apellido, String edad, String cinturon, String telefono){
    this.cedula = cedula;
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    this.cinturon = cinturon;
    this.telefono = telefono;
}
       public static boolean isInt(String str){
   boolean entero=true;
  char[] strch=str.toCharArray();
   for(int i=0;i<strch.length;i++){
   if(!Character.isDigit(strch[i])){
       entero=false;
   }
   }
   return entero;
  }
   public static boolean dosPalabras(String strw){
   Scanner sc=new Scanner(strw);
   sc.useDelimiter("\\s* \\s*");
   sc.next();
   if(sc.hasNext()){
   sc.next();}
   return !sc.hasNext();
   }

    public Instructor() {
        //To change body of generated methods, choose Tools | Templates.
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setCinturon(String cinturon) {
        this.cinturon = cinturon;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
   

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEdad() {
        return edad;
    }

    public String getCinturon() {
        return cinturon;
    }

    public String getTelefono() {
        return telefono;
    }
    
 
    
}
