import java.util.ArrayList;
import java.util.Scanner;

public class inicio {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarMenu();
    }

    static void mostrarMenu() {
        boolean mostrar_menu = true;
        System.out.println("****Inicio Programa****");

        while (mostrar_menu) {
            System.out.println("1. Probando Array");
            System.out.println("2. Probando Arraylist");
            System.out.println("3. salir");

            System.out.println("Ingrese una opcion: ");
            String opcion_menu = sc.nextLine();

            switch (opcion_menu) {
                case "1":
                    probandoArray();
                    break;

                case "2":
                    probandoArrayList();
                    break;


                default:
                    break;
            }

        }

    }

    static void probandoArray(){
        System.out.println("///////Estudiantes//////////");

        String[] alumnos = new String[6];
        alumnos[0] = "Fernando Macias" ;
        alumnos[1] = "Tomás Barría" ;
        alumnos[2] = "Selena Figueroa" ;
        alumnos[3] = "Cristian Mancilla" ;
        alumnos[4] = "Francisco Almonacid" ;
        alumnos[5] = "Manuel Vivar" ;


        Integer[] edades = new Integer[6];
        edades[0] = 23;
        edades[1] = 18;
        edades[2] = 20;
        edades[3] = 19;
        edades[4] = 20;
        edades[5] = 20;
       
        //System.out.println("El estudiante " + alumnos[0] + " tiene " + edades[1]);


        for (int i = 0; i < 6; i++) {                                                      //si quieres usar edades.length siempre hayq ponerle un -1 "edades.length -1"
            System.out.println("El estudiante " + alumnos[i] + " tiene " + edades[i]);
        }
    }


    static void probandoArrayList(){
        System.out.println("*********Probando ArrayList**********");

        ArrayList<String> alumnos = new ArrayList<>();
        alumnos.add("Rogelio Huichacura");
        alumnos.add("Zinedine Argel");
        alumnos.add("Gabriel Viveros");
        alumnos.add("Andrew Farías");
        alumnos.add("Nicole Aguilar");
        alumnos.add("Daniel Opazo");

        System.out.println(alumnos.get(5));

        alumnos.set(5, "PuLy");

        System.out.println(alumnos.get(5));

        alumnos.remove(4);

        System.out.println(alumnos.get(4));


        for (String por_cada_alumno : alumnos) {
            System.out.println(por_cada_alumno);
            
        }


    }

}
