/**
 * Métodos para convertir unidades de volumen del sistema británico a litros del sistema métrico
 * Esta clase implementa los métodos para convertir bitcoin, dolar americano, dínar tunecino, chelín comalí a euros
 * @author: Equipo <indicar equipo> Proyecto colavorativo clase MGCSS-Universidad de Huelva
 */
package mgcss.conversor;

import java.text.DecimalFormat;

public class moneda {
    // TODO resto de métodos
    
    private static DecimalFormat df2 = new DecimalFormat(".##");
    
    public static double ConvertirBitcoinaAEuro(double cantidad){
        
        return cantidad*3413.75;
        
    }
    
    public double ConvertirDolarAEuro(double cantidad){
        
        return cantidad*0.89;
    }
    
    
    public double ConvertirTunecinoAEuro(double cantidad){
        
        return cantidad*0.29;
    }
    
    public double ConvertirChelinComaliAEuro(double cantidad){
        
        return cantidad*0.0015;
    }
}