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


public class Archivo {
 
static List<Preguntas> preguntas;
static List<Preguntas> QuestCinNegro;
static List<Preguntas> QuestCinNegro1Dan;
static List<Preguntas> QuestCinNegro2Dan;
static List<Preguntas> QuestCinNegro3Dan;
   public static void crearArchivo(Preguntas quest) {
       FileWriter flwriter = null;
                try {//además de la ruta del archivo recibe un parámetro de tipo boolean, que le indican que se va añadir más registros 
	          flwriter = new FileWriter("Temario.txt",true);
                 try (BufferedWriter bfwriter = new BufferedWriter(flwriter)) {
                      bfwriter.write(quest.getNivel()+ ";" +quest.getNumero()+ ";" +quest.getQuestion()+";"+quest.getRespuesta()+";"+quest.getAlternativa1()+";" +quest.getAlternativa2()+";"+ quest.getAlternativa3()+ "\r\n");
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

   public static void llenarLista(){
         preguntas=new ArrayList<Preguntas>();
		
		File file = new File("Temario.txt");
		            Preguntas question = new Preguntas(0,0,"","","","","");
                           
			    Scanner reader;
                                 String line;
                     try{
                         reader=new Scanner(file);
                      while(reader.hasNextLine()){
                 line= reader.nextLine();
                           
                          Scanner delimitar=new Scanner(line);
                         delimitar.useDelimiter("\\s*;\\s*");
				question=new Preguntas(Integer.parseInt(delimitar.next()),Integer.parseInt(delimitar.next()),delimitar.next(),delimitar.next(),delimitar.next(),delimitar.next(),delimitar.next());
                                preguntas.add(question);
                                
			}
			//se cierra el ojeto scanner
			
                        reader.close();
                       
		} catch (FileNotFoundException e) {
                    e.printStackTrace();
		}
                llenarCinturones();
              	
   }
   private static void llenarCinturones(){
    QuestCinNegro=new ArrayList<Preguntas>();
QuestCinNegro1Dan=new ArrayList<Preguntas>();
QuestCinNegro2Dan=new ArrayList<Preguntas>();
QuestCinNegro3Dan=new ArrayList<Preguntas>();
       
   for(Preguntas p:preguntas){
   if(p.getNivel()==1){
   QuestCinNegro.add(p);
   }
   if(p.getNivel()==2){
   QuestCinNegro1Dan.add(p);
   }
   if(p.getNivel()==3){
   QuestCinNegro2Dan.add(p);
   }
   if(p.getNivel()==4){
   QuestCinNegro3Dan.add(p);
   }
   }
   }
  public static void actualizarArchivo() throws IOException{
  borrarArchivo();
  for(Preguntas i:preguntas){
  crearArchivo(i);
  }
  }
   public  static void borrarArchivo() throws IOException{
       File file=new File("Temario.txt");
        FileWriter fw=new FileWriter(file);
    }
}
