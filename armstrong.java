
import java.util.Scanner;

public class armstrong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int digits = 0;
        int sum = 0;

        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + (int) Math.pow(digit, digits);
            temp = temp / 10;
        }

        if (sum == num) {
            System.out.println(num + " is an Armstrong Number"); 
        }else {
            System.out.println(num + " is NOT an Armstrong Number");
        }
    }
}
