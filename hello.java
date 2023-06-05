import java.util.*;
public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int sum = a+b;
//        System.out.println(sum);

//        int a=10;
//        int b=13;
//        int sum=a+b;
//        System.out.println(sum);
          int age = sc.nextInt();

          if(age>18){
              System.out.println("adult");
          }else if(age<=18){
              System.out.println("teenager");
        }else{
              System.out.println("old");
          }
          sc.close();
    }

}