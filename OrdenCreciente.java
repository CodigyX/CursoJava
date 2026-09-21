import java.util.Scanner;

public class OrdenCreciente {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);

        int numDatos = sc.nextInt();
        int [] creciente = new int [numDatos];
        boolean esCreciente = true;

        for (int i = 0; i < numDatos; i++) {
            creciente[i] = sc.nextInt();
        }
        for (int i=0; i<numDatos - 1;i++) {
            if(creciente[i] >= creciente [i+1]){
                esCreciente = false;
                break;
            }
        }
        System.out.print(esCreciente ? "SI" : "NO");
    }
}
