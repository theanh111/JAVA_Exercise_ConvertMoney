import java.util.Scanner;

public class CovertMoney {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Convert USD to VND:");
        int number = input.nextInt();
        int rate = 23000;
        System.out.println("Converted: " + number * rate + " VND");
    }
}
