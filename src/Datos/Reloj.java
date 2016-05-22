
package Datos;

  import java.util.Calendar;
import java.util.GregorianCalendar;
public class Reloj extends Thread {

    
   private Calendar fecha;
   private String fechaActual;
   private String HoraActual;
  
    public Reloj(){
        this.fecha = new GregorianCalendar();
    }
    
    public String getFechaActual(){
        fechaActual=concatenarFecha();
    return fechaActual;
    }
    
     public String getHoraActual(){
        HoraActual=concatenarHora();
    return HoraActual;
    }
   
    public int Year(){
        return fecha.get(Calendar.YEAR);
    }   
   
      public int Day(){
        return fecha.get(Calendar.DAY_OF_MONTH);
    }   
      
       public int month(){
        return fecha.get(Calendar.MONTH);
    } 
      
    public int hora(){
        this.fecha = new GregorianCalendar();
        return fecha.get(Calendar.HOUR_OF_DAY);
    }
    
     public int minuto(){
         this.fecha = new GregorianCalendar();
        return fecha.get(Calendar.MINUTE);
    }
     
      public int segundo(){
        return fecha.get(Calendar.SECOND);
    }
    
       public String concatenarFecha(){
           Reloj t = new Reloj();
           int d = this.Day();
           int m = this.month()+1;
           int y = t.Year();
           
            String st  = "";
            st +=d;
            st +="/";
            st +=m;
            st +="/";
            st +=y;
            st+="\n";
            return st;
       }
       public String concatenarHora(){
           //Reloj t = new Reloj();
           int ho = this.hora();
           int min = this.minuto();
           int sec = this.segundo();
           
            String st = "";
            st +=ho;
            st +=":";
            st +=min;
            st +=":";
            st +=sec;
            st +="\n";
            return st;
       }
    
   @Override
  public void run(){
      //Reloj t = new Reloj();
       
    for (int i=0;i<10;i++){
        
        try {
            
            Reloj.sleep(20);
            fechaActual = this.concatenarFecha();
            HoraActual = this.concatenarHora();
        } catch (InterruptedException ex) {
            System.out.println("error");
            //Thread.currentThread().interrupt();
            //Logger.getLogger(hilo1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  }   
       
       
    
    
    
    
}
