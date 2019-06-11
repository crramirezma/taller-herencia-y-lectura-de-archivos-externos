/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.pkg2;
import java.io.*;//for file
import java.util.*;
public class Parcial2 {

  
    public static void main(String[] args) throws FileNotFoundException {
      
           File f=new File ("datos.txt");

     Scanner input=new Scanner (new File ("datos.txt"));
     input.useDelimiter(",");

      int count=0;
        System.out.println("_______________");
        while (input.hasNext()){
        String  word=input.next();
        count++;
            
      // System.out.println("\n" +count +" . palabra: "+ word);//imprime lo que tengo
      
            for(int c=0;c<word.length();c++){
           
           //      System.out.println(c + " Posicion:  "+word.charAt(c) );
             
             int conversion;
             for(int d=0;c<word.length();c++){
              Integer hola=Integer.valueOf(word.charAt(c));
       
            //System.out.println("hola es:"+ hola);
            if(67<hola&&hola<91){
                
                conversion=((hola-3)-64)%26;
                  // System.out.println("Estas en el if");
               // System.out.print("PALABRA DESENCRIPTADA:  "+(char)(conversion+64));
               System.out.print((char)(conversion+64));
            }else if(64<hola&&hola<67){
                conversion=(((hola+25)-3)-64)%26;
               // System.out.println("Estas en el else");
               // System.out.print("PALABRA DESENCRIPTADA: "+(char)(conversion+64));
               
               
               System.out.print((char)(conversion+64));
            }else if(47<hola&&hola<58){
                
                int numeros=hola-48;
                     System.out.print(numeros);
            
            }
                
        }
                System.out.println("");
       
                }
        }   
        System.out.println("_______________________");
    }
    
}
