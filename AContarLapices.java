import java.util.Scanner;

public class AContarLapices {
    public static void main(String[] args) {

        int cantidad = 0;
        int buscado = 0;
        int contador = 0;
        int lapiz = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos lapices son?");
        cantidad = sc.nextInt();
        System.out.println("¿Qué número de lápiz buscaremos?");
        buscado = sc.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingresa el número de este lápiz");
            lapiz = sc.nextInt();
            if (lapiz == buscado) contador++;
        }
        System.out.println(contador);
    }
}
