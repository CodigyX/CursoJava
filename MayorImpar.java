import java.util.Scanner;

public class MayorImpar {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);

        int mayor = 0;
        boolean encontroImpar = false;

        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            if (num % 2 != 0) {
                if (!encontroImpar || num > mayor) {
                    mayor = num;
                    encontroImpar = true;
                }
            }
        }
        System.out.println(mayor);
    }
}
