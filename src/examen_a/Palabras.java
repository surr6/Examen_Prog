/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_a;
/*Examen Josué García*/

public class Palabras {
   private String palabra;
   private int numVocales;
   
   public Palabras(){
       
   }
   public Palabras (String pal, int numvocales){ //contructor que lle da valor a palabra e a numVocales  //0,5
       this.palabra=pal;
       this.numVocales=numvocales;
   } 
   public int contaVocales(){ //metodo que retorna o numero de vocales da palabra  // 0.5 ptos
       int v=0;
       while (v<palabra.length()){
    if((palabra.charAt(v)=='a')||(palabra.charAt(v)=='e')||(palabra.charAt(v)=='i')||(palabra.charAt(v)=='o')||(palabra.charAt(v)=='u')){
               numVocales++;
           }
       }
       return numVocales;
   }
   
   public void setPalabra(String palabra) { //metodo que permite modificar o valor da palabra por parametros e actualiza o numVocales  0.125 pts
      
   }
   public String getPalabra(){  //metodo que devolve a palabra.  0.125 pts
       return this.palabra;
   }
   public  int getNumVocales(){  //metodo que devolve o numero de vocales  0.75
       return this.numVocales;
   }
   
   
}
