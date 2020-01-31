/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pis;

import java.util.Scanner;

/**
 *
 * @author PC-01
 */
public class Datos {
   private String cedula;
   private String nombre;
   private String apellido;
   private String Dia;
   private String Mes;
   private String Anio;
   private String Edad;
   private String telefono;
   private String direccion;
   private int nivel;
    public Datos(String cedula, String nombre, String apellido, String Dia, String Mes, String Anio, String Edad, String telefono, String direccion,int nivel) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.Dia = Dia;
        this.Mes = Mes;
        this.Anio = Anio;
        this.Edad = Edad;
        this.telefono = telefono;
        this.direccion = direccion;
        this.nivel=nivel;
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
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getCedula(){
   return cedula;
       }
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDia() {
        return Dia;
    }

    public void setDia(String Dia) {
        this.Dia = Dia;
    }

    public String getMes() {
        return Mes;
    }

    public void setMes(String Mes) {
        this.Mes = Mes;
    }

    public String getAnio() {
        return Anio;
    }

    public void setAnio(String Anio) {
        this.Anio = Anio;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }
    
    public int getNivel(){
    return  nivel;
    }
    public void setNivel(int nivel){
    this.nivel=nivel;
    }
}
