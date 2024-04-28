import java.util.Scanner;

public class SumarImpar {
    public static void main(String[] args) {
        int num;
        int suma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        num = sc.nextInt();

        for(int i = 0; i <= num; i++) {
            if(i % 2 == 1) {
                suma += i;
            }
        }
        System.out.println("La suma de los impares es: " + suma);
    }

}

