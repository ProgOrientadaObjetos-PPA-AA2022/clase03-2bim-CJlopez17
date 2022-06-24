/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import java.util.ArrayList;
import herencia2.Estudiante;

/**
 *
 * @author reroes
 */
public class ReporteEstudiante extends Reporte {

    double promedioMatriculas;
    ArrayList<Estudiante> lista;

    public ReporteEstudiante(String s) {
        super(s);
    }

    public void setPromedioMatriculas() {
        for (int i = 0; i < lista.size(); i++) {
            promedioMatriculas = promedioMatriculas
                    + lista.get(i).getMatricula();
        }
        promedioMatriculas = promedioMatriculas / lista.size();
    }

    public void setLista(ArrayList c) {
        lista = c;
    }

    public double getPromedioMatriculas() {
        return promedioMatriculas;
    }

    public ArrayList getLista() {
        return lista;
    }

    @Override
    public String toString() {

        String cadena2 = "";
        for (int i = 0; i < lista.size(); i++) {
            cadena2 = String.format("%s\n%s", cadena2, lista.get(i));
        }
        String cadena = String.format("%s\n"
                + "Promedio general: %.2f", cadena2,
                promedioMatriculas);

        return cadena;
    }
}
