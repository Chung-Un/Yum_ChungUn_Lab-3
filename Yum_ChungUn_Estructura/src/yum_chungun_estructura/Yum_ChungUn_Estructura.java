/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yum_chungun_estructura;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author chung
 */
public class Yum_ChungUn_Estructura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion, numeroUsuario, numeroAleatorio, divisores=0;
        String cadenaUsuario;
        char letras, alreves;
        Scanner entrada = new Scanner (System.in);
        Random random = new Random();
       
        
        System.out.println("**Menu**\nIngrese que ejercicio desea acceder\n1.Palabra Alreves\n2.Numero Perfecto\n3.Primos\n4.Votaciones");
        opcion = entrada.nextInt();  
        entrada.nextLine();
        
        switch(opcion){
        
            case 1: 
                System.out.println("**Palabra al reves**\nIngrese su palabra:");
                cadenaUsuario= entrada.nextLine(); //se le solicira al usuario una palabra
                
                for (int j=cadenaUsuario.length()-1; j>=0;j--){ //el ciclo se realiza la cantidad de caracteres que tenga la cadena de texto
                alreves = cadenaUsuario.charAt(j);
                System.out.print(alreves); // ya que el ciclo resta a j, se imprime al reves
                }
                break;
                
            case 2:
                System.out.println("**Numero perfecto**\nIngrese un numero:");
                numeroUsuario = entrada.nextInt();
                
                break;
            
            case 3:
               numeroAleatorio = random.nextInt(1,100);
               System.out.println("Numero aleatorio " + numeroAleatorio);
               
               System.out.println("Los divisores de "+ numeroAleatorio + " son ");
               
               for(int i=1; i<=numeroAleatorio; i++){
               if(numeroAleatorio % i==0){
               divisores++;
               System.out.print(i+" ");
               }}
               
               
               if(divisores==2){
               System.out.println("El numero es primo");
               }else{
               System.out.println("El numero no es primo");
               }
               
               }
                
            }
            }
               
               
               
      