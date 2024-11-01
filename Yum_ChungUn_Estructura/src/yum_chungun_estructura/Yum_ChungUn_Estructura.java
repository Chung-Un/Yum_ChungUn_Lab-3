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
        int numeroUsuario, numeroAleatorio, divisores=0, cantVotantes,votosAZUL=0,votosROJO=0,votosAMARILLO=0,votosNEGRO=0,votosNULO=0,opcion=0,opcionReves=0,opcionPerfecto=0,opcionPrimo=0,opcionVotos=0;
        String cadenaUsuario,votos;
        char letras, alreves;
        Scanner entrada = new Scanner (System.in);
        Random random = new Random();
       
        while(opcion!=5){
        System.out.println("**Menu**\nIngrese que ejercicio desea acceder\n1.Palabra Alreves\n2.Numero Perfecto\n3.Primos\n4.Votaciones\n5.Salir");
        opcion = entrada.nextInt();  
        entrada.nextLine();
        
        switch(opcion){
        
            case 1: 
                System.out.println("**Palabra al reves**\nIngrese su palabra:");
                cadenaUsuario= entrada.nextLine(); //se le solicira al usuario una palabra
                
                for (int j=cadenaUsuario.length()-1; j>=0;j--){ //el ciclo se realiza la cantidad de caracteres que tenga la cadena de texto
                alreves = cadenaUsuario.charAt(j);
                System.out.print(alreves + "\n");
                // ya que el ciclo resta a j, se imprime al reves
                }
                opcionReves++;
                break;
                
            case 2:
                System.out.println("**Numero perfecto**\nIngrese un numero:");//el usuario ingresa un numero
                numeroUsuario = entrada.nextInt();
                
                for(int i=1; i<numeroUsuario;i++){//se buscan los divisores del numero
                if(numeroUsuario % i ==0){
                divisores= divisores+i;//cada vez que se agrega un divisor, se suma
                }
                }
                
                if (divisores==numeroUsuario){//si la suma de los divisores es igual al numero, el numero es perfecto
                System.out.println("El numero es perfecto");
                }else{System.out.println("El numero no es perfecto");}
                opcionPerfecto++;
                break;
            
            case 3:
               numeroAleatorio = random.nextInt(1,100);
               System.out.println("Numero aleatorio " + numeroAleatorio); //el programa genera un numero aleatorio
               
               System.out.println("Los divisores de "+ numeroAleatorio + " son ");
               
               for(int i=1; i<=numeroAleatorio; i++){ //aqui se buscan los divisores del numero, validando los numero que al dividirlos entre el aleatorio dan un residuo 0
               if(numeroAleatorio % i==0){
               divisores++;
               System.out.print(i+" ");
               }}
               
               
               if(divisores==2){ // si solo tiene dos divisores, significa que solo son 1 y el numero Aleatorio; por esto, es primo
               System.out.println("\n El numero es primo");
               }else{
               System.out.println("\n El numero no es primo");
               }
               
               opcionPrimo++;
               break;
               
               
               
            case 4: 
                System.out.println("Ingrese la cantidad de votantes");//usuario ingresa la cantidad de votantes
                cantVotantes = entrada.nextInt();
                entrada.nextLine();
                
                for(int i=0; i<cantVotantes;i++){//pide los votos por la cantidad de votantes
                System.out.println("Ingrese su voto (AZUL,ROJO,NEGRO,AMARILLO)");
                votos = entrada.nextLine();
                
                switch(votos){
                    case "AZUL":
                        votosAZUL++;
                        break;
                    
                    case "ROJO":
                        votosROJO++;
                        break;
                        
                    case "NEGRO":
                        votosNEGRO++;
                        break;
                        
                    case "AMARILLO":
                        votosAMARILLO++;
                        break;
                        
                    default:
                        System.out.println("Voto nulo");
                        votosNULO++;
                        break;
                }
                }
                
                int votosValidos = votosAZUL+votosROJO+votosNEGRO+votosAMARILLO;//suma todos los votos validos
                double porcentaje= (votosValidos/cantVotantes) * 100; //saca el porcentaje para evaluar si la votacion es valida
                
                if(porcentaje>60){
                int planillaGanadora= Math.max(votosAZUL,Math.max(votosROJO,Math.max(votosNEGRO,votosAMARILLO)));//compara la cantidad de votos en cada uno para encontrar el maximo
                
                if (planillaGanadora == votosAZUL) {//busca cual planilla corresponde al maximo encontrado
                 System.out.println("La planilla ganadora es la planilla azul");
                 } else if (planillaGanadora == votosROJO) {
                 System.out.println("La planilla ganadora es la planilla roja");
                  } else if (planillaGanadora == votosNEGRO) {
                System.out.println("La planilla ganadora es la planilla negra");
                 } else if (planillaGanadora == votosAMARILLO) {
                 System.out.println("La planilla ganadora es la planilla amarilla");
                 }
                }else{System.out.println("Votacion fallida");}

                opcionVotos++;
                break;
                
                
            case 5:
                System.out.println("Cantidad de veces ingresado a:\nPalabra al reves:" + opcionReves + "\nNumeros perfectos:"+ opcionPerfecto + "\nNumeros primos:" + opcionPrimo + "\nVotaciones:"+ opcionVotos);
                break; //al final de cada case, se agrega uno al variable que corresponde a ese ejercicio
                }
                    
                
               }
    }
            
        
        
        
        
        
            }    
                
                        
                
            
               
               
               
      