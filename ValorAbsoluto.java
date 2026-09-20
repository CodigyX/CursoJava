import java.util.Scanner;

public class ValorAbsoluto {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int suma = M + N;
     if (suma < 0){
         suma *= -1;
     }
     System.out.print(suma);
    }
}
