/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploherencia;

import java.util.Scanner;

/**
 *
 * @author RNS
 */
public class EjemploHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int x;
        System.out.println("Este es un ejemplo de herencia en java.");
        
        Gerente Andres = new Gerente(false, 1, "Andres","Argumedo","afiuqy43587tq",20);
        AnalistaDeDatos Pepe = new AnalistaDeDatos("Sitio Web","Mac", "Windows, OsX",2,"Pepe", "Hernández", "apoeir424542", 18);
        Limpieza Martín = new Limpieza(5,4,"Martín","Pinzón","pqw98e7347qf",17);
        do{
        System.out.println("Gerente... Desea poner a trabajar a su equipo?\n"
                + "1. Si\n"
                + "2. no\n");
       scan = new Scanner(System.in);
      
        x = scan.nextInt();
        scan.nextLine();
           // System.out.println();
        if(x==1){
            Andres.ordenar();
            
            if(Andres.isOrden()){
                Pepe.analizarProyecto();
                Martín.limpiarPiso();
            }
            System.out.println("Desea Salir");
            scan = new Scanner(System.in);
            
            x=scan.nextInt();
            scan.nextLine();
            //System.out.println();
        }else{
            System.out.println("Desea Salir?\n"
                    + "1. Si\n"
                    + "2. No\n");
            scan = new Scanner(System.in);
            
            x=scan.nextInt();
            scan.nextLine();
           // System.out.println();
        }
        }while(x==2);
        
        
        
    }
    
}
