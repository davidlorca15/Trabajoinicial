import java.util.ArrayList;
import java.util.Scanner;

public class Tareas {
    ArrayList<String> listaTareas = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    String descripcion;
    boolean marcado;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Tareas(String descripcion) {
        this.descripcion = descripcion;
        this.marcado = false;
    }

    public void añadirTarea() {
        System.out.println("introduce una descripción: ");
        descripcion = sc.nextLine();
        System.out.println(" ");
        listaTareas.add(descripcion);
    }

    public void verLista() {
        for (int i = 0; i < listaTareas.size(); i++) {
            System.out.println((i + 1) + ". " + listaTareas.get(i));
        }
    }

    public void marcarCompletada() {
        verLista();

        System.out.println("¿Qué tarea quieres completar?");

        if (sc.hasNextInt()) {

            int numero = sc.nextInt();

            if (numero >= 1 && numero <= listaTareas.size()) {
                listaTareas.remove(numero - 1);
                System.out.println("Tarea completada");
            } else {
                System.out.println("Opción no válida");
            }

        } else {
            System.out.println("Opción no válida");
            sc.next();
        }
    }

    public void eliminarTarea() {
        verLista();

        System.out.println("¿Qué tarea quieres eliminar?");

        if (sc.hasNextInt()) {

            int numero = sc.nextInt();

            if (numero >= 1 && numero <= listaTareas.size()) {
                listaTareas.remove(numero - 1);
                System.out.println("Tarea eliminada");
            } else {
                System.out.println("Opción no válida");
            }

        } else {
            System.out.println("Opción no válida");
            sc.next();
        }
    }
}


