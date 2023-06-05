import java.util.Scanner;

public class use_of_2d_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter rows = ");
        int rows = sc.nextInt();
        System.out.print("Enter coloums = ");
        int coloums = sc.nextInt();
        System.out.println();

        int matrix[][] = new int[rows][coloums];
        int i,j;

        for (i = 0; i < matrix.length; i++) {  // nested loop for input the matrix values
            for (j = 0; j< coloums; j++) {
                System.out.print("number ["+i+"]["+j+"] = ");
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Matrix is : "+"\n");
        
        for (i = 0; i < matrix.length; i++) {  // nested loop to print the matrix values
            for (j = 0; j< coloums; j++) {
                // System.out.print("["+i+"]["+j+"] = ");
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.print("Enter number which you want to to search : ");
        int x = sc.nextInt();
        int count = 0;
        for (i = 0; i < matrix.length; i++) {  // nested loop for input the matrix values
            for (j = 0; j< coloums; j++) {
                if(x == matrix[i][j]){
                    System.out.println(x+" is found at index ["+i+"]["+j+"]");
                    count++;
                    break;
                }
            }
        }
        if(count == 0){
            System.out.println(x+" is not present in the matrix.");
        }
        System.out.println();
        sc.close();
    }
}
