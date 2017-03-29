/*
 1) Consideramos o peso de unha palabra como o valor da suma do valor ascii dos seus caracteres:
PE: hola o seu peso sera: 104+111+108+97=420     1.5 ptos

  Fai un programa que pida por teclado unha palabra e devolva o seu peso , supor que a cadea esta en minusculas  e que non conten ñ.

a    b  c   d   e   f   g  h  i  j  k  l  m  n  o  p  q  r  s  t  u  v  w  x  y   z
97  98  99 100 101 102 103...................................................121 122 
 */
package examen_a;
import java.util.*;

public class EXAMEN_A {
    /*Examen Josué García*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       
       String palabra="";
       
        System.out.println("Introduce unha palabra");
        palabra=sc.nextLine();
        
       int pesoAscii=0, cont=0, sumaPesos=0;
       
       while (cont<palabra.length()){
       pesoAscii=(int)palabra.charAt(cont);
        sumaPesos+=pesoAscii;
        cont++;
       }
       
       
        System.out.println("Peso da palabra en ascii="+sumaPesos);
        
        
        
}  
}
