import java.util.Scanner;

public class ExcursionistaMayor {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int numExcursionista = sc.nextInt();
        int mayor = 0;

        for (int i=0; i<numExcursionista; i++){
            int edad = sc.nextInt();
            if (mayor < edad){
                mayor = edad;
            }
        }
        System.out.print(mayor);
    }
}
