import java.util.Scanner;

public class GestorDeTareas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int totalPrioridad = 0;

        do {
            mostrarMenu();
            opcion = leerOpcion(sc);
            totalPrioridad = ejecutarOpcion(opcion, sc, totalPrioridad);

        } while (opcion != 3);

        sc.close();
    }

    public static void mostrarMenu() {
        System.out.println("==== Gestor de Tareas ===");
        System.out.println("1.- Agregar tarea");
        System.out.println("2.- Ver tareas (pendiente)");
        System.out.println("3.- Salir");
    }

    public static int leerOpcion(Scanner sc) {
        System.out.print("Seleccione una opción: ");
        return sc.nextInt();
    }

    public static int ejecutarOpcion(int opcion, Scanner sc, int totalPrioridad) {
        sc.nextLine(); // limpiar

        switch (opcion) {
            case 1:
                totalPrioridad = agregarTarea(sc, totalPrioridad);
                break;
            case 2:
                System.out.println("Función en desarrollo...");
                break;
            case 3:
                System.out.println("¡Hasta luego!");
                break;
            default:
                System.out.println("Opción inválida. Intenta de nuevo.");
        }
        return totalPrioridad;
    }

    public static int agregarTarea(Scanner sc, int totalPrioridad) {

        System.out.print("Nombre de la tarea: ");
        String nombreTarea = sc.nextLine();

        System.out.print("Prioridad (1 a 5): ");
        int prioridad = sc.nextInt();
        sc.nextLine();

        if (prioridad >= 1 && prioridad <= 5) {
            totalPrioridad += prioridad; //se acumula la prioridad
            System.out.println("Tarea: '" + nombreTarea + "' agregada con prioridad " + prioridad);
            System.out.println("Suma total de prioridades: " + totalPrioridad);
        } else {
            System.out.println("Prioridad no válida");
        }
        return totalPrioridad;
    }

    // Clase auxiliar para retornar múltiples valores
    public static class Resultado {
        int totalPrioridad;
        Actividad tarea;

        public Resultado(int totalPrioridad, Actividad tarea) {
            this.totalPrioridad = totalPrioridad;
            this.tarea = tarea;

        }
    }
}
