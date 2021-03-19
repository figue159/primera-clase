/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication52;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 57322
 */
public class JavaApplication52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        consola(2);
          
    }
    public static void consola(int a){
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.println("digite numero");
        n=entrada.nextInt();
        System.out.println("su numero digitado fue: "+ n);
    }
    
    public static void consola() {
        Scanner entrada = new Scanner(System.in);
        int n;
        n=Integer.parseInt(JOptionPane.showInputDialog("digite numero: "));
        
        JOptionPane.showMessageDialog(null, " el numero digitado es: "+n);
    }
    public static void conversores() {
       int entero = 10;
       String cadena = "cosmico";
       double dubl = 5.2;
       
       entero = (int) dubl;
       
       cadena = Integer.toString(entero);
       cadena = String.valueOf(entero);
       
    }
    public static void pruebafor(){
        for (int i = 0; i < 10; i++) {
            System.out.println("repeticion "+i);
        }
    }
    public static void selectivas() {
        int a= 0 ;
        String b="siga";
        
        if (a==0 & b.equals("sigue")){
            System.out.println("verdadero");
        }else{
            System.out.println("falso");
        }
    }
    
}
