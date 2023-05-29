import java.util.Scanner;

public class factorial {
    public static void facto(int n) {
        int fact = 1;
        if(n < 0){
            System.out.println("invalid number");
            return;
        }
        if(n==0){
            System.out.println(n+1);
            return;
        }
        for(int i = n; i>=1; i--){
            fact = fact * i;
        }
        System.out.println("factorial of "+ n +" is : "+fact);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        facto(n);
        sc.close();
        return;
    }
}
