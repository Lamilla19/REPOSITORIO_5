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


public class Matricula {
static List<Matricula> inscritos;
private String nombreEstudiante;
private String apellidoEstudiante;
private String cedulaEstudiante;
private String nombreProfesor;
private String apellidoProfe;
private int nivelIns;
Matricula(String nombreEstudiante,String apellidoEstudiante,String cedulaEstudiante,String nombreProfesor,String apellidoProfe,int nivelIns){
this.nombreEstudiante=nombreEstudiante;
this.apellidoEstudiante=apellidoEstudiante;
this.cedulaEstudiante=cedulaEstudiante;
this.nombreProfesor=nombreProfesor;
this.apellidoProfe=apellidoProfe;
this.nivelIns=nivelIns;
}

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public String getApellidoEstudiante() {
        return apellidoEstudiante;
    }

    public String getCedulaEstudiante() {
        return cedulaEstudiante;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public String getApellidoProfe() {
        return apellidoProfe;
    }

    public int getNivelIns() {
        return nivelIns;
    }
public static void GuardarInscripcion(Matricula inscrito) throws IOException{
  File file=new File("Inscripciones.txt");
        FileWriter fw=new FileWriter(file,true);
        BufferedWriter bfWriter;
        bfWriter = new BufferedWriter(fw);
            bfWriter.write(""); 
            bfWriter.write(inscrito.getNombreEstudiante()+";"+inscrito.getApellidoEstudiante()+";"+inscrito.getCedulaEstudiante()+";"+inscrito.getNombreProfesor()+";"+inscrito.getApellidoProfe()+";"+inscrito.getNivelIns()+";"+"\r\n");
            bfWriter.close();
            fw.close();
}
public static void leerMatriculas(){
    inscritos=new ArrayList<Matricula>();
    File file=new File("Inscripciones.txt");
     Scanner reader;
    String line;
    try{
    reader=new Scanner(file);
   
    while(reader.hasNextLine()){
    line= reader.nextLine();
    
    Scanner delimiter=new Scanner(line);
    delimiter.useDelimiter("\\s*;\\s*");
    inscritos.add( new Matricula(delimiter.next(),delimiter.next(),delimiter.next(),delimiter.next(),delimiter.next(),Integer.parseInt(delimiter.next())));
    }
    }catch(FileNotFoundException s){
     System.out.println("vales tres atados");
    }
    



}
public static Matricula buscarInscrito(String cedula){
leerMatriculas();
Matricula inscrito=new Matricula("","","","","",0);
for(Matricula m:inscritos){
if(m.getCedulaEstudiante().equals(cedula)){
inscrito=m;
}
}
return inscrito;
}
}

