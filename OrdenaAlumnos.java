import java.util.Scanner;

public class OrdenaAlumnos {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int numAlumnos = sc.nextInt();
        int [] calificaciones = new int [numAlumnos];

        int i=0;
        while (i<numAlumnos){
        calificaciones[i] = sc.nextInt();
            i++;
        }
        System.out.print(calificaciones.length);
    }
}
