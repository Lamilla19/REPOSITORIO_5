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


public class Aspirante {
 private String cedula;
 private String aprobado;
 private int nivel;
 static List<Aspirante> aspirantes;
 Aspirante(String cedula,String aprobado,int nivel){
 this.cedula=cedula;
 this.aprobado=aprobado;
 this.nivel=nivel;
 }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getAprobado() {
        return aprobado;
    }

    public void setAprobado(String aprobado) {
        this.aprobado = aprobado;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
 public static void crearAspirante(Aspirante asp) throws IOException{
      File file=new File("Aspirantes.txt");
        FileWriter fw=new FileWriter(file,true);
        BufferedWriter bfWriter;
        bfWriter = new BufferedWriter(fw);
            bfWriter.write(""); 
            bfWriter.write(asp.getCedula()+";"+asp.getAprobado()+";"+asp.getNivel()+"\r\n");
            bfWriter.close();
            fw.close();
 }
 public static void leerAspirante(){
    aspirantes=new ArrayList<Aspirante>();
    File file=new File("Aspirantes.txt");
     Scanner reader;
    String line;
    try{
    reader=new Scanner(file);
   
    while(reader.hasNextLine()){
    line= reader.nextLine();
    
    Scanner delimiter=new Scanner(line);
    delimiter.useDelimiter("\\s*;\\s*");
    aspirantes.add( new Aspirante(delimiter.next(),delimiter.next(),Integer.parseInt(delimiter.next())));
    }
    }catch(FileNotFoundException s){
    System.out.println("fdfd");
    }
    
 }
}
