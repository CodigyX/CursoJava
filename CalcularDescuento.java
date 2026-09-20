import java.util.Scanner;

public class CalcularDescuento {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        double total = sc.nextDouble();

        if (total > 1000){
            total = (total * 85 / 100);
        }
                System.out.print(total);
    }
}
