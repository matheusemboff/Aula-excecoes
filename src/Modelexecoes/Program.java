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
import model.exceptions.DomainException;

/**
 *
 * @author matheus.boff
 */
public class Program {
    public static void main(String args[]) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try{
            System.out.print("Room number: ");
            int number = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkin = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkout = sdf.parse(sc.next());


            Reservation res = new Reservation(number,checkin,checkout);
            System.out.println("Reservation: "+ res);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkin = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkout = sdf.parse(sc.next());


            res.updateDates(checkin, checkout);
            System.out.println("Reservation: "+ res);
        }
        catch (ParseException e)  {
             System.out.println("Formato de data invalido");
        }
        catch (DomainException e){
            System.out.println("Error in reservation: "+e.getMessage());
        }
        catch(RuntimeException e) {
            System.out.println("ERRO inesperado");
        }
         
        sc.close();
    }
}
