/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Docente;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReporteDocente extends Reporte {

    double promedioSueldos;
    ArrayList<Docente> lista;

    public ReporteDocente(String s) {
        super(s);
    }

    public void setLista(ArrayList<Docente> listado) {
        lista = listado;
    }

    public void setPromedioSueldo() {
        for (int i = 0; i < lista.size(); i++) {
            promedioSueldos = promedioSueldos + lista.get(i).getSueldo();
        }
        promedioSueldos = promedioSueldos / lista.size();
    }

    public ArrayList<Docente> getLista() {
        return lista;
    }

    public double getPromedioSuledo() {
        return promedioSueldos;
    }

    @Override
    public String toString() {
        String cadena1 = "";
        for (int i = 0; i < lista.size(); i++) {
            cadena1 = String.format("%s\n%s", cadena1, lista.get(i));
        }
        String cadena2 = String.format("%s\nPromedio general: %.2f", cadena1,
                promedioSueldos);
        return cadena2;
    }
}
