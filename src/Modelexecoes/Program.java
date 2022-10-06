/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelexecoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author matheus.boff
 */
public class Program {
    public static void main(String args[]) throws ParseException{
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.print("Room number: ");
        int number = sc.nextInt();
        System.out.print("Check-in date (dd/MM/yyyy): ");
        Date checkin = sdf.parse(sc.next());
        System.out.print("Check-out date (dd/MM/yyyy): ");
        Date checkout = sdf.parse(sc.next());
        
        if(!checkout.after(checkin)){
            System.out.println("Error in reservation: Check-out date must be after check-in date");
            
        }else{
            Reservation res = new Reservation(number,checkin,checkout);
            System.out.println("Reservation: "+ res);
            
            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.println("Check-in date (dd/MM/yyyy): ");
            checkin = sdf.parse(sc.next());
            System.out.println("Check-out date (dd/MM/yyyy): ");
            checkout = sdf.parse(sc.next());
            
            
                String error = res.updateDates(checkin, checkout);
                if (error != null) {
                    System.out.println("Error in reservation: "+ error);
                }else{
                System.out.println("Reservation: "+ res);
                }
            
            

        }
            
            
        sc.close();
    }
}
