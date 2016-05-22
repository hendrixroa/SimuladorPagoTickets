

package Datos;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.util.Calendar;

public class ticket {
    String id_ticket;
    String HE;
    String FE;
    int dia_actual;
    int mes_actual;
    int ano_actual;
    int minutos_actual;
    int hora_actual;
    //hora entrada
    //hora salida
    int hora_entrada;
    int minutos_entrada;
    int dia_entrada;
    int mes_entrada;
    int ano_entrada;
    
    
    
public ticket (int ticketN){
	File f=new File("TicketIngreso.txt");
	Scanner s;
	int cont=0;
	try {
		s = new Scanner(f);
		while ( s.hasNextLine()){ //while (s.hasNextLine){
			String linea = s.nextLine();
			Scanner sl= new Scanner(linea);
			sl.useDelimiter("[#\\s]");
			int t=0;
                        String l,g;
                        l=sl.next();
                        g=sl.next();
                        id_ticket=sl.next();
                        if(cont==ticketN){
                            
                            t = Integer.parseInt(id_ticket);
                            FE=l;
                            HE=g;
                            //id_ticket=sl.next();
               
                        //break;
                        }
                        
                        cont++;
			//}
		}
			
		s.close();
	} catch (FileNotFoundException e){
				e.printStackTrace();
			}
        
        Reloj r = new Reloj();
        dia_actual = r.Day();
        mes_actual = r.month()+1;
        ano_actual = r.Year();
        minutos_actual = r.minuto();
        hora_actual = r.hora();
	String d="/";
	String [] temp;
        String [] temp1;
      
	temp = FE.split(d);
        
        dia_entrada=Integer.parseInt(temp[0]);
        mes_entrada=Integer.parseInt(temp[1]);
        ano_entrada=Integer.parseInt(temp[2]);
        
        d=":";
	temp1 = HE.split(d);
        
        hora_entrada=Integer.parseInt(temp1[0]);
        minutos_entrada=Integer.parseInt(temp1[1]);
}

    public double procesar_ticket(){
       
    //PORQUE ?   
int delta_minutos;
int delta_hora = 0;
int delta_hora_1=0;
int delta_hora_2=0;
long horas_totales=0;
long monto_pagar;//PORQUE ?

       Calendar cal1 = Calendar.getInstance(); // Crear 2 instancias de Calendar
        Calendar cal2 = Calendar.getInstance();
      
        cal1.set(ano_entrada, mes_entrada, dia_entrada); // Establecer las fechas //cal1.set(2006, 12, 30)
         //System.out.println(ano_entrada +" "+ mes_entrada +" " + dia_entrada);
        cal2.set(ano_actual,mes_actual, dia_actual);//cal1.set(2007, 5, 3)
        //System.out.println(ano_actual+" "+ mes_actual +" " + dia_actual);
		
	// conseguir la representacion de la fecha en milisegundos
        long milis1 = cal1.getTimeInMillis();
        long milis2 = cal2.getTimeInMillis();
		
       // calcular la diferencia en milisengundos
        long diff = milis2 - milis1;

        long diffHours = diff / (60 * 60 * 1000);       // calcular la diferencia en horas de dias,meses,anos
   
       // long diffDays = diff / (24 * 60 * 60 * 1000);// calcular la diferencia en dias
	   		
		//Minutos 	
		if (((60-minutos_entrada)+(60-minutos_actual))!=0){ //si la fraccion de la hora es mayor q 1 min es una hora mas 
			delta_hora++;
		}
		//Horas
                //System.out.println(hora_entrada);
                //System.out.println(minutos_entrada);
                //System.out.println(hora_actual);
                //System.out.println(minutos_actual);
		delta_hora_1=24-hora_entrada;
		delta_hora_2=24-hora_actual;
		//System.out.println(delta_hora_1);
               // System.out.println(delta_hora_2);
                
		delta_hora=delta_hora+Math.abs(hora_entrada-hora_actual);// valor absoluto 
		//System.out.println(delta_hora);
		horas_totales=delta_hora+diffHours;
		//PORQUE ESTO AQUI//monto_pagar=tarifa*horas_totales;
        //System.out.println("En horas: diferencia de dias " + diffHours + " horas.");
		//System.out.println("En horas Totales: " + horas_totales + " horas.");
		
        //System.out.println("En dias: " + diffDays + " dias.");


return horas_totales;


    }
    
}
