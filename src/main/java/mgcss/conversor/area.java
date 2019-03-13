/**
 * Métodos para convertir unidades de volumen del sistema británico a litros del sistema métrico
 * Esta clase implementa los métodos para convertir yarda, acre, cho, tann a metro cuadrado
 * @author: Alvaro Acebes Ruiz - Proyecto colavorativo clase MGCSS-Universidad de Huelva
 */
package mgcss.conversor;

public class area {
    // TODO resto de métodos
    
    /**
     * Método que convierte yarda del sistema británico a litros del sistema métrico
     * @param yarda double indica las yardas que deseamos convertir
     * @return double valor en metros cuadrados
     */
    public static double yarda(double yarda)
    {
        return (yarda*0.836127);       
    }
    
        /**
     * Método que convierte acre del sistema británico a litros del sistema métrico
     * @param acre double indica los acre-pies que deseamos convertir
     * @return double valor en metros cuadrados
     */
    public static double acre(double acre)
    {
        return (acre*4046.86);
    }
    
    /**
     * Método que convierte cho del sistema británico a litros del sistema métrico
     * @param cho double indica los chos que deseamos convertir
     * @return double valor en metros cuadrados
     */
    public static double cho(double cho)
    {
        return (cho*0.01);
    }
    
    /**
     * Método que convierte tann del sistema británico a litros del sistema métrico
     * @param tann double indica los tann que deseamos convertir
     * @return double valor en metros cuadrados
     */
    public static double tann (double tann)
    {
        return (tann*0.000992);
    }
    
    
}