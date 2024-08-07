/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.vista;

import java.util.Scanner;

/**
 *
 * @author Santiago
 */
public class Aplicacion {
    static Scanner leer = new Scanner(System.in);
  
    public static void main(String[] args) {
       
        division();
        
    }
    
    public static void suma(){
        int x,y,z;
        System.out.println("Hola esta es la suma de dos numeros: ");
        System.out.println("Ingresa un valor a x:");
        x=leer.nextInt();//Leer x;
        System.out.println("Ingresa el valor de y:");
        y=leer.nextInt();
        z=x+y;
        System.out.println("La respuesta es: "+z);
    }
    
    public static void multiplicacion(){
        int w,o,p;
        System.out.println("Esta es la Multiplicación");
        System.out.println("ingresa el valor de w:");
        w=leer.nextInt();
        System.out.println("ingresa el valor de o:");
        o=leer.nextInt();
        p=w*o;
        System.out.println("Elproducto es: "+p);
    }
        
    public static void numerosUnoDiezFor(){
        System.out.println("Se van a generar los numeros del uno al 10");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }
    public static void numerosUnoDiezWhile(){
        System.out.println("Se van a generar los numeros del 1 al 10");
        int i=1;
        while (i<11) {            
            System.out.println(i);
            i+=1;  //i++; ++i; i=i+1
        }
    }
    
    public static void numerosUnoDiezDoWhile(){
        System.out.println("Se van a generar los numeros del 1 al 10");
        int i=1;
        do {            
            System.out.println(i);
            i=i+1;
        } while (i<11);
    }
    
    public static void division(){
        float x, y, z;
        System.out.println("Ingresa el dividendo");
        x=leer.nextFloat();
        System.out.println("Ingresa el divisor");
        y=leer.nextFloat();
        z=x/y;
        System.out.println("El cociente es: "+z);
    }
    
}
