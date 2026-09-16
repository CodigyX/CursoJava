import java.util.Scanner;

public class Comparaciones {
    public static void main(String[] args) {
        int primero=0;
        int segundo=0;

        Scanner sc = new Scanner(System.in);

        primero = sc.nextInt();
        segundo = sc.nextInt();

        String mensaje = (primero == segundo) ? "iguales"
                       : (primero > segundo) ? "mayor" : "menor";

        System.out.println(mensaje);

    }
}
