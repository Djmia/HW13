import java.util.Scanner;

public class TablicaUmnojenie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Въведи число, за принтиране \nна таблицата за умножение:");
        System.out.println("===============================");
        int number = input.nextInt();
        System.out.println("================================");
        tabbleUmnojenie(number, 1);
    }


    public static int tabbleUmnojenie(int number, int mnojitel) {
        if (mnojitel <= 10) {
            System.out.println(number + " * " + mnojitel + " = " + number * mnojitel);
            tabbleUmnojenie(number, mnojitel + 1);
            return 1;
        } else {
            return 0;
        }
    }
}
