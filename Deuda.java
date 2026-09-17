import java.util.Scanner;

public class Deuda {
    public static void main(String[] args) {
        int deuda = 0;
        int pagos = 0;

        Scanner sc = new Scanner(System.in);

        deuda = sc.nextInt();
        pagos = sc.nextInt();

        for (int i=0; i < pagos; i++){
            int abono = sc.nextInt();
            deuda -= abono;
        }
        System.out.print(deuda);
    }
}
