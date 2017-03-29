/*
Fai un programa que lea unha frase e separe as palabras e as meta en un array de palabras e despois diga cal e a palabra con mais vocales.3 pts
 */
package examen_a;
import java.util.*;
/*Examen Josué García*/
public class Exer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String frase="";
       
        
        System.out.println("Introduce unha frase");        
        frase=sc.nextLine();
        StringTokenizer st=new StringTokenizer(frase);
        int cont=0;
        
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
            cont++;
            
        }
        
        
        System.out.println(cont);
        
         int[] palabra=new int[cont];
            Palabras aux=new Palabras();
         
         
         int posicion=0;
         
        //Reconstruir empleando la clase palabra
         /*
         while(st.hasMoreTokens()){
             palabra[posicion]=st.nextToken();
             System.out.println(palabra[posicion]);
             posicion++;
         }
   
         int max=0, vocales=0;
         String largo="";
   for (int i=0;i<posicion;i++){
       for(int v=0;v<palabra[i].length();v++){
           palabra[i]
        if(vocales>max){
            max=vocales;
            largo=palabra[i];
        }   
        vocales=0;
       }
   } 
    
        System.out.println("A palabra mais larga é: "+largo+" que ten "+max+" vocales");
    
    
    
    
    
    */
    
    }
    
}
