package Controladora;
import Datos.Reloj;
import Datos.Cambio;
import Interfaz.I_Acceso;
import Interfaz.I_Cambio;
import Interfaz.I_Efectivo;
import Interfaz.I_Pagar;
import Interfaz.I_factura;
import Datos.Tarifa;
import Datos.factura;
import Interfaz.i_cancelar_operacion;
import Datos.ticket;
import Documentos.registros_totales;
import Interfaz.I_Totales;
import javax.swing.JOptionPane;
public final class Controladora {
    private I_Acceso acces;
    private I_Cambio change;
    //private I_Cancelar cancel;
    private I_Efectivo efect;
    private I_Pagar pagar;
    private I_factura Ifact;
    private i_cancelar_operacion cancelOP;
    private Reloj reloj;
    private factura fact; 
    private double montoActual;
    private double montoFinal;
    private double tarifa;
    private int horasTotales;
    private int numTicket=0;
    private Controladora Control;
    private registros_totales registros;
    private double iva;
    private double montosiniva;
     private int idFact=0;
    private int b,c;//Estas variables no estan en el diagrama de clases
    //hay que buscar la manera de hacerlo sin ellas
    
    public void setinstance(Controladora ctrl, int hora_inicio, int minuto_inicio, int hora_cierre,int minuto_cierre, int hora_totalizar,int minuto_totalizar)
    {
        Control=ctrl;
        reloj=new Reloj();
        b=(hora_inicio*60)+minuto_inicio;
        c=(hora_cierre*60)+minuto_cierre;
        //this.Inicio(a,b,c,true);
        
        this.Inicio(true);
    }
    public Controladora()
    {
     
     registros=registros_totales.getinstance();
        
        
    }
    
    public double getMontoFinal(){
        return montoFinal;
    }
    
    public double getMontoTarifaFija(){
        return tarifa;
    }
    
   public void setTicket(){
       numTicket--;
   }
   
   public double getMontoActual(){
   return montoActual;
   }
       
       
 
   public void Inicio(boolean boo)
   {
       while((((reloj.hora()*60)+reloj.minuto())<b)||(((reloj.hora()*60)+reloj.minuto())>=c)){}
       if(boo)
       {
           I_Acceso vent = new I_Acceso(Control);
       }else{
           numTicket--;
           I_Acceso vent = new I_Acceso(Control);
       }
   }
    
    public void SeleccionTicket_SinTicket(int opc){
        
        
        switch(opc){
            //con ticket
            case 1:
                
                ticket tk=new ticket(numTicket); 
                numTicket++;
               
                
                
                
                horasTotales = (int)tk.procesar_ticket();
                fact = new factura(horasTotales);
                fact.calcular_monto_a_pagar();
                this.montoFinal = fact.getTotalconIva();
                this.montosiniva = fact.getTotal();
                this.iva = fact.getIva();
                 registros.totalizar(montoFinal,1);
               pagar = new I_Pagar(Control,montoFinal);
               pagar.I_PagarConticket();
               
              
               break;
                
                //sin ticket
            case 0:
                //pero con la tarifa de 200 bolos
                  Tarifa tarifa_2 = new Tarifa(); 
                tarifa_2.Tarifa();
               tarifa = tarifa_2.getTarifaTicketPerdido();
                registros.totalizar(tarifa,2);
                I_Pagar pag = new I_Pagar(Control,tarifa);
                
                  pag.I_Pagar_conTarifa();
                   
                  break;
              
        } 
    }
    
   
    
    
    public void SeleccionBotonesEfectivo(int opc,double montoActual, double montoFinal){
        
        switch(opc){
            case 1:
                if(montoActual >= montoFinal){
                    //System.out.println(montoFinal);
                    //System.out.println(montoActual);
                   double cambio = montoActual-montoFinal;
                   Cambio change1 = new Cambio((float) cambio);
                    change1.CalcularSolucionOptima((float) change1.Cambio, change1.DistribucionBs);
                 String solc = change1.getSolucion();
                 
                 
                 String d="/";
                String [] temp;
                
      
                temp = solc.split(d);

                    I_Cambio cam = new I_Cambio(cambio,temp,Control); 
                    idFact++;
                    
                }else{
                
                
                I_Efectivo efect = new I_Efectivo(Control,montoActual,montoFinal);
                 efect.I_EfectivoMostrar(montoActual);
                }
                 
                 
                
            break;
                
            case 2:
            i_cancelar_operacion canc = new i_cancelar_operacion(Control);
            canc.MostrarCancelar();
               
                break;
                
              case 3:
                  
                  i_cancelar_operacion cancelar = new i_cancelar_operacion(Control);
                  cancelar.i_cancelar_operacion_retiro(montoActual);
                  
                break;
                
                
            case 4:
               /* if(montoActual>=montoFinal){
                //procesar ...llamar a backtraking
                   
                    double cambio = montoActual-montoFinal;
                    System.out.println(cambio);
                    if(cambio!=0){
                        Cambio change1 = new Cambio(cambio);
                    change1.CalcularSolucionOptima(change1.Cambio, change1.DistribucionBs);
                 String solc = change1.getSolucion();
                   int sol[];      
                    sol = new int[6];
                    System.out.println(solc);
                    I_Cambio cam = new I_Cambio(cambio,sol,Control);
                  
                    }else{
                        */
                    JOptionPane.showMessageDialog(null, "No hay suficiente dinero ingresado");
                       
                          break;
                        
                    //}
                    
                    
                    
                    
                }
            
          
                }
           
      //  }
    
    
    public void OpcionFactura(){
        Reloj t=new Reloj();
        factura fc = new factura();
        String fecha = t.getFechaActual();
        String hora = t.getHoraActual();
        double mont = fc.getTotal();
       
        I_factura facture = new I_factura(fecha,hora,idFact,iva,montosiniva,montoFinal,Control);
       
    }
        
   
    
    
    
    
    
        
        
    }
    
    
   
    
  
    

    
    
    
    

