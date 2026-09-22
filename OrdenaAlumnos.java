import java.util.Scanner;

public class OrdenaAlumnos {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int numAlumnos = sc.nextInt();
        int[] calificaciones = new int[numAlumnos];

        int i = 0;
        while (i < numAlumnos) {
            calificaciones[i] = sc.nextInt();
            i++;
        }
        i = 0;
        while (i < numAlumnos - 1) {
            int j = i + 1;
            while (j < numAlumnos) {
                if (calificaciones[i] < calificaciones[j]) {
                    int auxiliar = calificaciones[i];
                    calificaciones[i] = calificaciones[j];
                    calificaciones[j] = auxiliar;
                }
                j++;
            }
            i++;
        }
        i = 0;
        while (i < numAlumnos) {
            if (i > 0) {
                System.out.print(" ");
            }
                System.out.print(calificaciones[i]);
            i++;
        }
    }
}
