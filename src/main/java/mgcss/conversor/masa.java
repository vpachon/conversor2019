/**
 * Métodos para convertir unidades de masa del sistema japonés y chino a kilogramos del sistema métrico
 * Esta clase implementa los métodos para convertir koku, kann, kinn, monnme, tael y ku ping a kilogramos
 * @author: Equipo <indicar equipo> Proyecto colavorativo clase MGCSS-Universidad de Huelva
 */
package mgcss.conversor;

public class masa {
    // TODO resto de métodos
    
    
    
    /**
     * Método que convierte koku del sistema japonés y chino a kilogramos del sistema métrico
     * @param milla double indica las millas que deseamos convertir
     * @return double valor en kilómetros
     */
    public static double koku(double koku){
        return (koku*180.41);       
    }
    
    /**
     * Método que convierte kann del sistema japonés y chino a kilogramos del sistema métrico
     * @param milla double indica las millas que deseamos convertir
     * @return double valor en kilómetros
     */
    public static double kann(double kann){
        return (kann*3.75);       
    }
    
     /**
     * Método que convierte kinn del sistema japonés y chino a kilogramos del sistema métrico
     * @param milla double indica las millas que deseamos convertir
     * @return double valor en kilómetros
     */
    public static double kinn(double kinn){
        return (kinn*0.6);       
    }
    
     /**
     * Método que convierte monnme del sistema japonés y chino a kilogramos del sistema métrico
     * @param milla double indica las millas que deseamos convertir
     * @return double valor en kilómetros
     */
    public static double monnme(double monnme){
        return (monnme*0.0375);       
    }
    
    /**
     * Método que convierte tael del sistema japonés y chino a kilogramos del sistema métrico
     * @param milla double indica las millas que deseamos convertir
     * @return double valor en kilómetros
     */
    public static double tael(double tael){
        return (tael*0.04);       
    }
    
    /**
     * Método que convierte ku_ping del sistema japonés y chino a kilogramos del sistema métrico
     * @param milla double indica las millas que deseamos convertir
     * @return double valor en kilómetros
     */
    public static double ku_ping(double ku_ping){
        return (ku_ping*0.04);       
    }
}


