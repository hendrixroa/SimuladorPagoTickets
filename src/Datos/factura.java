/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Datos;

import Datos.Tarifa;

/**
 *
 * @author Jorge Gavidia
 */
public class factura {
   
    double efectivo;
    double vuelto;
    double total;
    double total_con_iva;
    float total_ticket_perdido;
    int id_factura=0;
    private String fechaActual;
    private String horaActual;
    boolean factura_perdida;
    int total_factura_perdida;
    int horas;
    private double IVA;
    
    public factura(){}
    
    public factura(int hours){
       horas=hours;
       Reloj r=new Reloj();
       fechaActual = r.getFechaActual();
       horaActual = r.getHoraActual();
       id_factura++;
      
    }
    
    
    public float generar_factura (/*paso hora actual fecha actual*/){
    float monto_a_pagar = 0;
    return (monto_a_pagar);/*monto a pagar*/
    }
    void calcular_tiempo_transcurrido (){
    
    }
    void calcular_hora_maxima_de_salida (){
        
        
        
     
    }
     public void calcular_monto_a_pagar (){
         
                Tarifa tarifa_1 = new Tarifa(); 
                tarifa_1.Tarifa();
               double tar = tarifa_1.getTarifaTicket();
               total=tar*horas;
              int aux; 
                aux = (int) ((total*0.12 + total));
                total_con_iva = aux;
                
               aux =(int)(total*0.12);
               IVA=aux;
               
    }
     
     public double getTotal(){
         return total;
     }
     
     public double getTotalconIva(){
         return total_con_iva;
     }
     
     public double getIva(){
         return IVA;
     }
     
     public String getFecha(){
         return fechaActual;
     }
     public String getHora(){
         return horaActual;
     }
      public int getIdfactura(){
         return id_factura;
     }
     
     
      void imprimir_factura (){
     
    }


}
