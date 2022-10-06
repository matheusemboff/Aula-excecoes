/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author matheus.boff
 */
public class Program {
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        try{
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posicao invalida!");
        }
        catch (InputMismatchException e) {
            System.out.println("Entrada errada!");
        }
            System.out.println("FIM");
            
        sc.close();
        
    }
    
}
