package paquete05;

import java.util.ArrayList;
import java.util.Scanner;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de docentes. 
        El usuario decide cuando termina el preceso
        
         */
        Scanner sc = new Scanner(System.in);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante;
        String continuar;
        int contador;
        ArrayList<Estudiante> estudiantes = new ArrayList<>(); // Creamos un Array 
        // para poder guardar varios datos sin tener un limite espesificado 

        // inicio de solución
        do {
            System.out.println("Ingrese el tipo de estudiate que desea (1)"
                    + "Precencial, (2)Distancia: ");
            tipoEstudiante = sc.nextInt();
            // El usiario ingresa lo que desea

            sc.nextLine();

            System.out.println("Ingrese los nombres del estudiante");
            nombresEst = sc.nextLine();
            System.out.println("Ingrese los apellidos del estudiante");
            apellidosEst = sc.nextLine();
            System.out.println("Ingrese la identificación del estudiante");
            identificacionEst = sc.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            edadEst = sc.nextInt();

            if (tipoEstudiante == 1) {// comparamos la respuetsa del usuario
                EstudiantePresencial estP = new EstudiantePresencial();
                // Creamos un objeto de tipo EstudiantePresencial

                System.out.println("Ingrese el número de créditos");
                numeroCreds = sc.nextInt();
                System.out.println("Ingrese el costo de cada créditos");
                costoCred = sc.nextDouble();
                sc.nextLine();

                estP.establecerNombresEstudiante(nombresEst);
                estP.establecerApellidoEstudiante(apellidosEst);
                estP.establecerIdentificacionEstudiante(identificacionEst);
                estP.establecerEdadEstudiante(edadEst);
                estP.establecerNumeroCreditos(numeroCreds);
                estP.establecerCostoCredito(costoCred);
                // Le enviamos los datos a la clase pestinente

                estP.calcularMatricula();

                estudiantes.add(estP);
                // Llenamos el Array

            } else {
                if (tipoEstudiante == 2) {// comparamos la respuetsa del usuario

                    EstudianteDistancia estD = new EstudianteDistancia();
                    // Creamos un objeto de tipo EstudianteDistancia

                    System.out.println("Ingrese el número de asignaturas");
                    numeroAsigs = sc.nextInt();
                    System.out.println("Ingrese el costo de cada cada asignatura");
                    costoAsig = sc.nextDouble();
                    sc.nextLine();

                    estD.establecerNombresEstudiante(nombresEst);
                    estD.establecerApellidoEstudiante(apellidosEst);
                    estD.establecerIdentificacionEstudiante(identificacionEst);
                    estD.establecerEdadEstudiante(edadEst);
                    estD.establecerNumeroAsginaturas(numeroAsigs);
                    estD.establecerCostoAsignatura(costoAsig);
                    // Le enviamos los datos a la clase pestinente

                    estD.calcularMatricula();

                    estudiantes.add(estD);
                    // Llenamos el Array
                }
            }

            System.out.println("Desea ingresar más estudiante. Digite la "
                    + "letra S para continuar o digite la letra N para salir "
                    + " del proceso ");
            continuar = sc.nextLine();
        } while (continuar.equals("S"));// Comparamos denuevo la respuesta y 
                                        // acaba el programa

        // ciclo que permite comprobar el polimorfismo
        // este código no debe ser modificado.
        for (int i = 0; i < estudiantes.size(); i++) {
            // 1.  
            estudiantes.get(i).calcularMatricula();

            System.out.printf("Datos Estudiante\n"
                    + "%s\n",
                    estudiantes.get(i));

        }
    }

}
