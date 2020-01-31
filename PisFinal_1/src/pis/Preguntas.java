/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pis;


public class Preguntas {
private int nivel;
private int numero;
private String question;
private String respuesta;
private String alternativa1;
private String alternativa2;
private String alternativa3;
Preguntas(int nivel,int numero,String question,String respuesta,String alternativa1,String alternativa2,String alternativa3){
this.nivel=nivel;
this.numero=numero;
this.question=question;
this.respuesta=respuesta;
this.alternativa1=alternativa1;
this.alternativa2=alternativa2;
this.alternativa3=alternativa3;
}

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getAlternativa1() {
        return alternativa1;
    }

    public void setAlternativa1(String alternativa1) {
        this.alternativa1 = alternativa1;
    }

    public String getAlternativa2() {
        return alternativa2;
    }

    public void setAlternativa2(String alternativa2) {
        this.alternativa2 = alternativa2;
    }

    public String getAlternativa3() {
        return alternativa3;
    }

    public void setAlternativa3(String alternativa3) {
        this.alternativa3 = alternativa3;
    }

}
