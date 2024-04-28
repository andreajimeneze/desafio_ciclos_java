import java.util.Scanner;

public class SoloPares {
    public static void main(String[] args) {
        int num;
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        num = sc.nextInt();

// Muestra los primeros números pares tantas veces como el número ingresado (incluyeno 0)
//        for(int i = 0; contador < num; i++) {
//            if(i % 2 == 0) {
//                System.out.println("Numero par:" + i);
//                contador++;
//            }
//        }

// Muestra los primeros números pares tantas veces como el número ingresado (sin incluir 0)
        for (int i = 1; contador < num; i++) {
            if (i % 2 == 0) {
                System.out.println("Numero par:" + i);
                contador++;
            }
        }
    }
}
