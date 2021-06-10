import java.util.Scanner;

public class Seudo4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        int edad = 0;
        System.out.println("Ingrese las edades de los participantes");
        for (int x = 0; x < 20; x++) {
            edad = scanner.nextInt();
            if (x == 1) {
                min = edad;
                max = edad;
            }
            if (edad < min) {
                min = edad;
            }
            if (edad > max) {
                max = edad;
            }
        }
        System.out.println("La persona mayor es " + max + " y la persona menor es " + min);
    }
}