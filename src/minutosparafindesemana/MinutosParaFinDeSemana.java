/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minutosparafindesemana;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class MinutosParaFinDeSemana {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalminutos;
        System.out.println("Introduce una hora con el siguiente formato (ej. 07:50)");
        String hora = sc.nextLine();
        System.out.println("Introduce un dia de la semana");
        String dia = sc.nextLine();
        String[] arrayhora;
        arrayhora = hora.split(":");
        String h = arrayhora[0];
        String m = arrayhora[1];
        int horas = Integer.parseInt(h);
        int minutos = Integer.parseInt(m);
        totalminutos = (horas*60)+ minutos;
        
     
     switch(dia.toLowerCase())
        {
            case "lunes":
                int faltalunes = 6660-totalminutos;
                System.out.println("Faltan "+faltalunes+" minutos para el fin de semana");
                break;
            case "martes":
                int faltamartes = 5220-totalminutos;
                System.out.println("Faltan "+faltamartes+" minutos para el fin de semana");
                break;
            case "miercoles":
                int faltamiercoles = 3780-totalminutos;
                System.out.println("Faltan "+faltamiercoles+" minutos para el fin de semana");
                break;
            case "jueves":
                int faltajueves = 2340-totalminutos;
                System.out.println("Faltan "+faltajueves+" minutos para el fin de semana");
                break;
            case "viernes":
                int faltaviernes = 900-totalminutos;
                System.out.println("Faltan "+faltaviernes+" minutos para el fin de semana");
                break;
            default:
                System.out.println("Introduce un dia de diario");
                break;
        }
    
    }
    
}
