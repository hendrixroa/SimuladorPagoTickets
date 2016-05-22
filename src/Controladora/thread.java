package Controladora;

import Datos.Reloj;
import Documentos.registros_totales;
import Interfaz.I_Totales;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class thread extends Thread {
    
    
    registros_totales registros= registros_totales.getinstance();
   
     public void OpcionTotalizar(){
      
         Reloj rel = new Reloj();
         String horaMostrar=rel.getFechaActual();
         
         int numero_facturas = registros.getnumero_facturas();
         int numero_facturas_sin_ticket = registros.getnumero_facturas_sin_ticket();
         double montodiario = registros.getmonto_total_diario();
         double montofacturas_sin_ticket = registros.getmonto_total_facturas_sin_ticket();
         
        I_Totales totales = new I_Totales(numero_facturas,numero_facturas_sin_ticket,montodiario, montofacturas_sin_ticket,horaMostrar);
         
    }
    
    
    
    @Override
    public void run()
    {
        Reloj Reloj;
        Reloj = new Reloj();
        String [] temp=new String[4];
    int i=0;
    File f=new File("Configuraciones.txt");
    //Scanner s;
    String p = " ";
    try {
        FileReader s= new FileReader(f);
        BufferedReader br = new BufferedReader(s);
        String ln;
            while((ln=br.readLine())!=null){
            temp[i]=ln;//temp[3]=br.readLine();temp[1]=br.readLine();temp[2]=br.readLine();//temp[]=br.readLine();temp[2]=br.readLine();
              i++;
        }
        s.close();
    }catch (Exception e){
            e.printStackTrace();
    }
    String []temp1;String []temp2;String []temp3;
    temp1=temp[0].split(":");
    temp2=temp[1].split(":");
    temp3=temp[2].split(":");   
        while(true)
        {
            while(((Reloj.hora()*60)+Reloj.minuto())!=((Integer.parseInt(temp3[0])*60)+Integer.parseInt(temp3[1]))){}
            //reemplazar el showMessageDialog por la interfaz del reporte diario
           
           this.OpcionTotalizar();
            try {
                thread.sleep(60000);
                //  JOptionPane.showMessageDialog(null, "Reportando desde el proyecto"+122);
            } catch (InterruptedException ex) {
                Logger.getLogger(thread.class.getName()).log(Level.SEVERE, null, ex);
            }
                
       
        }
    }
}
