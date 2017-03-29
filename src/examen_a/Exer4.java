/*
 2)Fai un programa que permita validar a entrada de un código de producto co seguinte formato:NNN-AAAA!XX.
  O código de entrada será un string que cumplirá as seguintes reglas:
      1)As primeiras tres posicions son números do 0-9
      2)Despois e separado por un guion 4 letras maiusculas ordenadas alfabéticamente.
      3)E por ultimo separado por ¡ a suma dos tres dígitos do principio, en caso de que a suma sexa menor que 10, 
completarase con un cero a esquerda, de forma que o código sempre teña 12 caracteres, incluido o punto final.
 Si se cumplen estas tres condicions …devolverá: código aceptado en caso contrario código erróneo.  2ptos

 */
package examen_a;
import java.util.*;
/*Examen Josué García*/
public class Exer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String codigo="";
        int validar=0, cont=4;
        int[] n= new int[10];
        int[] asc=new int[11];
        
        System.out.println("Introduce un código");
        codigo=sc.nextLine();
        
        for(int i=0;i<codigo.length();i++){
            asc[i]=(int)codigo.charAt(i);
        }
      
        for (int i=0;i<3;i++){
          if((asc[i]>=0)&&(asc[i]<=9)){
              validar++;
          }
        }
        
        //2ª condicion
        if(asc[3]==45){
            validar++;
        }
            if((asc[4]<asc[5])&&(asc[5]<asc[6])&&(asc[6]<asc[7])){
                validar++;
            }
            //3ª condicion
            if (asc[8]==33){
                validar++;
            }
            int suma=0;
            suma=asc[0]+asc[0]+asc[0];
            if ((suma<10)&&(suma==asc[9])){
                validar++;
            }
            if(codigo.charAt(11)=='.'){
                validar++;
            }
            
            
            if(validar==6){
                System.out.println("Código correcto");
            }
            else{         
            
            if((suma>=10)&&(suma==asc[9-10])){
                validar++;
            }
            if(validar==7){
                System.out.println("Código correcto");
            }
            else{System.out.println("Código incorrecto");}
            }
    }
}
