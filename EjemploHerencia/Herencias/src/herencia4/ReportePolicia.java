/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Policia;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReportePolicia extends Reporte {

    double promedioEdades;
    ArrayList<Policia> lista;

    public ReportePolicia(String s) {
        super(s);
    }

    public void setPromedioEdades() {
        for (int i = 0; i < lista.size(); i++) {
            promedioEdades = promedioEdades + lista.get(i).getEdad();
        }
        promedioEdades = promedioEdades / lista.size();
    }

    public void setListas(ArrayList f) {
        lista = f;
    }

    public double getPromedioEdades() {
        return promedioEdades;
    }

    public ArrayList getLista() {
        return lista;
    }

    @Override
    public String toString() {
        String cadena1 = " ";
        for (int i = 0; i < lista.size(); i++) {
            cadena1 = String.format("%s\n%s", cadena1, lista.get(i));
        }
        String cadena2 = String.format("%s\n Promedio general: %.2f\n", cadena1,
                promedioEdades);
        return cadena2;
    }
}
