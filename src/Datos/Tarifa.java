
package Datos;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Locale;


public class Tarifa {
private double ticketPerdido;
private double ticketNoPerdido;


//constructor ticket
public void Tarifa(){
   ArrayList <Double> lista;
   System.out.println("HOLA");
    lista = new ArrayList<>();
    //hacer lista para leer valores 
    try{
            // Abrimos el archivo
            FileInputStream fstream = new FileInputStream("tarifas.txt");
        // Creamos el Buffer de Lectura
          DataInputStream entrada = new DataInputStream(fstream);
            
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            String strLinea;
            // Leer el archivo linea por linea
            while ((strLinea = buffer.readLine()) != null)   {
                
                double val = Double.parseDouble(strLinea);
                System.out.println(val);
                lista.add(val);
            }
            // Cerramos el archivo
        }
        catch (IOException | NumberFormatException e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
    ticketNoPerdido = lista.get(0);
    ticketPerdido = lista.get(1);
  
}

public double getTarifaTicket(){
    
 
    return ticketNoPerdido;
}

public double getTarifaTicketPerdido(){
     
    return ticketPerdido;
}
  
}
