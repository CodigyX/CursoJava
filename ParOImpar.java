import java.util.Scanner;

public class ParOImpar {
    public static void main (String [] args){

        int num = 0;

         Scanner sc = new Scanner (System.in);

         num = sc.nextInt();

         String mensaje = (num%2 == 0) ? "par" : "impar";

         System.out.println(mensaje);

    }
}
