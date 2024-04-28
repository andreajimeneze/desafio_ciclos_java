//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CambiarWhile {
    public static void main(String[] args) {
        int i = 0;
//        while (i<50) {
//            i+=1;
//            System.out.printf("Iteración %d\n", i);
//        }

        do {
            i+=1;
           System.out.printf("Iteración %d\n", i);
        } while (i < 50);
        System.out.println("fin");
    }
}