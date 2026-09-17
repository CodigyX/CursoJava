import java.util.Scanner;

public class NivelOptimo {
    public static void main(String [] args){
        int primero = 0;
        int segundo = 0;

        Scanner sc = new Scanner (System.in);

        primero = sc.nextInt();
        segundo = sc.nextInt();

        if (primero > segundo){

            System.out.println(2 + " " + (primero - segundo));
        }else if (primero < segundo){
            System.out.println(1 + " " + (segundo - primero));
        }else {
            System.out.println("Nivel Optimo");
        }
    }
}
