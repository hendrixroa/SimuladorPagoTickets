/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Documentos;

import Datos.Reloj;
import Interfaz.I_Totales;

public class registros_totales {
   private static registros_totales instance;
    private double monto_total_diario;
    private double monto_total_facturas_sin_ticket;
    private int numero_facturas;
    private int numero_facturas_sin_ticket;
   private registros_totales()
    {
        numero_facturas=0;
        monto_total_diario=0;
        numero_facturas_sin_ticket=0;
        monto_total_facturas_sin_ticket=0;
    }
   public void totalizar(double monto_factura, int opcion_de_pago){
        switch(opcion_de_pago)
        {
            case 1:
                numero_facturas++;
                monto_total_diario=monto_total_diario+monto_factura;
                break;
            case 2:
                numero_facturas_sin_ticket++;
                monto_total_facturas_sin_ticket=monto_total_facturas_sin_ticket+monto_factura;
                break;
            default:
                break;
        }
        
    
    }
  public static registros_totales getinstance()
    {
        if (instance == null)
        {
            instance=new registros_totales();
        }
        return instance;
    }
    
    void reinicializar_totales (){
        numero_facturas=0;
        monto_total_diario=0;
        numero_facturas_sin_ticket=0;
        monto_total_facturas_sin_ticket=0;
    }
    
    
    
    
 
    public double getmonto_total_diario()
    {
        return monto_total_diario;
    }
    public double getmonto_total_facturas_sin_ticket()
    {
        return monto_total_facturas_sin_ticket;
    }
    public int getnumero_facturas()
    {
        return numero_facturas;
    }
    public int getnumero_facturas_sin_ticket()
    {
        return numero_facturas_sin_ticket;
    }
}
