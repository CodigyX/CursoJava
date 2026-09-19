import java.util.Scanner;

public class MayorImpar {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);

        int mayor = 0;

        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            if (num % 2 != 0) {
                if (num > mayor)
                    mayor = num;
            }
        }
        System.out.println(mayor);
    }
}
