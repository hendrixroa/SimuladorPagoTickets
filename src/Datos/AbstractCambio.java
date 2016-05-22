
package Datos;

import java.util.Arrays;


public abstract class AbstractCambio {
    public double Cambio;
    public int TotalEfectivo=0;
    public int Distribucion[];
    public int DistribucionBs[];
    
    public void CalcularSolucionOptima(float a, int[]b)
    {
        calcular_igualcero(a, b);
        calcular_mayorcero(a,b);
    }
    public abstract void calcular_igualcero(float a, int[]b);
    public abstract void calcular_mayorcero(float a, int[]b);
    public abstract String getSolucion();
    public abstract boolean EsOptima(int b[]);
    public abstract int TotalBilletes(float []a);
    
    
}
