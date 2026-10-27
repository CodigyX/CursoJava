import java.util.Scanner;

public class GestorDeTareas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int totalPrioridad = 0;

        do {
            System.out.println("==== Gestor de Tareas ===");
            System.out.println("1.- Agregar tarea");
            System.out.println("2.- Ver tareas (pendiente)");
            System.out.println("3.- Salir");

            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar

            switch (opcion) {
                case 1:
                    System.out.print("Nombre de la tarea: ");
                    String nombreTarea = sc.nextLine();

                    System.out.print("Prioridad (1 a 5): ");
                    int prioridad = sc.nextInt();
                    sc.nextLine();

                    if (prioridad >= 1 && prioridad <= 5) {
                        totalPrioridad += prioridad; //se acumula la prioridad
                        System.out.println("Tarea: '" + nombreTarea + "' con prioridad " + prioridad + " agregada.");
                        System.out.println("Suma total de prioridades: " + totalPrioridad);
                    } else {
                        System.out.println("Prioridad no válida");
                    }
                    break;
                case 2:
                    System.out.println("Función 'ver tareas' aún no implementada.");
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        } while (opcion != 3);
        sc.close();
    }
}
