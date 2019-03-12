/**
 * Métodos para convertir unidades de volumen del sistema británico a litros del sistema métrico
 * Esta clase implementa los métodos para convertir barril, picotazo, galón, cuarto de galón y onza líquita a litros
 * @author: Ezequiel Santana González-Proyecto colavorativo clase MGCSS-Universidad de Huelva
 */
package mgcss.conversor;

public class volumen {
    
    /**
     * Método que convierte barril británicas a litros del sistema métrico
     * @param barril double indica los barriles que deseamos convertir
     * @return double valor en litros
     */
    public static double barril(double barril){
              return (barril*159.11315);
    }
      /**
     * Método que convierte picotazo británicas a litros del sistema métrico
     * @param picotazo double indica los picotazo que deseamos convertir
     * @return double valor en litros
     */
    public static double picotazo(double picotazo){
              return (picotazo*9.0922);
    }
      /**
     * Método que convierte galón a litros del sistema métrico
     * @param galón double indica los galones que deseamos convertir
     * @return double valor en litros
     */
    public static double galon(double galon){
              return (galon*4.54609);
    }
    
      /**
     * Método que convierte  cuarto de galón británicas a litros del sistema métrico
     * @param cuarto de galón double indica los cuarto de galones que deseamos convertir
     * @return double valor en litros
     */
    public static double cuagalon(double cuagalon){
              return (cuagalon*1.136523);
    }
      /**
     * Método que convierte onza británicas a litros del sistema métrico
     * @paramonza double indica las onzas que deseamos convertir
     * @return double valor en litros
     */
    public static double onza(double onza){
              return (onza*0.02841306);
    }
    
    // TODO resto de métodos
}
