/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;
import model.exceptions.DomainException;

/**
 *
 * @author matheus.boff
 */
public class runProgram {
    public static void main(String args[]){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.println("Informe os dados da conta: ");
            System.out.print("Numero: ");
            int num = sc.nextInt();
            System.out.print("Titular: ");
            sc.nextLine();
            String titular = sc.nextLine();
            System.out.print("Saldo inicial: ");
            double saldo = sc.nextDouble();
            System.out.print("Limite de saque: ");
            double limite = sc.nextDouble();
            Account acc = new Account(num,titular,saldo,limite);


            System.out.print("Informe uma quantia para sacar: ");
            double saque = sc.nextDouble();
            acc.withdraw(saque);
            System.out.println("Saldo: " + acc.getBalance());
        }
        catch (DomainException e){
            System.out.println("Error: "+e.getMessage());
        }
        catch(RuntimeException e) {
            System.out.println("ERRO inesperado");
        }
    }
}
