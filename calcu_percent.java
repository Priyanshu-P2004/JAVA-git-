import java.util.*;
public class calcu_percent {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter calculate number of 5 subject");
        System.out.print("num of hindi : ");
        float a =sc.nextFloat();   
        System.out.print("num of english : ");
        float b =sc.nextFloat(); 
        System.out.print("num of math : "); 
        float c =sc.nextFloat();
        System.out.print("num of chemistry : ");
        float d =sc.nextFloat(); 
        System.out.print("num of physics : "); 
        float e =sc.nextFloat();
        float sum =a+b+c+d+e;
        float percent=(sum*100)/500;
        System.out.print(percent);
        System.out.print("%");
        sc.close();
    }
}
