import java.util.Scanner;


public class CofreYTablillaLapizlazuli {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] tablilla = {
                sc.nextInt(),
                sc.nextInt(),
                sc.nextInt()
        };
        int[] cofre = {
                sc.nextInt(),
                sc.nextInt(),
                sc.nextInt(),
        };

        for (int i = 0; i < tablilla.length - 1; i++) {

            for (int j = i + 1; j < tablilla.length; j++) {
                if (tablilla[i] > tablilla[j]) {
                    int aux = tablilla[i];
                    tablilla[i] = tablilla[j];
                    tablilla[j] = aux;
                }
            }
        }
        for(int i = 0; i< cofre.length -1; i++){
            for(int j=i+1; j < cofre.length; j++){
                if (cofre[i] > cofre [j]){
                    int aux = cofre [i];
                    cofre[i] = cofre [j];
                    cofre[j] = aux;
                }
            }
        }
        boolean cabe =
                tablilla [0] <= cofre[0]
                && tablilla [1] <= cofre[1]
                && tablilla [2] <= cofre[2];

        System.out.print(cabe ? 1 : 0);

    }
}
