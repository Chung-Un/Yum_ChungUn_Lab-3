/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yum_chungun_estructura;

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
        int opcion;
        String cadenaUsuario;
        char letras, alreves;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("**Menu**\nIngrese que ejercicio desea acceder\n1.Palabra Alreves\n2.Numero Perfecto\n3.Primos\n4.Votaciones");
        opcion = entrada.nextInt();  
        entrada.nextLine();
        
        switch(opcion){
        
            case 1: 
                System.out.println("**Palabra al reves**\nIngrese su palabra:");
                cadenaUsuario= entrada.nextLine();
                
                for (int j=cadenaUsuario.length()-1; j>=0;j--){
                alreves = cadenaUsuario.charAt(j);
                System.out.print(alreves);
                }
                
        
        }

    }
    
}
