import java.util.Scanner;

public class SumaImparLimite {
    public static void main(String[] args) {
            int num1;
            int num2;
            int suma = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese un número");
            num1 = sc.nextInt();

            System.out.println("Ingrese un segundo número");
            num2 = sc.nextInt();

        int inicio = Math.min(num1, num2);
        int fin = Math.max(num1, num2);

            for (int i = inicio; i <= fin; i++) {
                if (i % 2 == 1) {
                    suma += i;
                }
            }
            System.out.printf("La suma de los impares entre los números  %d y %d es %d", inicio, fin, suma);
        }
    }

