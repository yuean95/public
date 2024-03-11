import java.util.Scanner;

public class JPA03 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        repeat();
        repeat();
        sc.close();
    }

    public static void repeat(){
        int input;
        System.out.println("Input an integer:");
        input=sc.nextInt();
        if(input%2==0)
            System.out.println("The number is even");
        else if(input%2==1)
            System.out.println("The number is odd");
    }
}
