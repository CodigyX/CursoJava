import java.util.Scanner;

public class MaximoDeTres {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int maximo = A;

        if (B > maximo){
            maximo = B;
        }
        if (C > maximo){
            maximo = C;
        }
        System.out.print(maximo);
    }
}
