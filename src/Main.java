import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tareas tareas = new Tareas("");
        int opcion = 0;
        do {
            System.out.println("---------------------------lista de tareas---------------------------");
            System.out.println();
            System.out.println("1.Añadir tarea");
            System.out.println();
            System.out.println("2.Ver lista de tareas pendientes");
            System.out.println();
            System.out.println("3.Marcar tarea como completada");
            System.out.println();
            System.out.println("4.Eliminar tarea");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
            } else {
                System.out.println("Opcion no valida");
                sc.next();
                continue;
            }
            if (opcion > 5 || opcion < 1) {
                System.out.println("Opcion no valida");
            } else {
                switch (opcion) {
                }
            }
            switch (opcion) {
                case 1 -> tareas.añadirTarea();
                case 2 -> tareas.verLista();
                case 3 -> tareas.marcarCompletada();
                case 4 -> tareas.eliminarTarea();
            }
        } while (opcion != 5);
    }
}