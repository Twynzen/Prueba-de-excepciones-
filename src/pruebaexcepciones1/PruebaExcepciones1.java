
package pruebaexcepciones1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class PruebaExcepciones1 {

    
   
  
 
  
    
    public static void main(String[] args)throws FileNotFoundException, IOException {
       //Excepciones verificadas IOExcepcion
        //Lectura de archivo txt
        
       BufferedReader bf= new BufferedReader(new FileReader("C:\\Users\\LuisF\\Documents\\NetBeansProjects\\PruebaExcepciones2\\texto.txt")); 
       String  linea;
      
       while((linea=bf.readLine())!=null){
        System.out.println(linea);
    }
      
    }
    
}
