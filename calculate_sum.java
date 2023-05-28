import java.util.Scanner;

public class calculate_sum {
    public static int calculate_sum(int a , int b) {
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        int sum = calculate_sum(a, b);
        System.out.print("Sum is : ");
        System.out.println(sum);
    }
}
