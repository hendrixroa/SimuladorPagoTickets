package Datos;

import java.util.Arrays;

public class Cambio extends AbstractCambio {
    //int TotalEfectivo=0;
    //int Distribucion[];
    
    public Cambio(float Cambio){
    super.Cambio =Cambio;
    super.DistribucionBs = new int[6];
    this.Distribucion = new int [6];
    
    for(int i = 0; i < 6; i++){super.DistribucionBs[i]=0;
    }
    }
    
    
    @Override
    public void calcular_igualcero(float a, int[]b)
    {
        if(Float.compare(a, 0)==0){
        if (this.TotalEfectivo==0){
         for (int i=0;i<b.length;i++)
         {
             this.TotalEfectivo =this.TotalEfectivo+b[i];
         }
         this.Distribucion =Arrays.copyOf(b,b.length);
         }else{
        if(EsOptima(b)){
            this.TotalEfectivo=b[0]+b[1]+b[2]+b[3]+b[4]+b[5];
            this.Distribucion =Arrays.copyOf(b,b.length);
        }
        }
        }
    }
    public boolean EsOptima(int b[]){
        int Acc=0;
       // System.out.println(b.length + " longitud del EsOptima()");
        for (int i =0; i < b.length; i++){
        Acc += b[i];}
        System.out.println(Acc);
        
    if(Acc <= this.TotalEfectivo){
    System.out.println("Es optima");
    return true;
    }return false;}
    
    public int TotalBilletes(float []a){
    int Acc=0;
        for (int i =0; i < a.length; i++){Acc += a[i];}
    return Acc;
    }
    public void calcular_mayorcero(float a, int[]b)
    {
        if(Float.compare(a,0)>0){
        for (int i =5; i >=0; i--){
        int[] DistDistribucion= new int[b.length];
        DistDistribucion = Arrays.copyOf(b,b.length);
        if( i==0 && a==0.5f ){DistDistribucion[i]++; this.CalcularSolucionOptima(a-0.5f,DistDistribucion);}
        if( i==1){DistDistribucion[i]++; this.CalcularSolucionOptima(a-1f,DistDistribucion);}
        if( i==2){DistDistribucion[i]++; this.CalcularSolucionOptima(a-2f,DistDistribucion);}
        if( i==3){DistDistribucion[i]++; this.CalcularSolucionOptima(a-5f,DistDistribucion);}
        if( i==4){DistDistribucion[i]++; this.CalcularSolucionOptima(a-10f,DistDistribucion);}
        if( i==5){DistDistribucion[i]++; this.CalcularSolucionOptima(a-20f,DistDistribucion);}
        DistDistribucion=null;}
        }
    }
    public String getSolucion(){
    String solucion= "";
    for (int i =0; i < 6; i++){
    switch (i){
            case 0: 
           solucion += String.valueOf(this.Distribucion[i])+"/";
            
            break;
                
            case 1: 
            solucion += String.valueOf(this.Distribucion[i])+"/";
            
            break;
            
            case 2: 
            solucion += String.valueOf(this.Distribucion[i])+"/";
            
            break;
               
            case 3: 
            solucion += String.valueOf(this.Distribucion[i])+"/";
                       
            break;
            case 4: 
            solucion += String.valueOf(this.Distribucion[i])+"/";
            
            break;
            
            case 5: 
            solucion += String.valueOf(this.Distribucion[i])+"/";
            
            break;
    }}
    return solucion;
    }
}
