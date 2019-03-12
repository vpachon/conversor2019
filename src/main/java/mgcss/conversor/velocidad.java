/**
 * Métodos para convertir unidades de velocidad a kilómetros por hora
 * Esta clase implementa los métodos para convertir millas por segundo, millas por hora, pies por segundo, nudos naúticos,
 * velocidad de la luz, velocidad del sonido, caminata rápida y velocidad del caracol de jardín a kilómetros por hora
 *
 * @author: Equipo <indicar equipo> Proyecto colavorativo clase
 * MGCSS-Universidad de Huelva
 */
package mgcss.conversor;

public class velocidad {
    // TODO resto de métodos 

    public static double millass(double milla) {
        return (milla * 5793.64);
    }

    public static double millash(double milla) {
        return (milla * 1.60934);
    }

    public static double pies(double pie) {
        return (pie * 1.09728);
    }

    public static double nudos(double nudo) {
        return (nudo * 1.852);
    }

    public static long luz(double luz) {
        return (long) (luz * 1079252848.8);
    }

    public static long sonido(double sonido) {
        return (long) (sonido * 1234.8);
    }

    public static double caminata(double caminata) {
        return (caminata * 6.5);
    }

    public static double caracol(double caracol) {
        return (caracol * 0.01);
    }
}
