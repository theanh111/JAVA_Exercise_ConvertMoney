import java.util.Scanner;

public class CovertMoney {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Convert USD to VND:");
        double number = input.nextInt();
        double rate = 23000;
        System.out.println("Converted: " + number * rate + " VND");
    }
}
