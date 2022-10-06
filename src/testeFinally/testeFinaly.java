/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testeFinally;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author matheus.boff
 */
public class testeFinaly {
    public static void main(String args[]){
        
        File file = new File("C:\\Users\\matheus.boff\\Desktop\\senha.txt");
          Scanner sc = null;
          
          try{
              sc = new Scanner(file);
              while (sc.hasNextLine()) {
                  System.out.println(sc.nextLine());
              }
          }
          catch(FileNotFoundException e){
              System.out.println("Error opening: "+ e.getMessage());
          }
          finally{
              if(sc != null){
                  sc.close();
              }
          }
    }
}
