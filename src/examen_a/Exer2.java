/*
  Matriz escalar
Una matriz escalar e unha matriz diagonal na que os elementos da diagonal principal son iguales.

1 2 3
5 1 9
5 4 1     
Fai un programa o que se lle pasa primeiro o numero de filas e o numero de columnas , despois asignalle valores de forma aleatoria do 0-9 
e diga si a matriz e escalar  1.5           
 1 */
package examen_a;
import java.util.*;
/*Examen Josué García*/

public class Exer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rnd=new Random();
        
        int f=0, c=0;
       
        System.out.println("Introduce o número de filas");
        f=sc.nextInt();
        System.out.println("Introduce o número de columnas");
        c=sc.nextInt();
        
        int[][] escalar=new int[f][c];
        int aux=escalar[0][0], cont=0;
        
        if(f!=c){
            System.out.println("A matriz non é cadrada polo que non é escalar");
        }
        else{
        System.out.println("Matriz:");
        
        for (int i=0;i<f;i++){
            for (int j=0;j<c;j++){
                escalar[i][j]=rnd.nextInt(10);
                System.out.print(" "+escalar[i][j]);
            }
            System.out.println("");
        }
        
        for (int i=0;i<f;i++){
            for (int j=0;j<c;j++){
                if((i==j)&&(escalar[i][j]==aux)){
                    cont++;
                }
            }
        }
        
        
        if(cont==f){
            System.out.println("Matriz escalar");
        }
        else{
            System.out.println("Matriz non escalar");
        }
        
        
        
       }
}  
}
