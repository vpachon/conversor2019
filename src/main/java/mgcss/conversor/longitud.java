/**
 * M√©todos para convertir unidades de longitud del sistema brit√°nico a kil√≥metros del sistema m√©trico
 * Esta clase implementa los m√©todos para convertir millas, estadios, cadenas, barras, yardas, pies y manos
 * a kil√≥metros.
 * @author: Equipo JAVIER TUR GARCÕA Proyecto colavorativo clase MGCSS-Universidad de Huelva
 */
package mgcss.conversor;


public class longitud {
    /**
     * M√©todo que convierte millas brit√°nicas a kil√≥metros del sistema m√©trico
     * @param milla double indica las millas que deseamos convertir
     * @return double valor en kil√≥metros
     */
    public static double milla(double milla){
              return (milla*1.61);
    }
    // TODO resto de m√©todos
    
    /**
     * MÈtodo que convierte estadios a km del sistema mÈtrico
     * @param estadio
     * @return kms
     */
    public static double estadios(double estadio){
        return (estadio*201.168/1000);
    }
    
    /**
     * MÈtodo que convierte cadenas brit·nicas a km del sistema mÈtrico
     * @param cadena
     * @return kms
     */
    public static double cadenas(double cadena){
        return (cadena/0.0201);
    }
    
    /**
     * MÈtodo que convierte barras brit·nicas a km del sistema mÈtrico
     * @param barra
     * @return kms
     */
    public static double barras(double barra){
        return (barra/0.0050292);
    }
    
    /**
     * MÈtodo que convierte yardas brit·nicas a km del sistema mÈtrico
     * @param yarda
     * @return kms
     */
    public static double yardas(double yarda){
        return (yarda/0.0009);
    }
    
    /**
     * MÈtodo que convierte pies brit·nicos a km del sistema mÈtrico
     * @param pie
     * @return kms
     */
    public static double pies(double pie){
        return (pie/0.0003);
    }
    
    /**
     * MÈtodo que convierte manos brit·nicas a km del sistema mÈtrico
     * @param mano
     * @return kms
     */
    public static double manos(double mano){
        return (mano/0.0003);
    }
}
